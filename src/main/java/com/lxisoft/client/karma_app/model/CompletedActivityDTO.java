package com.lxisoft.client.karma_app.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompletedActivityDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-22T16:56:02.120142700+05:30[Asia/Calcutta]")

public class CompletedActivityDTO   {
  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("registeredUserId")
  private Long registeredUserId = null;

  public CompletedActivityDTO activityId(Long activityId) {
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

  public CompletedActivityDTO id(Long id) {
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

  public CompletedActivityDTO registeredUserId(Long registeredUserId) {
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
    CompletedActivityDTO completedActivityDTO = (CompletedActivityDTO) o;
    return Objects.equals(this.activityId, completedActivityDTO.activityId) &&
        Objects.equals(this.id, completedActivityDTO.id) &&
        Objects.equals(this.registeredUserId, completedActivityDTO.registeredUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, id, registeredUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletedActivityDTO {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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

