package com.felixsoinfotech.karma_gateway.client.karma.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisteredUserAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T14:15:21.213+05:30[Asia/Calcutta]")

public class RegisteredUserAggregate   {
  @JsonProperty("coverPhoto")
  private String coverPhoto = null;

  @JsonProperty("coverPhotoContentType")
  private String coverPhotoContentType = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("noOfCompletedTasks")
  private Long noOfCompletedTasks = null;

  @JsonProperty("noOfLoves")
  private Long noOfLoves = null;

  @JsonProperty("profilePicture")
  private String profilePicture = null;

  @JsonProperty("profilePictureContentType")
  private String profilePictureContentType = null;

  @JsonProperty("userId")
  private String userId = null;

  public RegisteredUserAggregate coverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
    return this;
  }

  /**
   * Get coverPhoto
   * @return coverPhoto
  **/
  @ApiModelProperty(value = "")


  public String getCoverPhoto() {
    return coverPhoto;
  }

  public void setCoverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
  }

  public RegisteredUserAggregate coverPhotoContentType(String coverPhotoContentType) {
    this.coverPhotoContentType = coverPhotoContentType;
    return this;
  }

  /**
   * Get coverPhotoContentType
   * @return coverPhotoContentType
  **/
  @ApiModelProperty(value = "")


  public String getCoverPhotoContentType() {
    return coverPhotoContentType;
  }

  public void setCoverPhotoContentType(String coverPhotoContentType) {
    this.coverPhotoContentType = coverPhotoContentType;
  }

  public RegisteredUserAggregate email(String email) {
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

  public RegisteredUserAggregate firstName(String firstName) {
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

  public RegisteredUserAggregate id(Long id) {
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

  public RegisteredUserAggregate lastName(String lastName) {
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

  public RegisteredUserAggregate noOfCompletedTasks(Long noOfCompletedTasks) {
    this.noOfCompletedTasks = noOfCompletedTasks;
    return this;
  }

  /**
   * Get noOfCompletedTasks
   * @return noOfCompletedTasks
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfCompletedTasks() {
    return noOfCompletedTasks;
  }

  public void setNoOfCompletedTasks(Long noOfCompletedTasks) {
    this.noOfCompletedTasks = noOfCompletedTasks;
  }

  public RegisteredUserAggregate noOfLoves(Long noOfLoves) {
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

  public RegisteredUserAggregate profilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

  /**
   * Get profilePicture
   * @return profilePicture
  **/
  @ApiModelProperty(value = "")


  public String getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }

  public RegisteredUserAggregate profilePictureContentType(String profilePictureContentType) {
    this.profilePictureContentType = profilePictureContentType;
    return this;
  }

  /**
   * Get profilePictureContentType
   * @return profilePictureContentType
  **/
  @ApiModelProperty(value = "")


  public String getProfilePictureContentType() {
    return profilePictureContentType;
  }

  public void setProfilePictureContentType(String profilePictureContentType) {
    this.profilePictureContentType = profilePictureContentType;
  }

  public RegisteredUserAggregate userId(String userId) {
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
    RegisteredUserAggregate registeredUserAggregate = (RegisteredUserAggregate) o;
    return Objects.equals(this.coverPhoto, registeredUserAggregate.coverPhoto) &&
        Objects.equals(this.coverPhotoContentType, registeredUserAggregate.coverPhotoContentType) &&
        Objects.equals(this.email, registeredUserAggregate.email) &&
        Objects.equals(this.firstName, registeredUserAggregate.firstName) &&
        Objects.equals(this.id, registeredUserAggregate.id) &&
        Objects.equals(this.lastName, registeredUserAggregate.lastName) &&
        Objects.equals(this.noOfCompletedTasks, registeredUserAggregate.noOfCompletedTasks) &&
        Objects.equals(this.noOfLoves, registeredUserAggregate.noOfLoves) &&
        Objects.equals(this.profilePicture, registeredUserAggregate.profilePicture) &&
        Objects.equals(this.profilePictureContentType, registeredUserAggregate.profilePictureContentType) &&
        Objects.equals(this.userId, registeredUserAggregate.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverPhoto, coverPhotoContentType, email, firstName, id, lastName, noOfCompletedTasks, noOfLoves, profilePicture, profilePictureContentType, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredUserAggregate {\n");
    
    sb.append("    coverPhoto: ").append(toIndentedString(coverPhoto)).append("\n");
    sb.append("    coverPhotoContentType: ").append(toIndentedString(coverPhotoContentType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    noOfCompletedTasks: ").append(toIndentedString(noOfCompletedTasks)).append("\n");
    sb.append("    noOfLoves: ").append(toIndentedString(noOfLoves)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    profilePictureContentType: ").append(toIndentedString(profilePictureContentType)).append("\n");
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

