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
 * RegisteredUserModel
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-08T14:53:19.796+05:30[Asia/Calcutta]")

public class RegisteredUserModel   {
  @JsonProperty("currentUser")
  private RegisteredUser currentUser = null;

  @JsonProperty("registeredUser")
  private RegisteredUser registeredUser = null;

  public RegisteredUserModel currentUser(RegisteredUser currentUser) {
    this.currentUser = currentUser;
    return this;
  }

  /**
   * Get currentUser
   * @return currentUser
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RegisteredUser getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(RegisteredUser currentUser) {
    this.currentUser = currentUser;
  }

  public RegisteredUserModel registeredUser(RegisteredUser registeredUser) {
    this.registeredUser = registeredUser;
    return this;
  }

  /**
   * Get registeredUser
   * @return registeredUser
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RegisteredUser getRegisteredUser() {
    return registeredUser;
  }

  public void setRegisteredUser(RegisteredUser registeredUser) {
    this.registeredUser = registeredUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredUserModel registeredUserModel = (RegisteredUserModel) o;
    return Objects.equals(this.currentUser, registeredUserModel.currentUser) &&
        Objects.equals(this.registeredUser, registeredUserModel.registeredUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentUser, registeredUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredUserModel {\n");
    
    sb.append("    currentUser: ").append(toIndentedString(currentUser)).append("\n");
    sb.append("    registeredUser: ").append(toIndentedString(registeredUser)).append("\n");
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

