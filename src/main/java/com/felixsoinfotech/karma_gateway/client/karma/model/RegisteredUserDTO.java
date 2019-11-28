package com.felixsoinfotech.karma_gateway.client.karma.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisteredUserDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-28T12:49:55.824+05:30[Asia/Calcutta]")

public class RegisteredUserDTO   {
  @JsonProperty("coverPhoto")
  private byte[] coverPhoto = null;

  @JsonProperty("coverPhotoContentType")
  private String coverPhotoContentType = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("profilePicture")
  private byte[] profilePicture = null;

  @JsonProperty("profilePictureContentType")
  private String profilePictureContentType = null;

  @JsonProperty("userId")
  private String userId = null;

  public RegisteredUserDTO coverPhoto(byte[] coverPhoto) {
    this.coverPhoto = coverPhoto;
    return this;
  }

  /**
   * Get coverPhoto
   * @return coverPhoto
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getCoverPhoto() {
    return coverPhoto;
  }

  public void setCoverPhoto(byte[] coverPhoto) {
    this.coverPhoto = coverPhoto;
  }

  public RegisteredUserDTO coverPhotoContentType(String coverPhotoContentType) {
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

  public RegisteredUserDTO createdDate(OffsetDateTime createdDate) {
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

  public RegisteredUserDTO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RegisteredUserDTO profilePicture(byte[] profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

  /**
   * Get profilePicture
   * @return profilePicture
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(byte[] profilePicture) {
    this.profilePicture = profilePicture;
  }

  public RegisteredUserDTO profilePictureContentType(String profilePictureContentType) {
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
    return Objects.equals(this.coverPhoto, registeredUserDTO.coverPhoto) &&
        Objects.equals(this.coverPhotoContentType, registeredUserDTO.coverPhotoContentType) &&
        Objects.equals(this.createdDate, registeredUserDTO.createdDate) &&
        Objects.equals(this.email, registeredUserDTO.email) &&
        Objects.equals(this.firstName, registeredUserDTO.firstName) &&
        Objects.equals(this.id, registeredUserDTO.id) &&
        Objects.equals(this.lastName, registeredUserDTO.lastName) &&
        Objects.equals(this.phoneNumber, registeredUserDTO.phoneNumber) &&
        Objects.equals(this.profilePicture, registeredUserDTO.profilePicture) &&
        Objects.equals(this.profilePictureContentType, registeredUserDTO.profilePictureContentType) &&
        Objects.equals(this.userId, registeredUserDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverPhoto, coverPhotoContentType, createdDate, email, firstName, id, lastName, phoneNumber, profilePicture, profilePictureContentType, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredUserDTO {\n");
    
    sb.append("    coverPhoto: ").append(toIndentedString(coverPhoto)).append("\n");
    sb.append("    coverPhotoContentType: ").append(toIndentedString(coverPhotoContentType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

