/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lxisoft.client.karma_app.api;

import com.lxisoft.client.karma_app.model.CompletedActivityDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-21T11:21:03.999139800+05:30[Asia/Calcutta]")

@Api(value = "AggregateCommandResource", description = "the AggregateCommandResource API")
public interface AggregateCommandResourceApi {

    @ApiOperation(value = "createCompletedActivity", nickname = "createCompletedActivityUsingPOST", notes = "", response = CompletedActivityDTO.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompletedActivityDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/completed-activities",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CompletedActivityDTO> createCompletedActivityUsingPOST(@ApiParam(value = "completedActivityDTO" ,required=true )  @Valid @RequestBody CompletedActivityDTO completedActivityDTO);


    @ApiOperation(value = "createMedia", nickname = "createMediaUsingPOST", notes = "", response = MediaDTO.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MediaDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/media",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<MediaDTO> createMediaUsingPOST(@ApiParam(value = "mediaDTO" ,required=true )  @Valid @RequestBody MediaDTO mediaDTO);


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


    @ApiOperation(value = "updateMedia", nickname = "updateMediaUsingPUT", notes = "", response = MediaDTO.class, tags={ "aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MediaDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/media",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<MediaDTO> updateMediaUsingPUT(@ApiParam(value = "mediaDTO" ,required=true )  @Valid @RequestBody MediaDTO mediaDTO);


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
