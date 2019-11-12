
/*  Copyright 2002-2016 the original author or authors.
 
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy of
  the License at
 
  http://www.apache.org/licenses/LICENSE-2.0
 
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations under
  the License.
  */
    
  package com.felixsoinfotech.karma_gateway.web.rest;
  
import java.util.List;


import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;  
import com.codahale.metrics.annotation.Timed;
import com.felixsoinfotech.karma_gateway.client.karma.api.AggregateQueryResourceApi;
import com.felixsoinfotech.karma_gateway.client.karma.model.ActivityAggregate;
import com.felixsoinfotech.karma_gateway.client.karma.model.ActivityDTO;
import com.felixsoinfotech.karma_gateway.client.karma.model.ChallengeDTO;
import com.felixsoinfotech.karma_gateway.client.karma.model.CommittedActivityAggregate;
import com.felixsoinfotech.karma_gateway.client.karma.model.DimensionDTO;
import com.felixsoinfotech.karma_gateway.client.karma.model.RegisteredUserAggregate;
import com.felixsoinfotech.karma_gateway.client.user_response.api.UserResponseAggregateQueryResourceApi;
import com.felixsoinfotech.karma_gateway.client.user_response.model.CommentAggregate;
import com.felixsoinfotech.karma_gateway.client.user_response.model.CountAggregate;


  
  /**
   * TODO Provide a detailed description here
   * 
   * @author Owner sarangibalu, sarangibalu.a@lxisoft.com
   */
 
  /**
   * REST controller for managing Query resources.
   */  
  
  @RestController
  @RequestMapping("/api/query") 
  public class GatewayAggregateQueryResource {
  
     private final Logger log =  LoggerFactory.getLogger(GatewayAggregateQueryResource.class);
  
     private AggregateQueryResourceApi aggregateQueryResourceApi;
     
     private UserResponseAggregateQueryResourceApi userResponseAggregateQueryResourceApi;
   
     public GatewayAggregateQueryResource(AggregateQueryResourceApi aggregateQueryResourceApi,
    		                              UserResponseAggregateQueryResourceApi userResponseAggregateQueryResourceApi){
                       this.aggregateQueryResourceApi=aggregateQueryResourceApi; 
                       this.userResponseAggregateQueryResourceApi=userResponseAggregateQueryResourceApi;
      }
  
   /**
	 * GET /committed-activities/:status : get the "status" committedActivity.
	 *
	 * @param status the status of the committedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         committedActivityDTO, or with status 404 (Not Found)
	 */
    
     @GetMapping("/committed-activities/{status}")
     @Timed 
	 public ResponseEntity<List<CommittedActivityAggregate>> getAllCommittedActivitiesByStatus(@PathVariable String status) { 
			  
    	  log.debug("REST request to get a list of CommittedActivity : {}", status);
		  
		  List<CommittedActivityAggregate> committedActivityAggregateList = aggregateQueryResourceApi.getAllCommittedActivitiesByStatusUsingGET(status,
		                                                                    null, null, null, null, null, null, null, null, null, null).getBody();
		  
		  for(CommittedActivityAggregate committedActivityAggregate:committedActivityAggregateList) {
		      
			  if(committedActivityAggregate != null) {
		           if(committedActivityAggregate.getCommittedActivityId() != null ) {
		        	        
		        	   CountAggregate countAggregate = userResponseAggregateQueryResourceApi.getCountOfCommentsAndLikesByCommitedActivityIdUsingGET(committedActivityAggregate.getCommittedActivityId()).getBody();
		               committedActivityAggregate.setNoOfLoves(countAggregate.getNoOfLoves());
		               committedActivityAggregate.setNoOfComments(countAggregate.getNoOfComments());
		               committedActivityAggregate.setLiked(userResponseAggregateQueryResourceApi.isLikedCommittedActivityByUserUsingGET(committedActivityAggregate.getCommittedActivityId(),"Sharai").getBody());
		  
		  } } }
		  
		  return ResponseEntity.ok().body(committedActivityAggregateList); }
     
     /**
      * GET  /dimensions : get all the dimensions.
      *
      * @param pageable the pagination information
      * @return the ResponseEntity with status 200 (OK) and the list of dimensions in body
      */
     @GetMapping("/dimensions")
     @Timed
     public ResponseEntity<List<DimensionDTO>> getAllDimensions() {
         log.debug("REST request to get a list of Dimensions");
         
         return aggregateQueryResourceApi.getAllDimensionsUsingGET(null, null, null, null, null, null, null, null, null, null);
         
          }
     
     /**
      * GET  /registered-users/:id : get the "id" registeredUser.
      *
      * @param id the id of the registeredUserDTO to retrieve
      * @return the ResponseEntity with status 200 (OK) and with body the registeredUserDTO, or with status 404 (Not Found)
      */
     @GetMapping("/registered-user/{userId}")
     @Timed
     public ResponseEntity<RegisteredUserAggregate> getRegisteredUserByUserId(@PathVariable String userId) {
         log.debug("REST request to get RegisteredUser : {}", userId);
         
         return aggregateQueryResourceApi.getRegisteredUserByUserIdUsingGET(userId);
        		 
         }
     
     /**
      * GET  /activities : get all the activities.
      *
      * @param pageable the pagination information
      * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many)
      * @return the ResponseEntity with status 200 (OK) and the list of activities in body
      */
     @GetMapping("/activities")
     @Timed
     public ResponseEntity<List<ActivityDTO>> getAllActivities() {
         log.debug("REST request to get CommittedActivity : {}");
         
         return aggregateQueryResourceApi.getAllActivitiesUsingGET1(null, null, null, null, null, null, null, null, null, null, null);
        
     }
     
     /**
      * GET  /enums/proof-type : get all the enum Types.
      *
      * @return the ResponseEntity with status 200 (OK) and the list of activities in body
      */
     @GetMapping("/enums/proof-type")
     @Timed
     public ResponseEntity<List<String>> getAllEnumProofTypes() {
     	
     	
         log.debug("REST request to get a enum ProofType");
                        
         List<String> proofTypes = aggregateQueryResourceApi.getAllEnumProofTypesUsingGET(null, null, null, null, null, null, null, null, null, null).getBody();    
       
         return ResponseEntity.ok().body(proofTypes);
     }
     
     /**
      * GET /enums/type : get all the ProofTypes.
      *
      * @return the ResponseEntity with status 200 (OK) and the list of activities in body
      */
     @GetMapping("/enums/type")
     @Timed
     public ResponseEntity<List<String>> getAllEnumTypes() {
     	
         log.debug("REST request to get a enum Types");
                        
         return aggregateQueryResourceApi.getAllEnumTypesUsingGET(null, null, null, null, null, null, null, null, null, null);       
       
     }
     
     /**
      * GET  /enums/status : get all the ProofTypes.
      *
      * @return the ResponseEntity with status 200 (OK) and the list of activities in body
      */
     @GetMapping("/enums/status")
     @Timed
     public ResponseEntity<List<String>> getAllEnumStatus() {
     	
         log.debug("REST request to get a enum Types");
                        
         return aggregateQueryResourceApi.getAllEnumStatusUsingGET(null, null, null, null, null, null, null, null, null, null);      
       
         
     }
     
     /**
      * GET  /challenges : get all the challenges.
      *
      * @param pageable the pagination information
      * @return the ResponseEntity with status 200 (OK) and the list of challenges in body
      */
     @GetMapping("/challenges")
     @Timed
     public ResponseEntity<List<ChallengeDTO>> getAllChallenges(Pageable pageable) {
         log.debug("REST request to get a page of Challenges");
         
         return aggregateQueryResourceApi.getAllChallengesUsingGET(null, null, null, null, null, null, null, null, null, null);       
     
     }
     
     /**
 	 * GET /comments : get all the comments by commitedActivityId.
 	 *
 	 * @param commitedActivityId
 	 *            the activity id to retrieve comments,pageable the pagination
 	 *            information
 	 * @return the ResponseEntity with status 200 (OK) and the list of comments
 	 *         in body
 	 */
 	@GetMapping("/get-comments/{commitedActivityId}")
 	@Timed
 	public ResponseEntity<List<CommentAggregate>> getAllCommentsByCommitedActivityId(Pageable pageable,@PathVariable Long commitedActivityId) {
 		
 		log.debug("REST request to get a page of Comments by commitedActivityId");
 		 		
 		List<CommentAggregate> CommentAggregateList =userResponseAggregateQueryResourceApi.getAllCommentsByCommitedActivityIdUsingGET(commitedActivityId, commitedActivityId, null, null, null, null, null, null, null, null, null).getBody();
        
 		RegisteredUserAggregate registeredUserAggregate=null;
 		
 		for(CommentAggregate commentAggregate : CommentAggregateList )
 		{
 			if(commentAggregate != null)
 			{
 				if(commentAggregate.getUserId() != null)
 					registeredUserAggregate=aggregateQueryResourceApi.getRegisteredUserByUserIdUsingGET(commentAggregate.getUserId()).getBody();
 				
 				if(registeredUserAggregate != null)
 				{
 				commentAggregate.setFirstName(registeredUserAggregate.getFirstName());
 				commentAggregate.setLastName(registeredUserAggregate.getLastName());
 				commentAggregate.setProfilePicture(registeredUserAggregate.getProfilePicture());
 				commentAggregate.setProfilePictureContentType(registeredUserAggregate.getProfilePictureContentType());
 				}
 				
 			}
 		}
        
 		return ResponseEntity.ok().body(CommentAggregateList);
		  
     }
  }
		 