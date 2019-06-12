package com.lxisoft.web.rest;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.lxisoft.client.karma_app.ClientConfiguration;
import com.lxisoft.client.karma_app.api.AggregateQueryResourceApi;
import com.lxisoft.client.karma_app.model.ActivityDTO;
import com.lxisoft.client.karma_app.model.CompletedActivityDTO;
import com.lxisoft.client.karma_app.model.InstructionVideoDTO;
import com.lxisoft.client.karma_app.model.MediaDTO;
import com.lxisoft.client.karma_app.model.RegisteredUserDTO;
import com.lxisoft.model.ActivityModel;
import com.lxisoft.model.CompletedActivityModel;
import com.lxisoft.model.InstructionVideoModel;
import com.lxisoft.model.MediaModel;
import com.lxisoft.model.RegisteredUserModel;

@RestController
@RequestMapping("/api")
public class AggregateQueryResource {
	private final Logger log = LoggerFactory.getLogger(AggregateQueryResource.class);

	private AggregateQueryResourceApi aggregateQueryResourceApi;
	
	//private AuthorizedFeignClient authorizedFeignClient;

	public AggregateQueryResource(AggregateQueryResourceApi aggregateQueryResourceApi) {
		this.aggregateQueryResourceApi = aggregateQueryResourceApi;
	}

	/**
	 * GET /registered-users : get all the registeredUsers.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         registeredUsers in body
	 */

	@GetMapping("/query/registered-users")
	@Timed
	public ResponseEntity<List<RegisteredUserModel>> getAllRegisteredUsers(Pageable pageable) {
		log.debug("REST request to get a page of RegisteredUsers");
		List<RegisteredUserDTO> list = aggregateQueryResourceApi
				.getAllRegisteredUsersUsingGET(null, null, null, null, null, null, null, null, null, null).getBody();
		List<RegisteredUserModel> registeredUserModels = new ArrayList<RegisteredUserModel>();

		System.out.println("*****************" + list);

		for (RegisteredUserDTO registeredUserDTO : list) {
			MediaDTO mediaDTO = null;
			if (registeredUserDTO.getProfilePicId() != null) {
				mediaDTO = aggregateQueryResourceApi.getMediaByIdUsingGET(registeredUserDTO.getProfilePicId())
						.getBody();
			}
			RegisteredUserModel registeredUserModel = new RegisteredUserModel();
			registeredUserModel = registeredUserModel.setRegisteredUserId(registeredUserDTO.getId())
					.setUserId(registeredUserDTO.getUserId()).setFirstName(registeredUserDTO.getFirstName())
					.setLastName(registeredUserDTO.getLastName()).setEmail(registeredUserDTO.getEmail())
					.setPhoneNumber(registeredUserDTO.getPhoneNumber()).setNoOfCoins(registeredUserDTO.getNoOfCoins())
					.setNoOfBronzeMedals(registeredUserDTO.getNoOfBronzeMedals())
					.setNoOfSilverMedals(registeredUserDTO.getNoOfSilverMedals())
					.setNoOfGoldMedals(registeredUserDTO.getNoOfGoldMedals());
			if (mediaDTO != null) {
				registeredUserModel.setProfilePicId(mediaDTO.getId()).setProfilePicFileName(mediaDTO.getFileName())
						.setProfilePicFile(mediaDTO.getFile())
						.setProfilePicFileContentType(mediaDTO.getFileContentType());
			}
			registeredUserModels.add(registeredUserModel);
		}

		return ResponseEntity.ok().body(registeredUserModels);
	}

	/**
	 * GET /registered-users/:phoneNumber : get the "phoneNumber" registeredUser.
	 *
	 * @param phoneNumber the phoneNumber of the registeredUserDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         registeredUserModel, or with status 404 (Not Found)
	 */

