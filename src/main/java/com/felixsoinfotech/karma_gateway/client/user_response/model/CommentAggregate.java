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
 * CommentAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:16:39.376+05:30[Asia/Calcutta]")

public class CommentAggregate   {
  @JsonProperty("commentId")
  private Long commentId = null;

  @JsonProperty("commitedActivityId")
  private Long commitedActivityId = null;

  @JsonProperty("completedChallengeId")
  private Long completedChallengeId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

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

  @JsonProperty("noOfReplies")
  private Long noOfReplies = null;

  @JsonProperty("profilePicture")
  private String profilePicture = null;

  @JsonProperty("profilePictureContentType")
  private String profilePictureContentType = null;

  @JsonProperty("timeElapsed")
  private String timeElapsed = null;

  @JsonProperty("userId")
  private String userId = null;

  public CommentAggregate commentId(Long commentId) {
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

  public CommentAggregate commitedActivityId(Long commitedActivityId) {
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

  public CommentAggregate completedChallengeId(Long completedChallengeId) {
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

  public CommentAggregate createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public CommentAggregate description(String description) {
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

  public CommentAggregate firstName(String firstName) {
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

  public CommentAggregate lastName(String lastName) {
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

  public CommentAggregate liked(Boolean liked) {
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

  public CommentAggregate noOfLoves(Long noOfLoves) {
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

  public CommentAggregate noOfReplies(Long noOfReplies) {
    this.noOfReplies = noOfReplies;
    return this;
  }

  /**
   * Get noOfReplies
   * @return noOfReplies
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfReplies() {
    return noOfReplies;
  }

  public void setNoOfReplies(Long noOfReplies) {
    this.noOfReplies = noOfReplies;
  }

  public CommentAggregate profilePicture(String profilePicture) {
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

  public CommentAggregate profilePictureContentType(String profilePictureContentType) {
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

  public CommentAggregate timeElapsed(String timeElapsed) {
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

  public CommentAggregate userId(String userId) {
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
    CommentAggregate commentAggregate = (CommentAggregate) o;
    return Objects.equals(this.commentId, commentAggregate.commentId) &&
        Objects.equals(this.commitedActivityId, commentAggregate.commitedActivityId) &&
        Objects.equals(this.completedChallengeId, commentAggregate.completedChallengeId) &&
        Objects.equals(this.createdDate, commentAggregate.createdDate) &&
        Objects.equals(this.description, commentAggregate.description) &&
        Objects.equals(this.firstName, commentAggregate.firstName) &&
        Objects.equals(this.lastName, commentAggregate.lastName) &&
        Objects.equals(this.liked, commentAggregate.liked) &&
        Objects.equals(this.noOfLoves, commentAggregate.noOfLoves) &&
        Objects.equals(this.noOfReplies, commentAggregate.noOfReplies) &&
        Objects.equals(this.profilePicture, commentAggregate.profilePicture) &&
        Objects.equals(this.profilePictureContentType, commentAggregate.profilePictureContentType) &&
        Objects.equals(this.timeElapsed, commentAggregate.timeElapsed) &&
        Objects.equals(this.userId, commentAggregate.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commitedActivityId, completedChallengeId, createdDate, description, firstName, lastName, liked, noOfLoves, noOfReplies, profilePicture, profilePictureContentType, timeElapsed, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAggregate {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commitedActivityId: ").append(toIndentedString(commitedActivityId)).append("\n");
    sb.append("    completedChallengeId: ").append(toIndentedString(completedChallengeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    noOfLoves: ").append(toIndentedString(noOfLoves)).append("\n");
    sb.append("    noOfReplies: ").append(toIndentedString(noOfReplies)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    profilePictureContentType: ").append(toIndentedString(profilePictureContentType)).append("\n");
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

