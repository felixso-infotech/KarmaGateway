/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.felixsoinfotech.karma_gateway.client.karma.api;

import com.felixsoinfotech.karma_gateway.client.karma.model.ActivityAggregate;
import com.felixsoinfotech.karma_gateway.client.karma.model.CommittedActivityStatusAggregate;
import com.felixsoinfotech.karma_gateway.client.karma.model.RegisteredUserDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T15:03:00.314+05:30[Asia/Calcutta]")

@Api(value = "AggregateCommandResource", description = "the AggregateCommandResource API")
public interface AggregateCommandResourceApi {

    @ApiOperation(value = "createActivity", nickname = "createActivityUsingPOST1", notes = "", response = ActivityAggregate.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ActivityAggregate.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/activities",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ActivityAggregate> createActivityUsingPOST1(@ApiParam(value = "activityAggregate" ,required=true )  @Valid @RequestBody ActivityAggregate activityAggregate);


    @ApiOperation(value = "createCommittedActivity", nickname = "createCommittedActivityUsingPOST", notes = "", response = CommittedActivityStatusAggregate.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommittedActivityStatusAggregate.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/committed-activities",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CommittedActivityStatusAggregate> createCommittedActivityUsingPOST(@ApiParam(value = "committedActivityStatusAggregate" ,required=true )  @Valid @RequestBody CommittedActivityStatusAggregate committedActivityStatusAggregate);


    @ApiOperation(value = "createRegisteredUser", nickname = "createRegisteredUserUsingPOST", notes = "", response = RegisteredUserDTO.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegisteredUserDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/registered-users",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RegisteredUserDTO> createRegisteredUserUsingPOST(@ApiParam(value = "registeredUserDTO" ,required=true )  @Valid @RequestBody RegisteredUserDTO registeredUserDTO);


    @ApiOperation(value = "deleteRegisteredUser", nickname = "deleteRegisteredUserUsingDELETE", notes = "", tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/command/registered-users/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteRegisteredUserUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "updateActivity", nickname = "updateActivityUsingPUT1", notes = "", response = ActivityAggregate.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ActivityAggregate.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/activities",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ActivityAggregate> updateActivityUsingPUT1(@ApiParam(value = "activityAggregate" ,required=true )  @Valid @RequestBody ActivityAggregate activityAggregate);


    @ApiOperation(value = "updateCommittedActivity", nickname = "updateCommittedActivityUsingPUT", notes = "", response = CommittedActivityStatusAggregate.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommittedActivityStatusAggregate.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/committed-activities",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CommittedActivityStatusAggregate> updateCommittedActivityUsingPUT(@ApiParam(value = "committedActivityStatusAggregate" ,required=true )  @Valid @RequestBody CommittedActivityStatusAggregate committedActivityStatusAggregate);


    @ApiOperation(value = "updateRegisteredUser", nickname = "updateRegisteredUserUsingPUT", notes = "", response = RegisteredUserDTO.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RegisteredUserDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/registered-users",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RegisteredUserDTO> updateRegisteredUserUsingPUT(@ApiParam(value = "registeredUserDTO" ,required=true )  @Valid @RequestBody RegisteredUserDTO registeredUserDTO);

}
