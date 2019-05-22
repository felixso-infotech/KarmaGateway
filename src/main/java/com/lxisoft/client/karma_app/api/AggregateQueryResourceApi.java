/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lxisoft.client.karma_app.api;

import com.lxisoft.client.karma_app.model.ActivityDTO;
import com.lxisoft.client.karma_app.model.CompletedActivityDTO;
import com.lxisoft.client.karma_app.model.InstructionVideoDTO;
import com.lxisoft.client.karma_app.model.MediaDTO;
import com.lxisoft.client.karma_app.model.RegisteredUserDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-22T10:16:14.444624900+05:30[Asia/Calcutta]")

@Api(value = "AggregateQueryResource", description = "the AggregateQueryResource API")
public interface AggregateQueryResourceApi {

    @ApiOperation(value = "findIncompletedActivityByPhoneNumber", nickname = "findIncompletedActivityByPhoneNumberUsingGET", notes = "", response = ActivityDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ActivityDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/incompleted-activity-by-phone-number/{phoneNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ActivityDTO>> findIncompletedActivityByPhoneNumberUsingGET(@ApiParam(value = "phoneNumber",required=true) @PathVariable("phoneNumber") Long phoneNumber,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "findIncompletedActivityByRegisteredUserId", nickname = "findIncompletedActivityByRegisteredUserIdUsingGET", notes = "", response = ActivityDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ActivityDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/incompleted-activity-by-registered-user/{registeredUserId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ActivityDTO>> findIncompletedActivityByRegisteredUserIdUsingGET(@ApiParam(value = "registeredUserId",required=true) @PathVariable("registeredUserId") Long registeredUserId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getActivityById", nickname = "getActivityByIdUsingGET", notes = "", response = ActivityDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ActivityDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/activity/{activityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ActivityDTO> getActivityByIdUsingGET(@ApiParam(value = "activityId",required=true) @PathVariable("activityId") Long activityId);


    @ApiOperation(value = "getAllActivities", nickname = "getAllActivitiesUsingGET", notes = "", response = ActivityDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ActivityDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/activities",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ActivityDTO>> getAllActivitiesUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getAllRegisteredUsers", nickname = "getAllRegisteredUsersUsingGET", notes = "", response = RegisteredUserDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegisteredUserDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/registered-users",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RegisteredUserDTO>> getAllRegisteredUsersUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getCompletedActivityById", nickname = "getCompletedActivityByIdUsingGET", notes = "", response = CompletedActivityDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompletedActivityDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/completed-activity/{completedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CompletedActivityDTO> getCompletedActivityByIdUsingGET(@ApiParam(value = "completedActivityId",required=true) @PathVariable("completedActivityId") Long completedActivityId);


    @ApiOperation(value = "getCompletedActivityByRegisteredUserId", nickname = "getCompletedActivityByRegisteredUserIdUsingGET", notes = "", response = CompletedActivityDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompletedActivityDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/completed-activity-by-registered-user/{registeredUserId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CompletedActivityDTO>> getCompletedActivityByRegisteredUserIdUsingGET(@ApiParam(value = "registeredUserId",required=true) @PathVariable("registeredUserId") Long registeredUserId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getCompletedActivityByRegisteredUserPhoneNumber", nickname = "getCompletedActivityByRegisteredUserPhoneNumberUsingGET", notes = "", response = CompletedActivityDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompletedActivityDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/completed-activity-by-phonenumber/{phoneNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CompletedActivityDTO>> getCompletedActivityByRegisteredUserPhoneNumberUsingGET(@ApiParam(value = "phoneNumber",required=true) @PathVariable("phoneNumber") Long phoneNumber,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getInstructionVideoByActivityId", nickname = "getInstructionVideoByActivityIdUsingGET", notes = "", response = InstructionVideoDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InstructionVideoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/instruction-video-by-activityId/{activityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<InstructionVideoDTO> getInstructionVideoByActivityIdUsingGET(@ApiParam(value = "activityId",required=true) @PathVariable("activityId") Long activityId);


    @ApiOperation(value = "getInstructionVideoById", nickname = "getInstructionVideoByIdUsingGET", notes = "", response = InstructionVideoDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InstructionVideoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/instruction-video/{instructionVideoId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<InstructionVideoDTO> getInstructionVideoByIdUsingGET(@ApiParam(value = "instructionVideoId",required=true) @PathVariable("instructionVideoId") Long instructionVideoId);


    @ApiOperation(value = "getMediaByCompletedActivityId", nickname = "getMediaByCompletedActivityIdUsingGET", notes = "", response = MediaDTO.class, responseContainer = "List", tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MediaDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/completed-activity-media/{completedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<MediaDTO>> getMediaByCompletedActivityIdUsingGET(@ApiParam(value = "completedActivityId",required=true) @PathVariable("completedActivityId") Long completedActivityId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getMediaById", nickname = "getMediaByIdUsingGET", notes = "", response = MediaDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MediaDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/media/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<MediaDTO> getMediaByIdUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getRegisteredUserById", nickname = "getRegisteredUserByIdUsingGET", notes = "", response = RegisteredUserDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegisteredUserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/registered-users/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RegisteredUserDTO> getRegisteredUserByIdUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getRegisteredUserByPhoneNumber", nickname = "getRegisteredUserByPhoneNumberUsingGET", notes = "", response = RegisteredUserDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegisteredUserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/registered-users-by-phonenumber/{phoneNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RegisteredUserDTO> getRegisteredUserByPhoneNumberUsingGET(@ApiParam(value = "phoneNumber",required=true) @PathVariable("phoneNumber") Long phoneNumber);


    @ApiOperation(value = "getRegisteredUserByUserId", nickname = "getRegisteredUserByUserIdUsingGET", notes = "", response = RegisteredUserDTO.class, tags={ "aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegisteredUserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/registered-user/userId",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RegisteredUserDTO> getRegisteredUserByUserIdUsingGET(@ApiParam(value = "userId",required=true) @PathVariable("userId") String userId);

}
