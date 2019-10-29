package com.felixsoinfotech.karma_gateway.client.user_response.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoveDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-29T13:45:53.131140800+05:30[Asia/Calcutta]")

public class LoveDTO   {
  @JsonProperty("commentId")
  private Long commentId = null;

  @JsonProperty("commitedActivityId")
  private Long commitedActivityId = null;

  @JsonProperty("completedChallengeId")
  private Long completedChallengeId = null;

  @JsonProperty("dateAndTime")
  private OffsetDateTime dateAndTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("replyId")
  private Long replyId = null;

  @JsonProperty("userId")
  private String userId = null;

  public LoveDTO commentId(Long commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   * @return commentId
  **/
  @ApiModelProperty(value = "")


  public Long getCommentId() {
    return commentId;
  }

  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }

  public LoveDTO commitedActivityId(Long commitedActivityId) {
    this.commitedActivityId = commitedActivityId;
    return this;
  }

  /**
   * Get commitedActivityId
   * @return commitedActivityId
  **/
  @ApiModelProperty(value = "")


  public Long getCommitedActivityId() {
    return commitedActivityId;
  }

  public void setCommitedActivityId(Long commitedActivityId) {
    this.commitedActivityId = commitedActivityId;
  }

  public LoveDTO completedChallengeId(Long completedChallengeId) {
    this.completedChallengeId = completedChallengeId;
    return this;
  }

  /**
   * Get completedChallengeId
   * @return completedChallengeId
  **/
  @ApiModelProperty(value = "")


  public Long getCompletedChallengeId() {
    return completedChallengeId;
  }

  public void setCompletedChallengeId(Long completedChallengeId) {
    this.completedChallengeId = completedChallengeId;
  }

  public LoveDTO dateAndTime(OffsetDateTime dateAndTime) {
    this.dateAndTime = dateAndTime;
    return this;
  }

  /**
   * Get dateAndTime
   * @return dateAndTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateAndTime() {
    return dateAndTime;
  }

  public void setDateAndTime(OffsetDateTime dateAndTime) {
    this.dateAndTime = dateAndTime;
  }

  public LoveDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LoveDTO replyId(Long replyId) {
    this.replyId = replyId;
    return this;
  }

  /**
   * Get replyId
   * @return replyId
  **/
  @ApiModelProperty(value = "")


  public Long getReplyId() {
    return replyId;
  }

  public void setReplyId(Long replyId) {
    this.replyId = replyId;
  }

  public LoveDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoveDTO loveDTO = (LoveDTO) o;
    return Objects.equals(this.commentId, loveDTO.commentId) &&
        Objects.equals(this.commitedActivityId, loveDTO.commitedActivityId) &&
        Objects.equals(this.completedChallengeId, loveDTO.completedChallengeId) &&
        Objects.equals(this.dateAndTime, loveDTO.dateAndTime) &&
        Objects.equals(this.id, loveDTO.id) &&
        Objects.equals(this.replyId, loveDTO.replyId) &&
        Objects.equals(this.userId, loveDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commitedActivityId, completedChallengeId, dateAndTime, id, replyId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoveDTO {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commitedActivityId: ").append(toIndentedString(commitedActivityId)).append("\n");
    sb.append("    completedChallengeId: ").append(toIndentedString(completedChallengeId)).append("\n");
    sb.append("    dateAndTime: ").append(toIndentedString(dateAndTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

