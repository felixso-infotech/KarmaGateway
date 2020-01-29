/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.felixsoinfotech.karma_gateway.client.user_response.api;

import com.felixsoinfotech.karma_gateway.client.user_response.model.CommentDTO;
import com.felixsoinfotech.karma_gateway.client.user_response.model.LoveDTO;
import com.felixsoinfotech.karma_gateway.client.user_response.model.ReplyDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-29T11:33:27.684524300+05:30[Asia/Calcutta]")

@Api(value = "UserResponseAggregateCommandResource", description = "the UserResponseAggregateCommandResource API")
public interface UserResponseAggregateCommandResourceApi {

    @ApiOperation(value = "deleteComment", nickname = "deleteCommentUsingDELETE1", notes = "", tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/command/delete-comment/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCommentUsingDELETE1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "deleteReply", nickname = "deleteReplyUsingDELETE1", notes = "", tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/command/delete-reply/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteReplyUsingDELETE1(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "doComment", nickname = "doCommentUsingPOST", notes = "", response = CommentDTO.class, tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/save-comment",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CommentDTO> doCommentUsingPOST(@ApiParam(value = "commentDTO" ,required=true )  @Valid @RequestBody CommentDTO commentDTO);


    @ApiOperation(value = "doLove", nickname = "doLoveUsingPOST", notes = "", response = LoveDTO.class, tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LoveDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/save-love",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<LoveDTO> doLoveUsingPOST(@ApiParam(value = "loveDTO" ,required=true )  @Valid @RequestBody LoveDTO loveDTO);


    @ApiOperation(value = "doReply", nickname = "doReplyUsingPOST", notes = "", response = ReplyDTO.class, tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/command/save-reply",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ReplyDTO> doReplyUsingPOST(@ApiParam(value = "replyDTO" ,required=true )  @Valid @RequestBody ReplyDTO replyDTO);


    @ApiOperation(value = "unloveComment", nickname = "unloveCommentUsingDELETE", notes = "", tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/command/unlove-comment",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> unloveCommentUsingDELETE(@ApiParam(value = "loveDto" ,required=true )  @Valid @RequestBody LoveDTO loveDTO);


    @ApiOperation(value = "unloveCommittedActivity", nickname = "unloveCommittedActivityUsingDELETE", notes = "", tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/command/unlove-committedactivity",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> unloveCommittedActivityUsingDELETE(@ApiParam(value = "loveDto" ,required=true )  @Valid @RequestBody LoveDTO loveDTO);


    @ApiOperation(value = "unloveReply", nickname = "unloveReplyUsingDELETE", notes = "", tags={ "user-response-aggregate-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/command/unlove-reply",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> unloveReplyUsingDELETE(@ApiParam(value = "loveDto" ,required=true )  @Valid @RequestBody LoveDTO loveDTO);

}
