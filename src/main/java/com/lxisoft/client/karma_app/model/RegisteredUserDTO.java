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
 * RegisteredUserDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-12T10:08:37.448866800+05:30[Asia/Calcutta]")

public class RegisteredUserDTO   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("noOfBronzeMedals")
  private Long noOfBronzeMedals = null;

  @JsonProperty("noOfCoins")
  private Long noOfCoins = null;

  @JsonProperty("noOfGoldMedals")
  private Long noOfGoldMedals = null;

  @JsonProperty("noOfSilverMedals")
  private Long noOfSilverMedals = null;

  @JsonProperty("phoneNumber")
  private Long phoneNumber = null;

  @JsonProperty("profilePicId")
  private Long profilePicId = null;

  @JsonProperty("userId")
  private String userId = null;

  public RegisteredUserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RegisteredUserDTO firstName(String firstName) {
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

  public RegisteredUserDTO id(Long id) {
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

  public RegisteredUserDTO lastName(String lastName) {
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

  public RegisteredUserDTO noOfBronzeMedals(Long noOfBronzeMedals) {
    this.noOfBronzeMedals = noOfBronzeMedals;
    return this;
  }

  /**
   * Get noOfBronzeMedals
   * @return noOfBronzeMedals
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfBronzeMedals() {
    return noOfBronzeMedals;
  }

  public void setNoOfBronzeMedals(Long noOfBronzeMedals) {
    this.noOfBronzeMedals = noOfBronzeMedals;
  }

  public RegisteredUserDTO noOfCoins(Long noOfCoins) {
    this.noOfCoins = noOfCoins;
    return this;
  }

  /**
   * Get noOfCoins
   * @return noOfCoins
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfCoins() {
    return noOfCoins;
  }

  public void setNoOfCoins(Long noOfCoins) {
    this.noOfCoins = noOfCoins;
  }

  public RegisteredUserDTO noOfGoldMedals(Long noOfGoldMedals) {
    this.noOfGoldMedals = noOfGoldMedals;
    return this;
  }

  /**
   * Get noOfGoldMedals
   * @return noOfGoldMedals
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfGoldMedals() {
    return noOfGoldMedals;
  }

  public void setNoOfGoldMedals(Long noOfGoldMedals) {
    this.noOfGoldMedals = noOfGoldMedals;
  }

  public RegisteredUserDTO noOfSilverMedals(Long noOfSilverMedals) {
    this.noOfSilverMedals = noOfSilverMedals;
    return this;
  }

  /**
   * Get noOfSilverMedals
   * @return noOfSilverMedals
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfSilverMedals() {
    return noOfSilverMedals;
  }

  public void setNoOfSilverMedals(Long noOfSilverMedals) {
    this.noOfSilverMedals = noOfSilverMedals;
  }

  public RegisteredUserDTO phoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RegisteredUserDTO profilePicId(Long profilePicId) {
    this.profilePicId = profilePicId;
    return this;
  }

  /**
   * Get profilePicId
   * @return profilePicId
  **/
  @ApiModelProperty(value = "")


  public Long getProfilePicId() {
    return profilePicId;
  }

  public void setProfilePicId(Long profilePicId) {
    this.profilePicId = profilePicId;
  }

  public RegisteredUserDTO userId(String userId) {
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
    RegisteredUserDTO registeredUserDTO = (RegisteredUserDTO) o;
    return Objects.equals(this.email, registeredUserDTO.email) &&
        Objects.equals(this.firstName, registeredUserDTO.firstName) &&
        Objects.equals(this.id, registeredUserDTO.id) &&
        Objects.equals(this.lastName, registeredUserDTO.lastName) &&
        Objects.equals(this.noOfBronzeMedals, registeredUserDTO.noOfBronzeMedals) &&
        Objects.equals(this.noOfCoins, registeredUserDTO.noOfCoins) &&
        Objects.equals(this.noOfGoldMedals, registeredUserDTO.noOfGoldMedals) &&
        Objects.equals(this.noOfSilverMedals, registeredUserDTO.noOfSilverMedals) &&
        Objects.equals(this.phoneNumber, registeredUserDTO.phoneNumber) &&
        Objects.equals(this.profilePicId, registeredUserDTO.profilePicId) &&
        Objects.equals(this.userId, registeredUserDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, noOfBronzeMedals, noOfCoins, noOfGoldMedals, noOfSilverMedals, phoneNumber, profilePicId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredUserDTO {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    noOfBronzeMedals: ").append(toIndentedString(noOfBronzeMedals)).append("\n");
    sb.append("    noOfCoins: ").append(toIndentedString(noOfCoins)).append("\n");
    sb.append("    noOfGoldMedals: ").append(toIndentedString(noOfGoldMedals)).append("\n");
    sb.append("    noOfSilverMedals: ").append(toIndentedString(noOfSilverMedals)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    profilePicId: ").append(toIndentedString(profilePicId)).append("\n");
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