	@GetMapping("/query/registered-users-by-phonenumber/{phoneNumber}")
	@Timed
	public ResponseEntity<RegisteredUserModel> getRegisteredUserByPhoneNumber(@PathVariable Long phoneNumber) {
		log.debug("REST request to get a RegisteredUser by phone number");
		RegisteredUserDTO registeredUserDTO = aggregateQueryResourceApi
				.getRegisteredUserByPhoneNumberUsingGET(phoneNumber).getBody();
		RegisteredUserModel registeredUserModel = new RegisteredUserModel();
		if (registeredUserDTO != null) {
			MediaDTO mediaDTO = null;
			if (registeredUserDTO.getProfilePicId() != null) {
				mediaDTO = aggregateQueryResourceApi.getMediaByIdUsingGET(registeredUserDTO.getProfilePicId())
						.getBody();
			}
			registeredUserModel = registeredUserModel.setRegisteredUserId(registeredUserDTO.getId())
					.setUserId(registeredUserDTO.getUserId()).setFirstName(registeredUserDTO.getFirstName())
					.setLastName(registeredUserDTO.getLastName()).setEmail(registeredUserDTO.getEmail())
					.setPhoneNumber(registeredUserDTO.getPhoneNumber()).setNoOfCoins(registeredUserDTO.getNoOfCoins())
					.setNoOfBronzeMedals(registeredUserDTO.getNoOfBronzeMedals())
					.setNoOfSilverMedals(registeredUserDTO.getNoOfSilverMedals())
					.setNoOfGoldMedals(registeredUserDTO.getNoOfGoldMedals());
			if (mediaDTO != null) {
				registeredUserModel.setProfilePicId(mediaDTO.getId()).setProfilePicFileName(mediaDTO.getFileName())
						.setProfilePicFile(mediaDTO.getFile())
						.setProfilePicFileContentType(mediaDTO.getFileContentType());
			}
		}
		return ResponseEntity.ok().body(registeredUserModel);
	}

	/**
	 * GET /registered-users/:id : get the "id" registeredUser.
	 *
	 * @param id the id of the registeredUserDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         registeredUserModel, or with status 404 (Not Found)
	 */
	@GetMapping("/query/registered-users/{id}")
	@Timed
	public ResponseEntity<RegisteredUserModel> getRegisteredUser(@PathVariable Long id) {
		log.debug("REST request to get RegisteredUser : {}", id);
		RegisteredUserDTO registeredUserDTO = aggregateQueryResourceApi.getRegisteredUserByIdUsingGET(id).getBody();
		// System.out.println("&&&&&&&&&&&&&&&&7" + registeredUserDTO);
		RegisteredUserModel registeredUserModel = new RegisteredUserModel();
		if (registeredUserDTO != null) {
			MediaDTO mediaDTO = null;
			if (registeredUserDTO.getProfilePicId() != null) {
				mediaDTO = aggregateQueryResourceApi.getMediaByIdUsingGET(registeredUserDTO.getProfilePicId())
						.getBody();
			}
			registeredUserModel = registeredUserModel.setRegisteredUserId(registeredUserDTO.getId())
					.setFirstName(registeredUserDTO.getFirstName()).setLastName(registeredUserDTO.getLastName())
					.setEmail(registeredUserDTO.getEmail()).setPhoneNumber(registeredUserDTO.getPhoneNumber())
					.setNoOfCoins(registeredUserDTO.getNoOfCoins())
					.setNoOfBronzeMedals(registeredUserDTO.getNoOfBronzeMedals())
					.setNoOfSilverMedals(registeredUserDTO.getNoOfSilverMedals())
					.setNoOfGoldMedals(registeredUserDTO.getNoOfGoldMedals());

			if (mediaDTO != null) {
				registeredUserModel.setProfilePicId(mediaDTO.getId()).setProfilePicFileName(mediaDTO.getFileName())
						.setProfilePicFile(mediaDTO.getFile())
						.setProfilePicFileContentType(mediaDTO.getFileContentType());
			}
		}
		return ResponseEntity.ok().body(registeredUserModel);
	}

