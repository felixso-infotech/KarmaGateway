/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.felixsoinfotech.karma_gateway.client.user_response.api;

import com.felixsoinfotech.karma_gateway.client.user_response.model.CommentDTO;
import com.felixsoinfotech.karma_gateway.client.user_response.model.CountAggregate;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-29T13:45:53.131140800+05:30[Asia/Calcutta]")

@Api(value = "UserResponseAggregateQueryResource", description = "the UserResponseAggregateQueryResource API")
public interface UserResponseAggregateQueryResourceApi {

    @ApiOperation(value = "getAllCommentsByCommitedActivityId", nickname = "getAllCommentsByCommitedActivityIdUsingGET", notes = "", response = CommentDTO.class, responseContainer = "List", tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/get-comments-by-commitedActivityId/{commitedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CommentDTO>> getAllCommentsByCommitedActivityIdUsingGET(@ApiParam(value = "commitedActivityId",required=true) @PathVariable("commitedActivityId") Long commitedActivityId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getAllRepliesByCommentId", nickname = "getAllRepliesByCommentIdUsingGET", notes = "", response = ReplyDTO.class, responseContainer = "List", tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/get-replies-by-commentId/{commentId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReplyDTO>> getAllRepliesByCommentIdUsingGET(@ApiParam(value = "commentId",required=true) @PathVariable("commentId") Long commentId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getCountOfCommentsAndLikesByCommitedActivityId", nickname = "getCountOfCommentsAndLikesByCommitedActivityIdUsingGET", notes = "", response = CountAggregate.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CountAggregate.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/countofcomments-likes/{commitedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CountAggregate> getCountOfCommentsAndLikesByCommitedActivityIdUsingGET(@ApiParam(value = "commitedActivityId",required=true) @PathVariable("commitedActivityId") Long commitedActivityId);


    @ApiOperation(value = "getNumberOfCommentsByCommitedActivityId", nickname = "getNumberOfCommentsByCommitedActivityIdUsingGET", notes = "", response = Long.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/numberofcomments-by-commitedActivityId/{commitedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> getNumberOfCommentsByCommitedActivityIdUsingGET(@ApiParam(value = "commitedActivityId",required=true) @PathVariable("commitedActivityId") Long commitedActivityId);


    @ApiOperation(value = "getNumberOfLovesByCommentId", nickname = "getNumberOfLovesByCommentIdUsingGET", notes = "", response = Long.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/numberofloves-by-commentId/{commentId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> getNumberOfLovesByCommentIdUsingGET(@ApiParam(value = "commentId",required=true) @PathVariable("commentId") Long commentId);


    @ApiOperation(value = "getNumberOfLovesByCommitedActivityId", nickname = "getNumberOfLovesByCommitedActivityIdUsingGET", notes = "", response = Long.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/numberofloves-by-commitedActivityId/{commitedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> getNumberOfLovesByCommitedActivityIdUsingGET(@ApiParam(value = "commitedActivityId",required=true) @PathVariable("commitedActivityId") Long commitedActivityId);


    @ApiOperation(value = "getNumberOfLovesByReplyId", nickname = "getNumberOfLovesByReplyIdUsingGET", notes = "", response = Long.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/numberofloves-by-replyId/{replyId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> getNumberOfLovesByReplyIdUsingGET(@ApiParam(value = "replyId",required=true) @PathVariable("replyId") Long replyId);


    @ApiOperation(value = "getNumberOfRepliesByCommentId", nickname = "getNumberOfRepliesByCommentIdUsingGET", notes = "", response = Long.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/numberofreplies-by-commentId/{commentId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> getNumberOfRepliesByCommentIdUsingGET(@ApiParam(value = "commentId",required=true) @PathVariable("commentId") Long commentId);

}
