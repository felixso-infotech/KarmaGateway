package com.felixsoinfotech.karma_gateway.client.friendship_service.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.felixsoinfotech.karma_gateway.client.friendship_service.model.RegisteredUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WellwisherAndRelationship
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-12T12:58:03.271+05:30[Asia/Calcutta]")

public class WellwisherAndRelationship   {
  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("wellWisher")
  private RegisteredUser wellWisher = null;

  public WellwisherAndRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
  **/
  @ApiModelProperty(value = "")


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public WellwisherAndRelationship wellWisher(RegisteredUser wellWisher) {
    this.wellWisher = wellWisher;
    return this;
  }

  /**
   * Get wellWisher
   * @return wellWisher
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RegisteredUser getWellWisher() {
    return wellWisher;
  }

  public void setWellWisher(RegisteredUser wellWisher) {
    this.wellWisher = wellWisher;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WellwisherAndRelationship wellwisherAndRelationship = (WellwisherAndRelationship) o;
    return Objects.equals(this.relationshipType, wellwisherAndRelationship.relationshipType) &&
        Objects.equals(this.wellWisher, wellwisherAndRelationship.wellWisher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipType, wellWisher);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WellwisherAndRelationship {\n");
    
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    wellWisher: ").append(toIndentedString(wellWisher)).append("\n");
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