	/**
	 * GET /activities/:activityId : get the "activityId" activity.
	 *
	 * @param activityId the actvityId of the activityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         activityModel, or with status 404 (Not Found)
	 */
	@GetMapping("/query/activity/{activityId}")
	@Timed
	public ResponseEntity<ActivityModel> getActivityById(@PathVariable Long activityId, Pageable pageable) {
		log.debug("REST request to get a activitiy");
		ActivityDTO activityDTO = aggregateQueryResourceApi.getActivityByIdUsingGET(activityId).getBody();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&77" + activityDTO);
		ActivityModel activityModel = new ActivityModel();
		if (activityDTO != null) {
			InstructionVideoDTO instructionVideoDTO = null;
			if (activityDTO.getInstructionVideoId() != null) {
				instructionVideoDTO = aggregateQueryResourceApi
						.getInstructionVideoByIdUsingGET(activityDTO.getInstructionVideoId()).getBody();
			}
			activityModel.setId(activityDTO.getId()).setTitle(activityDTO.getTitle())
					.setDescription(activityDTO.getDescription()).setSuccessMessage(activityDTO.getSuccessMessage())
					.setUrl(activityDTO.getUrl());
			if (instructionVideoDTO != null) {
				activityModel.setInstructionVideoId(instructionVideoDTO.getId());
			}
			/*
			 * .setInstructionVideoFileName(instructionVideoDTO.getFileName())
			 * .setInstructionVideoFile(instructionVideoDTO.getFile())
			 * .setInstructionVideoFileContentType(instructionVideoDTO.getFileContentType())
			 * ;
			 */
		}
		return ResponseEntity.ok().body(activityModel);
	}

	/**
	 * GET /activities : get all the activities.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of activities in
	 *         body
	 */
	@GetMapping("/query/activities")
	@Timed
	public ResponseEntity<List<ActivityModel>> getAllActivities(Pageable pageable) {
		log.debug("REST request to get a page of Activitiy");
		List<ActivityDTO> list = aggregateQueryResourceApi
				.getAllActivitiesUsingGET(null, null, null, null, null, null, null, null, null, null).getBody();
		List<ActivityModel> activityModels = new ArrayList<ActivityModel>();
		for (ActivityDTO activityDTO : list) {
			ActivityModel activityModel = new ActivityModel();
			InstructionVideoDTO instructionVideoDTO = null;
			if (activityDTO.getInstructionVideoId() != null) {
				instructionVideoDTO = aggregateQueryResourceApi
						.getInstructionVideoByIdUsingGET(activityDTO.getInstructionVideoId()).getBody();
			}
			activityModel.setId(activityDTO.getId()).setTitle(activityDTO.getTitle())
					.setDescription(activityDTO.getDescription()).setSuccessMessage(activityDTO.getSuccessMessage())
					.setUrl(activityDTO.getUrl());
			if (instructionVideoDTO != null) {
				activityModel.setInstructionVideoId(instructionVideoDTO.getId());
			}
			/*
			 * .setInstructionVideoFileName(instructionVideoDTO.getFileName())
			 * .setInstructionVideoFile(instructionVideoDTO.getFile())
			 * .setInstructionVideoFileContentType(instructionVideoDTO.getFileContentType())
			 * ;
			 */
			activityModels.add(activityModel);
		}
		return ResponseEntity.ok().body(activityModels);

	}

