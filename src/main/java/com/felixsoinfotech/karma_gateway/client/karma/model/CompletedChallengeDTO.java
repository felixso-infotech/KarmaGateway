package com.felixsoinfotech.karma_gateway.client.karma.model;

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
 * CompletedChallengeDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-29T16:00:01.555427800+05:30[Asia/Calcutta]")

public class CompletedChallengeDTO   {
  @JsonProperty("challengeId")
  private Long challengeId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("registeredUserId")
  private Long registeredUserId = null;

  public CompletedChallengeDTO challengeId(Long challengeId) {
    this.challengeId = challengeId;
    return this;
  }

  /**
   * Get challengeId
   * @return challengeId
  **/
  @ApiModelProperty(value = "")


  public Long getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }

  public CompletedChallengeDTO createdDate(OffsetDateTime createdDate) {
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

  public CompletedChallengeDTO description(String description) {
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

  public CompletedChallengeDTO id(Long id) {
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

  public CompletedChallengeDTO registeredUserId(Long registeredUserId) {
    this.registeredUserId = registeredUserId;
    return this;
  }

  /**
   * Get registeredUserId
   * @return registeredUserId
  **/
  @ApiModelProperty(value = "")


  public Long getRegisteredUserId() {
    return registeredUserId;
  }

  public void setRegisteredUserId(Long registeredUserId) {
    this.registeredUserId = registeredUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletedChallengeDTO completedChallengeDTO = (CompletedChallengeDTO) o;
    return Objects.equals(this.challengeId, completedChallengeDTO.challengeId) &&
        Objects.equals(this.createdDate, completedChallengeDTO.createdDate) &&
        Objects.equals(this.description, completedChallengeDTO.description) &&
        Objects.equals(this.id, completedChallengeDTO.id) &&
        Objects.equals(this.registeredUserId, completedChallengeDTO.registeredUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeId, createdDate, description, id, registeredUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletedChallengeDTO {\n");
    
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registeredUserId: ").append(toIndentedString(registeredUserId)).append("\n");
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

