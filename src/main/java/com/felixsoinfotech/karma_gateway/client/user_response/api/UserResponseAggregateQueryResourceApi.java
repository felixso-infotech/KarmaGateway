/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.felixsoinfotech.karma_gateway.client.user_response.api;

import com.felixsoinfotech.karma_gateway.client.user_response.model.CommentAggregate;
import com.felixsoinfotech.karma_gateway.client.user_response.model.CountAggregate;
import com.felixsoinfotech.karma_gateway.client.user_response.model.ReplyAggregate;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-14T11:39:57.752418300+05:30[Asia/Calcutta]")

@Api(value = "UserResponseAggregateQueryResource", description = "the UserResponseAggregateQueryResource API")
public interface UserResponseAggregateQueryResourceApi {

    @ApiOperation(value = "getAllCommentsByCommitedActivityId", nickname = "getAllCommentsByCommitedActivityIdUsingGET", notes = "", response = CommentAggregate.class, responseContainer = "List", tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommentAggregate.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/get-comments/{commitedActivityId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CommentAggregate>> getAllCommentsByCommitedActivityIdUsingGET(@ApiParam(value = "commitedActivityId",required=true) @PathVariable("commitedActivityId") Long commitedActivityId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getAllRepliesByCommentId", nickname = "getAllRepliesByCommentIdUsingGET", notes = "", response = ReplyAggregate.class, responseContainer = "List", tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReplyAggregate.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/get-replies/{commentId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReplyAggregate>> getAllRepliesByCommentIdUsingGET(@ApiParam(value = "commentId",required=true) @PathVariable("commentId") Long commentId,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


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


    @ApiOperation(value = "isLikedCommittedActivityByUser", nickname = "isLikedCommittedActivityByUserUsingGET", notes = "", response = Boolean.class, tags={ "user-response-aggregate-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/query/isLiked/{commitedActivityId}/{userId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> isLikedCommittedActivityByUserUsingGET(@ApiParam(value = "commitedActivityId",required=true) @PathVariable("commitedActivityId") Long commitedActivityId,@ApiParam(value = "userId",required=true) @PathVariable("userId") String userId);

}
