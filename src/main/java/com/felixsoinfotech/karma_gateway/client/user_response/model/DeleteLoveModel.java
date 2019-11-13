package com.felixsoinfotech.karma_gateway.client.user_response.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeleteLoveModel
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-13T10:30:57.787246900+05:30[Asia/Calcutta]")

public class DeleteLoveModel   {
  @JsonProperty("commitedActivityId")
  private Long commitedActivityId = null;

  @JsonProperty("userId")
  private String userId = null;

  public DeleteLoveModel commitedActivityId(Long commitedActivityId) {
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

  public DeleteLoveModel userId(String userId) {
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
    DeleteLoveModel deleteLoveModel = (DeleteLoveModel) o;
    return Objects.equals(this.commitedActivityId, deleteLoveModel.commitedActivityId) &&
        Objects.equals(this.userId, deleteLoveModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitedActivityId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteLoveModel {\n");
    
    sb.append("    commitedActivityId: ").append(toIndentedString(commitedActivityId)).append("\n");
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

