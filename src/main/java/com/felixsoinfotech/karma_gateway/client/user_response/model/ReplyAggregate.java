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
 * ReplyAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:16:39.376+05:30[Asia/Calcutta]")

public class ReplyAggregate   {
  @JsonProperty("commentId")
  private Long commentId = null;

  @JsonProperty("dateAndTime")
  private OffsetDateTime dateAndTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("liked")
  private Boolean liked = null;

  @JsonProperty("noOfLoves")
  private Long noOfLoves = null;

  @JsonProperty("profilePicture")
  private String profilePicture = null;

  @JsonProperty("profilePictureContentType")
  private String profilePictureContentType = null;

  @JsonProperty("replyId")
  private Long replyId = null;

  @JsonProperty("timeElapsed")
  private String timeElapsed = null;

  @JsonProperty("userId")
  private String userId = null;

  public ReplyAggregate commentId(Long commentId) {
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

  public ReplyAggregate dateAndTime(OffsetDateTime dateAndTime) {
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

  public ReplyAggregate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReplyAggregate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ReplyAggregate lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ReplyAggregate liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * Get liked
   * @return liked
  **/
  @ApiModelProperty(value = "")


  public Boolean isLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public ReplyAggregate noOfLoves(Long noOfLoves) {
    this.noOfLoves = noOfLoves;
    return this;
  }

  /**
   * Get noOfLoves
   * @return noOfLoves
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfLoves() {
    return noOfLoves;
  }

  public void setNoOfLoves(Long noOfLoves) {
    this.noOfLoves = noOfLoves;
  }

  public ReplyAggregate profilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

  /**
   * Get profilePicture
   * @return profilePicture
  **/
  @ApiModelProperty(value = "")


  public String getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }

  public ReplyAggregate profilePictureContentType(String profilePictureContentType) {
    this.profilePictureContentType = profilePictureContentType;
    return this;
  }

  /**
   * Get profilePictureContentType
   * @return profilePictureContentType
  **/
  @ApiModelProperty(value = "")


  public String getProfilePictureContentType() {
    return profilePictureContentType;
  }

  public void setProfilePictureContentType(String profilePictureContentType) {
    this.profilePictureContentType = profilePictureContentType;
  }

  public ReplyAggregate replyId(Long replyId) {
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

  public ReplyAggregate timeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
    return this;
  }

  /**
   * Get timeElapsed
   * @return timeElapsed
  **/
  @ApiModelProperty(value = "")


  public String getTimeElapsed() {
    return timeElapsed;
  }

  public void setTimeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
  }

  public ReplyAggregate userId(String userId) {
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
    ReplyAggregate replyAggregate = (ReplyAggregate) o;
    return Objects.equals(this.commentId, replyAggregate.commentId) &&
        Objects.equals(this.dateAndTime, replyAggregate.dateAndTime) &&
        Objects.equals(this.description, replyAggregate.description) &&
        Objects.equals(this.firstName, replyAggregate.firstName) &&
        Objects.equals(this.lastName, replyAggregate.lastName) &&
        Objects.equals(this.liked, replyAggregate.liked) &&
        Objects.equals(this.noOfLoves, replyAggregate.noOfLoves) &&
        Objects.equals(this.profilePicture, replyAggregate.profilePicture) &&
        Objects.equals(this.profilePictureContentType, replyAggregate.profilePictureContentType) &&
        Objects.equals(this.replyId, replyAggregate.replyId) &&
        Objects.equals(this.timeElapsed, replyAggregate.timeElapsed) &&
        Objects.equals(this.userId, replyAggregate.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, dateAndTime, description, firstName, lastName, liked, noOfLoves, profilePicture, profilePictureContentType, replyId, timeElapsed, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyAggregate {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    dateAndTime: ").append(toIndentedString(dateAndTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    noOfLoves: ").append(toIndentedString(noOfLoves)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    profilePictureContentType: ").append(toIndentedString(profilePictureContentType)).append("\n");
    sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
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

