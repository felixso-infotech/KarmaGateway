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
 * CommentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T14:15:32.714+05:30[Asia/Calcutta]")

public class CommentDTO   {
  @JsonProperty("commitedActivityId")
  private Long commitedActivityId = null;

  @JsonProperty("completedChallengeId")
  private Long completedChallengeId = null;

  @JsonProperty("dateAndTime")
  private OffsetDateTime dateAndTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("userId")
  private String userId = null;

  public CommentDTO commitedActivityId(Long commitedActivityId) {
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

  public CommentDTO completedChallengeId(Long completedChallengeId) {
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

  public CommentDTO dateAndTime(OffsetDateTime dateAndTime) {
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

  public CommentDTO description(String description) {
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

  public CommentDTO id(Long id) {
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

  public CommentDTO userId(String userId) {
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
    CommentDTO commentDTO = (CommentDTO) o;
    return Objects.equals(this.commitedActivityId, commentDTO.commitedActivityId) &&
        Objects.equals(this.completedChallengeId, commentDTO.completedChallengeId) &&
        Objects.equals(this.dateAndTime, commentDTO.dateAndTime) &&
        Objects.equals(this.description, commentDTO.description) &&
        Objects.equals(this.id, commentDTO.id) &&
        Objects.equals(this.userId, commentDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitedActivityId, completedChallengeId, dateAndTime, description, id, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentDTO {\n");
    
    sb.append("    commitedActivityId: ").append(toIndentedString(commitedActivityId)).append("\n");
    sb.append("    completedChallengeId: ").append(toIndentedString(completedChallengeId)).append("\n");
    sb.append("    dateAndTime: ").append(toIndentedString(dateAndTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