	/**
	 * GET /completed-activity/:id : get the "completedActivityId"
	 * completedActivity.
	 *
	 * @param completedActivityId the id of the completedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         completedActivityDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/completed-activity/{completedActivityId}")
	@Timed
	public ResponseEntity<CompletedActivityModel> findCompletedActivityById(@PathVariable Long completedActivityId,
			Pageable pageable) throws URISyntaxException {
		log.debug("REST request to get CompletedActivity by id : {}", completedActivityId);

		CompletedActivityDTO completedActivityDTO = aggregateQueryResourceApi
				.getCompletedActivityByIdUsingGET(completedActivityId).getBody();
		CompletedActivityModel completedActivityModel = new CompletedActivityModel();
		if (completedActivityDTO != null) {
			ActivityDTO activityDTO = null;
			if (completedActivityDTO.getActivityId() != null) {
				activityDTO = aggregateQueryResourceApi.getActivityByIdUsingGET(completedActivityDTO.getActivityId())
						.getBody();
			}
			completedActivityModel.setId(completedActivityDTO.getId())
					.setRegisteredUserId(completedActivityDTO.getRegisteredUserId())
					.setActivityId(completedActivityDTO.getActivityId());
			if (activityDTO != null) {
				completedActivityModel.setActivityTitle(activityDTO.getTitle())
						.setActivityDescription(activityDTO.getDescription());
			}
			List<MediaDTO> mediaDTOs = aggregateQueryResourceApi.getMediaByCompletedActivityIdUsingGET(
					completedActivityDTO.getId(), null, null, null, null, null, null, null, null, null, null).getBody();
			completedActivityModel.setProofs(mediaDTOs);
		}

		return ResponseEntity.ok().body(completedActivityModel);

	}

	/**
	 * GET /completed-activity/:registeredUserId : get the "registeredUserId"
	 * completedActivity.
	 *
	 * @param registeredUserId the id of the completedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         completedActivityDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/completed-activity-by-registered-user/{registeredUserId}")
	@Timed
	public ResponseEntity<List<CompletedActivityModel>> findCompletedActivityByRegisteredUserId(
			@PathVariable Long registeredUserId, Pageable pageable) throws URISyntaxException {
		log.debug("REST request to get completedActivity by registeredUderId : {}", registeredUserId);
		List<CompletedActivityDTO> list = aggregateQueryResourceApi.getCompletedActivityByRegisteredUserIdUsingGET(
				registeredUserId, null, null, null, null, null, null, null, null, null, null).getBody();
		List<CompletedActivityModel> completedActivityModels = new ArrayList<CompletedActivityModel>();
		for (CompletedActivityDTO completedActivityDTO : list) {
			CompletedActivityModel completedActivityModel = new CompletedActivityModel();
			ActivityDTO activityDTO = null;
			if (completedActivityDTO.getActivityId() != null) {
				activityDTO = aggregateQueryResourceApi.getActivityByIdUsingGET(completedActivityDTO.getActivityId())
						.getBody();
			}
			completedActivityModel.setId(completedActivityDTO.getId())
					.setRegisteredUserId(completedActivityDTO.getRegisteredUserId())
					.setActivityId(completedActivityDTO.getActivityId());
			if (activityDTO != null) {
				completedActivityModel.setActivityTitle(activityDTO.getTitle())
						.setActivityDescription(activityDTO.getDescription());
			}
			List<MediaDTO> mediaDTOs = aggregateQueryResourceApi.getMediaByCompletedActivityIdUsingGET(
					completedActivityDTO.getId(), null, null, null, null, null, null, null, null, null, null).getBody();
			completedActivityModel.setProofs(mediaDTOs);
			completedActivityModels.add(completedActivityModel);
		}
		return ResponseEntity.ok().body(completedActivityModels);
	}

	/**
	 * GET /completed-activity/:phoneNumber : get the "phoneNumber"
	 * completedActivity.
	 *
	 * @param phoneNumber the phoneNumber of the completedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         completedActivityDTO, or with status 404 (Not Found)
	 */

	@GetMapping("/query/completed-activity-by-phonenumber/{phoneNumber}")
	@Timed
	public ResponseEntity<List<CompletedActivityModel>> findCompletedActivityByRegisteredUserPhoneNumber(
			@PathVariable Long phoneNumber, Pageable pageable) throws URISyntaxException {
		log.debug("REST request to get completedActivity by phoneNumber : {}", phoneNumber);
		List<CompletedActivityDTO> list = aggregateQueryResourceApi
				.getCompletedActivityByRegisteredUserPhoneNumberUsingGET(phoneNumber, null, null, null, null, null,
						null, null, null, null, null)
				.getBody();
		List<CompletedActivityModel> completedActivityModels = new ArrayList<CompletedActivityModel>();
		for (CompletedActivityDTO completedActivityDTO : list) {
			CompletedActivityModel completedActivityModel = new CompletedActivityModel();
			ActivityDTO activityDTO = null;
			if (completedActivityDTO.getActivityId() != null) {
				activityDTO = aggregateQueryResourceApi.getActivityByIdUsingGET(completedActivityDTO.getActivityId())
						.getBody();
			}
			completedActivityModel.setId(completedActivityDTO.getId())
					.setRegisteredUserId(completedActivityDTO.getRegisteredUserId())
					.setActivityId(completedActivityDTO.getActivityId());
			if (activityDTO != null) {
				completedActivityModel.setActivityTitle(activityDTO.getTitle())
						.setActivityDescription(activityDTO.getDescription());
			}
			List<MediaDTO> mediaDTOs = aggregateQueryResourceApi.getMediaByCompletedActivityIdUsingGET(
					completedActivityDTO.getId(), null, null, null, null, null, null, null, null, null, null).getBody();
			completedActivityModel.setProofs(mediaDTOs);
			completedActivityModels.add(completedActivityModel);
		}

		return ResponseEntity.ok().body(completedActivityModels);
	}

