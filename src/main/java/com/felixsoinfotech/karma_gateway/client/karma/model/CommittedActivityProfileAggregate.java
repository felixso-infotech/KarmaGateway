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
 * CommittedActivityProfileAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-20T16:08:25.471549800+05:30[Asia/Calcutta]")

public class CommittedActivityProfileAggregate   {
  @JsonProperty("activityCreatedDate")
  private OffsetDateTime activityCreatedDate = null;

  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("activityImageContentType")
  private String activityImageContentType = null;

  @JsonProperty("activityImageString")
  private String activityImageString = null;

  @JsonProperty("activityTitle")
  private String activityTitle = null;

  @JsonProperty("committedActivityId")
  private Long committedActivityId = null;

  @JsonProperty("noOfLoves")
  private Long noOfLoves = null;

  @JsonProperty("proofImageContentType")
  private String proofImageContentType = null;

  @JsonProperty("proofImageString")
  private String proofImageString = null;

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

  @JsonProperty("timeElapsed")
  private String timeElapsed = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SINGLE("SINGLE"),
    
    TEAM("TEAM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public CommittedActivityProfileAggregate activityCreatedDate(OffsetDateTime activityCreatedDate) {
    this.activityCreatedDate = activityCreatedDate;
    return this;
  }

  /**
   * Get activityCreatedDate
   * @return activityCreatedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getActivityCreatedDate() {
    return activityCreatedDate;
  }

  public void setActivityCreatedDate(OffsetDateTime activityCreatedDate) {
    this.activityCreatedDate = activityCreatedDate;
  }

  public CommittedActivityProfileAggregate activityId(Long activityId) {
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

  public CommittedActivityProfileAggregate activityImageContentType(String activityImageContentType) {
    this.activityImageContentType = activityImageContentType;
    return this;
  }

  /**
   * Get activityImageContentType
   * @return activityImageContentType
  **/
  @ApiModelProperty(value = "")


  public String getActivityImageContentType() {
    return activityImageContentType;
  }

  public void setActivityImageContentType(String activityImageContentType) {
    this.activityImageContentType = activityImageContentType;
  }

  public CommittedActivityProfileAggregate activityImageString(String activityImageString) {
    this.activityImageString = activityImageString;
    return this;
  }

  /**
   * Get activityImageString
   * @return activityImageString
  **/
  @ApiModelProperty(value = "")


  public String getActivityImageString() {
    return activityImageString;
  }

  public void setActivityImageString(String activityImageString) {
    this.activityImageString = activityImageString;
  }

  public CommittedActivityProfileAggregate activityTitle(String activityTitle) {
    this.activityTitle = activityTitle;
    return this;
  }

  /**
   * Get activityTitle
   * @return activityTitle
  **/
  @ApiModelProperty(value = "")


  public String getActivityTitle() {
    return activityTitle;
  }

  public void setActivityTitle(String activityTitle) {
    this.activityTitle = activityTitle;
  }

  public CommittedActivityProfileAggregate committedActivityId(Long committedActivityId) {
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

  public CommittedActivityProfileAggregate noOfLoves(Long noOfLoves) {
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

  public CommittedActivityProfileAggregate proofImageContentType(String proofImageContentType) {
    this.proofImageContentType = proofImageContentType;
    return this;
  }

  /**
   * Get proofImageContentType
   * @return proofImageContentType
  **/
  @ApiModelProperty(value = "")


  public String getProofImageContentType() {
    return proofImageContentType;
  }

  public void setProofImageContentType(String proofImageContentType) {
    this.proofImageContentType = proofImageContentType;
  }

  public CommittedActivityProfileAggregate proofImageString(String proofImageString) {
    this.proofImageString = proofImageString;
    return this;
  }

  /**
   * Get proofImageString
   * @return proofImageString
  **/
  @ApiModelProperty(value = "")


  public String getProofImageString() {
    return proofImageString;
  }

  public void setProofImageString(String proofImageString) {
    this.proofImageString = proofImageString;
  }

  public CommittedActivityProfileAggregate status(StatusEnum status) {
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

  public CommittedActivityProfileAggregate timeElapsed(String timeElapsed) {
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

  public CommittedActivityProfileAggregate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommittedActivityProfileAggregate committedActivityProfileAggregate = (CommittedActivityProfileAggregate) o;
    return Objects.equals(this.activityCreatedDate, committedActivityProfileAggregate.activityCreatedDate) &&
        Objects.equals(this.activityId, committedActivityProfileAggregate.activityId) &&
        Objects.equals(this.activityImageContentType, committedActivityProfileAggregate.activityImageContentType) &&
        Objects.equals(this.activityImageString, committedActivityProfileAggregate.activityImageString) &&
        Objects.equals(this.activityTitle, committedActivityProfileAggregate.activityTitle) &&
        Objects.equals(this.committedActivityId, committedActivityProfileAggregate.committedActivityId) &&
        Objects.equals(this.noOfLoves, committedActivityProfileAggregate.noOfLoves) &&
        Objects.equals(this.proofImageContentType, committedActivityProfileAggregate.proofImageContentType) &&
        Objects.equals(this.proofImageString, committedActivityProfileAggregate.proofImageString) &&
        Objects.equals(this.status, committedActivityProfileAggregate.status) &&
        Objects.equals(this.timeElapsed, committedActivityProfileAggregate.timeElapsed) &&
        Objects.equals(this.type, committedActivityProfileAggregate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCreatedDate, activityId, activityImageContentType, activityImageString, activityTitle, committedActivityId, noOfLoves, proofImageContentType, proofImageString, status, timeElapsed, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedActivityProfileAggregate {\n");
    
    sb.append("    activityCreatedDate: ").append(toIndentedString(activityCreatedDate)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityImageContentType: ").append(toIndentedString(activityImageContentType)).append("\n");
    sb.append("    activityImageString: ").append(toIndentedString(activityImageString)).append("\n");
    sb.append("    activityTitle: ").append(toIndentedString(activityTitle)).append("\n");
    sb.append("    committedActivityId: ").append(toIndentedString(committedActivityId)).append("\n");
    sb.append("    noOfLoves: ").append(toIndentedString(noOfLoves)).append("\n");
    sb.append("    proofImageContentType: ").append(toIndentedString(proofImageContentType)).append("\n");
    sb.append("    proofImageString: ").append(toIndentedString(proofImageString)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

