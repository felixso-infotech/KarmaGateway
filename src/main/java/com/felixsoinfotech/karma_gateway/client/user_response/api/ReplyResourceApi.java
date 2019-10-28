/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.felixsoinfotech.karma_gateway.client.user_response.api;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T23:52:21.261252300+05:30[Asia/Calcutta]")

@Api(value = "ReplyResource", description = "the ReplyResource API")
public interface ReplyResourceApi {

    @ApiOperation(value = "createReply", nickname = "createReplyUsingPOST", notes = "", response = ReplyDTO.class, tags={ "reply-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/replies",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ReplyDTO> createReplyUsingPOST(@ApiParam(value = "replyDTO" ,required=true )  @Valid @RequestBody ReplyDTO replyDTO);


    @ApiOperation(value = "deleteReply", nickname = "deleteReplyUsingDELETE", notes = "", tags={ "reply-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/replies/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteReplyUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllReplies", nickname = "getAllRepliesUsingGET", notes = "", response = ReplyDTO.class, responseContainer = "List", tags={ "reply-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/replies",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReplyDTO>> getAllRepliesUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getReply", nickname = "getReplyUsingGET", notes = "", response = ReplyDTO.class, tags={ "reply-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/replies/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ReplyDTO> getReplyUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "updateReply", nickname = "updateReplyUsingPUT", notes = "", response = ReplyDTO.class, tags={ "reply-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/replies",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ReplyDTO> updateReplyUsingPUT(@ApiParam(value = "replyDTO" ,required=true )  @Valid @RequestBody ReplyDTO replyDTO);

}
