package com.felixsoinfotech.karma_gateway.client.karma.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommittedActivityStatusAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-29T11:28:54.218953800+05:30[Asia/Calcutta]")

public class CommittedActivityStatusAggregate   {
  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("committedActivityId")
  private Long committedActivityId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("proofFile")
  private byte[] proofFile = null;

  @JsonProperty("proofFileContentType")
  private String proofFileContentType = null;

  @JsonProperty("referenceId")
  private Long referenceId = null;

  @JsonProperty("registeredUserId")
  private Long registeredUserId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    TODO("TODO"),
    
    INPROGRESS("INPROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("userId")
  private String userId = null;

  public CommittedActivityStatusAggregate activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")


  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public CommittedActivityStatusAggregate committedActivityId(Long committedActivityId) {
    this.committedActivityId = committedActivityId;
    return this;
  }

  /**
   * Get committedActivityId
   * @return committedActivityId
  **/
  @ApiModelProperty(value = "")


  public Long getCommittedActivityId() {
    return committedActivityId;
  }

  public void setCommittedActivityId(Long committedActivityId) {
    this.committedActivityId = committedActivityId;
  }

  public CommittedActivityStatusAggregate createdDate(OffsetDateTime createdDate) {
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

  public CommittedActivityStatusAggregate description(String description) {
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

  public CommittedActivityStatusAggregate proofFile(byte[] proofFile) {
    this.proofFile = proofFile;
    return this;
  }

  /**
   * Get proofFile
   * @return proofFile
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getProofFile() {
    return proofFile;
  }

  public void setProofFile(byte[] proofFile) {
    this.proofFile = proofFile;
  }

  public CommittedActivityStatusAggregate proofFileContentType(String proofFileContentType) {
    this.proofFileContentType = proofFileContentType;
    return this;
  }

  /**
   * Get proofFileContentType
   * @return proofFileContentType
  **/
  @ApiModelProperty(value = "")


  public String getProofFileContentType() {
    return proofFileContentType;
  }

  public void setProofFileContentType(String proofFileContentType) {
    this.proofFileContentType = proofFileContentType;
  }

  public CommittedActivityStatusAggregate referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(value = "")


  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public CommittedActivityStatusAggregate registeredUserId(Long registeredUserId) {
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

  public CommittedActivityStatusAggregate status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CommittedActivityStatusAggregate userId(String userId) {
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
    CommittedActivityStatusAggregate committedActivityStatusAggregate = (CommittedActivityStatusAggregate) o;
    return Objects.equals(this.activityId, committedActivityStatusAggregate.activityId) &&
        Objects.equals(this.committedActivityId, committedActivityStatusAggregate.committedActivityId) &&
        Objects.equals(this.createdDate, committedActivityStatusAggregate.createdDate) &&
        Objects.equals(this.description, committedActivityStatusAggregate.description) &&
        Objects.equals(this.proofFile, committedActivityStatusAggregate.proofFile) &&
        Objects.equals(this.proofFileContentType, committedActivityStatusAggregate.proofFileContentType) &&
        Objects.equals(this.referenceId, committedActivityStatusAggregate.referenceId) &&
        Objects.equals(this.registeredUserId, committedActivityStatusAggregate.registeredUserId) &&
        Objects.equals(this.status, committedActivityStatusAggregate.status) &&
        Objects.equals(this.userId, committedActivityStatusAggregate.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, committedActivityId, createdDate, description, proofFile, proofFileContentType, referenceId, registeredUserId, status, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedActivityStatusAggregate {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    committedActivityId: ").append(toIndentedString(committedActivityId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    proofFile: ").append(toIndentedString(proofFile)).append("\n");
    sb.append("    proofFileContentType: ").append(toIndentedString(proofFileContentType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    registeredUserId: ").append(toIndentedString(registeredUserId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

