package com.lxisoft.client.karma_app.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.lxisoft.client.karma_app.model.CompletedActivity;
import com.lxisoft.client.karma_app.model.Media;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisteredUser entity. @author Muhammed Ruhail
 */
@ApiModel(description = "RegisteredUser entity. @author Muhammed Ruhail")
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-15T16:28:11.676+05:30[Asia/Calcutta]")

public class RegisteredUser   {
  @JsonProperty("completedActivities")
  @Valid
  private List<CompletedActivity> completedActivities = null;

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

  @JsonProperty("profilePic")
  private Media profilePic = null;

  public RegisteredUser completedActivities(List<CompletedActivity> completedActivities) {
    this.completedActivities = completedActivities;
    return this;
  }

  public RegisteredUser addCompletedActivitiesItem(CompletedActivity completedActivitiesItem) {
    if (this.completedActivities == null) {
      this.completedActivities = new ArrayList<CompletedActivity>();
    }
    this.completedActivities.add(completedActivitiesItem);
    return this;
  }

  /**
   * Get completedActivities
   * @return completedActivities
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CompletedActivity> getCompletedActivities() {
    return completedActivities;
  }

  public void setCompletedActivities(List<CompletedActivity> completedActivities) {
    this.completedActivities = completedActivities;
  }

  public RegisteredUser email(String email) {
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

  public RegisteredUser firstName(String firstName) {
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

  public RegisteredUser id(Long id) {
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

  public RegisteredUser lastName(String lastName) {
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

  public RegisteredUser noOfBronzeMedals(Long noOfBronzeMedals) {
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

  public RegisteredUser noOfCoins(Long noOfCoins) {
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

  public RegisteredUser noOfGoldMedals(Long noOfGoldMedals) {
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

  public RegisteredUser noOfSilverMedals(Long noOfSilverMedals) {
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

  public RegisteredUser phoneNumber(Long phoneNumber) {
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

  public RegisteredUser profilePic(Media profilePic) {
    this.profilePic = profilePic;
    return this;
  }

  /**
   * Get profilePic
   * @return profilePic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Media getProfilePic() {
    return profilePic;
  }

  public void setProfilePic(Media profilePic) {
    this.profilePic = profilePic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredUser registeredUser = (RegisteredUser) o;
    return Objects.equals(this.completedActivities, registeredUser.completedActivities) &&
        Objects.equals(this.email, registeredUser.email) &&
        Objects.equals(this.firstName, registeredUser.firstName) &&
        Objects.equals(this.id, registeredUser.id) &&
        Objects.equals(this.lastName, registeredUser.lastName) &&
        Objects.equals(this.noOfBronzeMedals, registeredUser.noOfBronzeMedals) &&
        Objects.equals(this.noOfCoins, registeredUser.noOfCoins) &&
        Objects.equals(this.noOfGoldMedals, registeredUser.noOfGoldMedals) &&
        Objects.equals(this.noOfSilverMedals, registeredUser.noOfSilverMedals) &&
        Objects.equals(this.phoneNumber, registeredUser.phoneNumber) &&
        Objects.equals(this.profilePic, registeredUser.profilePic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedActivities, email, firstName, id, lastName, noOfBronzeMedals, noOfCoins, noOfGoldMedals, noOfSilverMedals, phoneNumber, profilePic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredUser {\n");
    
    sb.append("    completedActivities: ").append(toIndentedString(completedActivities)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    noOfBronzeMedals: ").append(toIndentedString(noOfBronzeMedals)).append("\n");
    sb.append("    noOfCoins: ").append(toIndentedString(noOfCoins)).append("\n");
    sb.append("    noOfGoldMedals: ").append(toIndentedString(noOfGoldMedals)).append("\n");
    sb.append("    noOfSilverMedals: ").append(toIndentedString(noOfSilverMedals)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    profilePic: ").append(toIndentedString(profilePic)).append("\n");
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