	/**
	 * GET /instruction-videos/:activityId : get the "activityId" of
	 * instructionVideo.
	 *
	 * @param id the id of the instructionVideoDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         instructionVideoDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/instruction-video-by-activityId/{activityId}")
	@Timed
	public ResponseEntity<InstructionVideoModel> getInstructionVideoByActivityId(@PathVariable Long activityId) {
		log.debug("REST request to get InstructionVideo : {}", activityId);
		//log.info("******config{}",config.);
		
		InstructionVideoDTO instructionVideoDTO = aggregateQueryResourceApi
				.getInstructionVideoByActivityIdUsingGET(activityId).getBody();
		
		
		InstructionVideoModel instructionVideoModel = new InstructionVideoModel();
		if (instructionVideoDTO != null) {
			instructionVideoModel.setId(instructionVideoDTO.getId()).setFileName(instructionVideoDTO.getFileName())
					.setFile(instructionVideoDTO.getFile())
					.setFileContentType(instructionVideoDTO.getFileContentType())
					.setFileUrl("http://35.196.249.196:8075/KarmaApp/"+instructionVideoDTO.getFileUrl());

			log.info("url***{}",instructionVideoModel.getFileUrl());
		}
		return ResponseEntity.ok().body(instructionVideoModel);
	}

	/**
	 * GET /incompleted-activity/:registeredUserId : get the "registeredUserId"
	 * incompletedActivity.
	 *
	 * @param registeredUserId the id of the completedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         completedActivityDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/incompleted-activity-by-registered-user/{registeredUserId}")
	@Timed
	public ResponseEntity<List<ActivityModel>> findIncompletedActivityByRegisteredUserIdByQuery(
			@PathVariable Long registeredUserId, Pageable pageable) throws URISyntaxException {
		log.debug("REST request to get incompletedActivity by registeredUserId: {}", registeredUserId);
		List<ActivityDTO> list = aggregateQueryResourceApi.findIncompletedActivityByRegisteredUserIdUsingGET(
				registeredUserId, null, null, null, null, null, null, null, null, null, null).getBody();
		List<ActivityModel> activityModels = new ArrayList<ActivityModel>();
		for (ActivityDTO activityDTO : list) {
			ActivityModel activityModel = new ActivityModel();
			InstructionVideoDTO instructionVideoDTO = null;
			if (activityDTO.getInstructionVideoId() != null) {
				instructionVideoDTO = aggregateQueryResourceApi
						.getInstructionVideoByIdUsingGET(activityDTO.getInstructionVideoId()).getBody();
			}
			activityModel.setId(activityDTO.getId()).setTitle(activityDTO.getTitle())
					.setDescription(activityDTO.getDescription()).setSuccessMessage(activityDTO.getSuccessMessage())
					.setUrl(activityDTO.getUrl());
			if (instructionVideoDTO != null) {
				activityModel.setInstructionVideoId(instructionVideoDTO.getId());
			}
			/*
			 * .setInstructionVideoFileName(instructionVideoDTO.getFileName())
			 * .setInstructionVideoFile(instructionVideoDTO.getFile())
			 * .setInstructionVideoFileContentType(instructionVideoDTO.getFileContentType())
			 * ;
			 */
			activityModels.add(activityModel);
		}
		return ResponseEntity.ok().body(activityModels);

	}

	/**
	 * GET /incompleted-activity/:registeredUserId : get the "registeredUserId"
	 * incompletedActivity.
	 *
	 * @param registeredUserId the id of the completedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         completedActivityDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/incompleted-activity-by-phone-number/{phoneNumber}")
	@Timed
	public ResponseEntity<List<ActivityModel>> findIncompletedActivityByPhoneNumberByQuery(
			@PathVariable Long phoneNumber, Pageable pageable) throws URISyntaxException {
		log.debug("REST request to get incompletedActivity by phoneNumber: {}", phoneNumber);
		List<ActivityDTO> list = aggregateQueryResourceApi.findIncompletedActivityByPhoneNumberUsingGET(phoneNumber,
				null, null, null, null, null, null, null, null, null, null).getBody();
		List<ActivityModel> activityModels = new ArrayList<ActivityModel>();
		for (ActivityDTO activityDTO : list) {
			ActivityModel activityModel = new ActivityModel();
			InstructionVideoDTO instructionVideoDTO = null;
			if (activityDTO.getInstructionVideoId() != null) {
				instructionVideoDTO = aggregateQueryResourceApi
						.getInstructionVideoByIdUsingGET(activityDTO.getInstructionVideoId()).getBody();
			}
			activityModel.setId(activityDTO.getId()).setTitle(activityDTO.getTitle())
					.setDescription(activityDTO.getDescription()).setSuccessMessage(activityDTO.getSuccessMessage())
					.setUrl(activityDTO.getUrl());
			if (instructionVideoDTO != null) {
				activityModel.setInstructionVideoId(instructionVideoDTO.getId());
			}
			/*
			 * .setInstructionVideoFileName(instructionVideoDTO.getFileName())
			 * .setInstructionVideoFile(instructionVideoDTO.getFile())
			 * .setInstructionVideoFileContentType(instructionVideoDTO.getFileContentType())
			 * ;
			 */
			activityModels.add(activityModel);
		}
		return ResponseEntity.ok().body(activityModels);
	}

	/**
	 * GET /registered-user/:userId : get the "registeredUser"
	 * 
	 * @param userId the id of the registeredUserDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         instructionVideoDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/registered-user-by-userId/{userId}")
	@Timed
	public ResponseEntity<RegisteredUserModel> getRegisteredUserByUserId(@PathVariable String userId) {
		log.debug("REST request to get RegisteredUser : {}", userId);
		RegisteredUserDTO registeredUserDTO = aggregateQueryResourceApi.getRegisteredUserByUserIdUsingGET(userId)
				.getBody();
		RegisteredUserModel registeredUserModel = new RegisteredUserModel();
		if (registeredUserDTO != null) {
			MediaDTO mediaDTO = null;
			if (registeredUserDTO.getProfilePicId() != null) {
				mediaDTO = aggregateQueryResourceApi.getMediaByIdUsingGET(registeredUserDTO.getProfilePicId())
						.getBody();
			}
			registeredUserModel = registeredUserModel.setRegisteredUserId(registeredUserDTO.getId())
					.setUserId(registeredUserDTO.getUserId()).setFirstName(registeredUserDTO.getFirstName())
					.setLastName(registeredUserDTO.getLastName()).setEmail(registeredUserDTO.getEmail())
					.setPhoneNumber(registeredUserDTO.getPhoneNumber()).setNoOfCoins(registeredUserDTO.getNoOfCoins())
					.setNoOfBronzeMedals(registeredUserDTO.getNoOfBronzeMedals())
					.setNoOfSilverMedals(registeredUserDTO.getNoOfSilverMedals())
					.setNoOfGoldMedals(registeredUserDTO.getNoOfGoldMedals());
			if (mediaDTO != null) {
				registeredUserModel.setProfilePicId(mediaDTO.getId()).setProfilePicFileName(mediaDTO.getFileName())
						.setProfilePicFile(mediaDTO.getFile())
						.setProfilePicFileContentType(mediaDTO.getFileContentType());
			}
		}
		return ResponseEntity.ok().body(registeredUserModel);
	}
	
	/**
	 * GET /media/:id : get the "completedActivityMedias of registered user"
	 * completedActivity.
	 *
	 * @param registeredUserId the id of the registeredUser to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         MediaDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/query/all-completed-activity-media/{registeredUserId}")
	@Timed
	public ResponseEntity<List<MediaModel>> findAllCompletedActivityMediasByRegisteredUserId(@PathVariable Long registeredUserId,
			Pageable pageable) throws URISyntaxException {
		log.debug("REST request to get completed activity medias by user id : {}", registeredUserId);

		List<MediaDTO> mediaDtoList = aggregateQueryResourceApi.
				findAllCompletedActivityMediasByRegisteredUserIdUsingGET(registeredUserId, null, null, null, null, null, null, null, null, null, null).getBody();
		
		List<MediaModel> mediaModelList=new ArrayList<MediaModel>();
		
		for(MediaDTO media:mediaDtoList){
			MediaModel mediaModel=new MediaModel();
			
			mediaModel.setId(media.getId());
			mediaModel.setActivityId(media.getActivityId());
			mediaModel.setCompletedActivityId(media.getCompletedActivityId());
			mediaModel.setFile(media.getFile());
			mediaModel.setFileName(media.getFileName());
			mediaModel.setFileContentType(media.getFileContentType());
			
			mediaModelList.add(mediaModel);
		}
		
		return ResponseEntity.ok().body(mediaModelList);

	}

	

}
