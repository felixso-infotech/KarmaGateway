package com.felixsoinfotech.karma_gateway.client.karma.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.felixsoinfotech.karma_gateway.client.karma.model.DimensionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommittedActivityAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-20T16:08:25.471549800+05:30[Asia/Calcutta]")

public class CommittedActivityAggregate   {
  @JsonProperty("activityCreatedDate")
  private OffsetDateTime activityCreatedDate = null;

  @JsonProperty("activityDescription")
  private String activityDescription = null;

  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("challengeId")
  private Long challengeId = null;

  @JsonProperty("committedActivityDescription")
  private String committedActivityDescription = null;

  @JsonProperty("committedActivityId")
  private Long committedActivityId = null;

  @JsonProperty("dimensions")
  @Valid
  private List<DimensionDTO> dimensions = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("imageString")
  private String imageString = null;

  @JsonProperty("imageStringContentType")
  private String imageStringContentType = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("liked")
  private Boolean liked = null;

  @JsonProperty("likedUserPhotos")
  @Valid
  private List<String> likedUserPhotos = null;

  @JsonProperty("noOfComments")
  private Long noOfComments = null;

  @JsonProperty("noOfLoves")
  private Long noOfLoves = null;

  @JsonProperty("noOfReferences")
  private Long noOfReferences = null;

  @JsonProperty("profilePicture")
  private String profilePicture = null;

  @JsonProperty("profilePictureContentType")
  private String profilePictureContentType = null;

  /**
   * Gets or Sets proofType
   */
  public enum ProofTypeEnum {
    IMAGE("IMAGE"),
    
    VIDEO("VIDEO"),
    
    TEXT("TEXT"),
    
    PDF("PDF"),
    
    PPT("PPT"),
    
    DOC("DOC"),
    
    XLX("XLX");

    private String value;

    ProofTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProofTypeEnum fromValue(String text) {
      for (ProofTypeEnum b : ProofTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("proofType")
  private ProofTypeEnum proofType = null;

  @JsonProperty("successMessage")
  private String successMessage = null;

  @JsonProperty("timeElapsed")
  private String timeElapsed = null;

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

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("videoString")
  private String videoString = null;

  @JsonProperty("videoStringContentType")
  private String videoStringContentType = null;

  public CommittedActivityAggregate activityCreatedDate(OffsetDateTime activityCreatedDate) {
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

  public CommittedActivityAggregate activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * Get activityDescription
   * @return activityDescription
  **/
  @ApiModelProperty(value = "")


  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public CommittedActivityAggregate activityId(Long activityId) {
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

  public CommittedActivityAggregate challengeId(Long challengeId) {
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

  public CommittedActivityAggregate committedActivityDescription(String committedActivityDescription) {
    this.committedActivityDescription = committedActivityDescription;
    return this;
  }

  /**
   * Get committedActivityDescription
   * @return committedActivityDescription
  **/
  @ApiModelProperty(value = "")


  public String getCommittedActivityDescription() {
    return committedActivityDescription;
  }

  public void setCommittedActivityDescription(String committedActivityDescription) {
    this.committedActivityDescription = committedActivityDescription;
  }

  public CommittedActivityAggregate committedActivityId(Long committedActivityId) {
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

  public CommittedActivityAggregate dimensions(List<DimensionDTO> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public CommittedActivityAggregate addDimensionsItem(DimensionDTO dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<DimensionDTO>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

  /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DimensionDTO> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<DimensionDTO> dimensions) {
    this.dimensions = dimensions;
  }

  public CommittedActivityAggregate firstName(String firstName) {
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

  public CommittedActivityAggregate imageString(String imageString) {
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

  public CommittedActivityAggregate imageStringContentType(String imageStringContentType) {
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

  public CommittedActivityAggregate lastName(String lastName) {
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

  public CommittedActivityAggregate liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * Get liked
   * @return liked
  **/
  @ApiModelProperty(value = "")


  public Boolean isLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public CommittedActivityAggregate likedUserPhotos(List<String> likedUserPhotos) {
    this.likedUserPhotos = likedUserPhotos;
    return this;
  }

  public CommittedActivityAggregate addLikedUserPhotosItem(String likedUserPhotosItem) {
    if (this.likedUserPhotos == null) {
      this.likedUserPhotos = new ArrayList<String>();
    }
    this.likedUserPhotos.add(likedUserPhotosItem);
    return this;
  }

  /**
   * Get likedUserPhotos
   * @return likedUserPhotos
  **/
  @ApiModelProperty(value = "")


  public List<String> getLikedUserPhotos() {
    return likedUserPhotos;
  }

  public void setLikedUserPhotos(List<String> likedUserPhotos) {
    this.likedUserPhotos = likedUserPhotos;
  }

  public CommittedActivityAggregate noOfComments(Long noOfComments) {
    this.noOfComments = noOfComments;
    return this;
  }

  /**
   * Get noOfComments
   * @return noOfComments
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfComments() {
    return noOfComments;
  }

  public void setNoOfComments(Long noOfComments) {
    this.noOfComments = noOfComments;
  }

  public CommittedActivityAggregate noOfLoves(Long noOfLoves) {
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

  public CommittedActivityAggregate noOfReferences(Long noOfReferences) {
    this.noOfReferences = noOfReferences;
    return this;
  }

  /**
   * Get noOfReferences
   * @return noOfReferences
  **/
  @ApiModelProperty(value = "")


  public Long getNoOfReferences() {
    return noOfReferences;
  }

  public void setNoOfReferences(Long noOfReferences) {
    this.noOfReferences = noOfReferences;
  }

  public CommittedActivityAggregate profilePicture(String profilePicture) {
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

  public CommittedActivityAggregate profilePictureContentType(String profilePictureContentType) {
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

  public CommittedActivityAggregate proofType(ProofTypeEnum proofType) {
    this.proofType = proofType;
    return this;
  }

  /**
   * Get proofType
   * @return proofType
  **/
  @ApiModelProperty(value = "")


  public ProofTypeEnum getProofType() {
    return proofType;
  }

  public void setProofType(ProofTypeEnum proofType) {
    this.proofType = proofType;
  }

  public CommittedActivityAggregate successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

  /**
   * Get successMessage
   * @return successMessage
  **/
  @ApiModelProperty(value = "")


  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  public CommittedActivityAggregate timeElapsed(String timeElapsed) {
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

  public CommittedActivityAggregate title(String title) {
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

  public CommittedActivityAggregate type(TypeEnum type) {
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

  public CommittedActivityAggregate userId(String userId) {
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

  public CommittedActivityAggregate videoString(String videoString) {
    this.videoString = videoString;
    return this;
  }

  /**
   * Get videoString
   * @return videoString
  **/
  @ApiModelProperty(value = "")


  public String getVideoString() {
    return videoString;
  }

  public void setVideoString(String videoString) {
    this.videoString = videoString;
  }

  public CommittedActivityAggregate videoStringContentType(String videoStringContentType) {
    this.videoStringContentType = videoStringContentType;
    return this;
  }

  /**
   * Get videoStringContentType
   * @return videoStringContentType
  **/
  @ApiModelProperty(value = "")


  public String getVideoStringContentType() {
    return videoStringContentType;
  }

  public void setVideoStringContentType(String videoStringContentType) {
    this.videoStringContentType = videoStringContentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommittedActivityAggregate committedActivityAggregate = (CommittedActivityAggregate) o;
    return Objects.equals(this.activityCreatedDate, committedActivityAggregate.activityCreatedDate) &&
        Objects.equals(this.activityDescription, committedActivityAggregate.activityDescription) &&
        Objects.equals(this.activityId, committedActivityAggregate.activityId) &&
        Objects.equals(this.challengeId, committedActivityAggregate.challengeId) &&
        Objects.equals(this.committedActivityDescription, committedActivityAggregate.committedActivityDescription) &&
        Objects.equals(this.committedActivityId, committedActivityAggregate.committedActivityId) &&
        Objects.equals(this.dimensions, committedActivityAggregate.dimensions) &&
        Objects.equals(this.firstName, committedActivityAggregate.firstName) &&
        Objects.equals(this.imageString, committedActivityAggregate.imageString) &&
        Objects.equals(this.imageStringContentType, committedActivityAggregate.imageStringContentType) &&
        Objects.equals(this.lastName, committedActivityAggregate.lastName) &&
        Objects.equals(this.liked, committedActivityAggregate.liked) &&
        Objects.equals(this.likedUserPhotos, committedActivityAggregate.likedUserPhotos) &&
        Objects.equals(this.noOfComments, committedActivityAggregate.noOfComments) &&
        Objects.equals(this.noOfLoves, committedActivityAggregate.noOfLoves) &&
        Objects.equals(this.noOfReferences, committedActivityAggregate.noOfReferences) &&
        Objects.equals(this.profilePicture, committedActivityAggregate.profilePicture) &&
        Objects.equals(this.profilePictureContentType, committedActivityAggregate.profilePictureContentType) &&
        Objects.equals(this.proofType, committedActivityAggregate.proofType) &&
        Objects.equals(this.successMessage, committedActivityAggregate.successMessage) &&
        Objects.equals(this.timeElapsed, committedActivityAggregate.timeElapsed) &&
        Objects.equals(this.title, committedActivityAggregate.title) &&
        Objects.equals(this.type, committedActivityAggregate.type) &&
        Objects.equals(this.userId, committedActivityAggregate.userId) &&
        Objects.equals(this.videoString, committedActivityAggregate.videoString) &&
        Objects.equals(this.videoStringContentType, committedActivityAggregate.videoStringContentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCreatedDate, activityDescription, activityId, challengeId, committedActivityDescription, committedActivityId, dimensions, firstName, imageString, imageStringContentType, lastName, liked, likedUserPhotos, noOfComments, noOfLoves, noOfReferences, profilePicture, profilePictureContentType, proofType, successMessage, timeElapsed, title, type, userId, videoString, videoStringContentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedActivityAggregate {\n");
    
    sb.append("    activityCreatedDate: ").append(toIndentedString(activityCreatedDate)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    committedActivityDescription: ").append(toIndentedString(committedActivityDescription)).append("\n");
    sb.append("    committedActivityId: ").append(toIndentedString(committedActivityId)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    imageString: ").append(toIndentedString(imageString)).append("\n");
    sb.append("    imageStringContentType: ").append(toIndentedString(imageStringContentType)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likedUserPhotos: ").append(toIndentedString(likedUserPhotos)).append("\n");
    sb.append("    noOfComments: ").append(toIndentedString(noOfComments)).append("\n");
    sb.append("    noOfLoves: ").append(toIndentedString(noOfLoves)).append("\n");
    sb.append("    noOfReferences: ").append(toIndentedString(noOfReferences)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    profilePictureContentType: ").append(toIndentedString(profilePictureContentType)).append("\n");
    sb.append("    proofType: ").append(toIndentedString(proofType)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    videoString: ").append(toIndentedString(videoString)).append("\n");
    sb.append("    videoStringContentType: ").append(toIndentedString(videoStringContentType)).append("\n");
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

