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
 * ActivityViewAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T15:03:00.314+05:30[Asia/Calcutta]")

public class ActivityViewAggregate   {
  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("challengeId")
  private Long challengeId = null;

  @JsonProperty("challengeName")
  private String challengeName = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("imageString")
  private String imageString = null;

  @JsonProperty("imageStringContentType")
  private String imageStringContentType = null;

  @JsonProperty("title")
  private String title = null;

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

  public ActivityViewAggregate activityId(Long activityId) {
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

  public ActivityViewAggregate challengeId(Long challengeId) {
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

  public ActivityViewAggregate challengeName(String challengeName) {
    this.challengeName = challengeName;
    return this;
  }

  /**
   * Get challengeName
   * @return challengeName
  **/
  @ApiModelProperty(value = "")


  public String getChallengeName() {
    return challengeName;
  }

  public void setChallengeName(String challengeName) {
    this.challengeName = challengeName;
  }

  public ActivityViewAggregate createdDate(OffsetDateTime createdDate) {
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

  public ActivityViewAggregate imageString(String imageString) {
    this.imageString = imageString;
    return this;
  }

  /**
   * Get imageString
   * @return imageString
  **/
  @ApiModelProperty(value = "")


  public String getImageString() {
    return imageString;
  }

  public void setImageString(String imageString) {
    this.imageString = imageString;
  }

  public ActivityViewAggregate imageStringContentType(String imageStringContentType) {
    this.imageStringContentType = imageStringContentType;
    return this;
  }

  /**
   * Get imageStringContentType
   * @return imageStringContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageStringContentType() {
    return imageStringContentType;
  }

  public void setImageStringContentType(String imageStringContentType) {
    this.imageStringContentType = imageStringContentType;
  }

  public ActivityViewAggregate title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ActivityViewAggregate type(TypeEnum type) {
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
    ActivityViewAggregate activityViewAggregate = (ActivityViewAggregate) o;
    return Objects.equals(this.activityId, activityViewAggregate.activityId) &&
        Objects.equals(this.challengeId, activityViewAggregate.challengeId) &&
        Objects.equals(this.challengeName, activityViewAggregate.challengeName) &&
        Objects.equals(this.createdDate, activityViewAggregate.createdDate) &&
        Objects.equals(this.imageString, activityViewAggregate.imageString) &&
        Objects.equals(this.imageStringContentType, activityViewAggregate.imageStringContentType) &&
        Objects.equals(this.title, activityViewAggregate.title) &&
        Objects.equals(this.type, activityViewAggregate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, challengeId, challengeName, createdDate, imageString, imageStringContentType, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityViewAggregate {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    challengeName: ").append(toIndentedString(challengeName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    imageString: ").append(toIndentedString(imageString)).append("\n");
    sb.append("    imageStringContentType: ").append(toIndentedString(imageStringContentType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

