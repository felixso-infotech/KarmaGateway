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
 * IntroductionStoryDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:16:30.130+05:30[Asia/Calcutta]")

public class IntroductionStoryDTO   {
  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("story")
  private String story = null;

  public IntroductionStoryDTO activityId(Long activityId) {
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

  public IntroductionStoryDTO id(Long id) {
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

  public IntroductionStoryDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public IntroductionStoryDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public IntroductionStoryDTO story(String story) {
    this.story = story;
    return this;
  }

  /**
   * Get story
   * @return story
  **/
  @ApiModelProperty(value = "")


  public String getStory() {
    return story;
  }

  public void setStory(String story) {
    this.story = story;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntroductionStoryDTO introductionStoryDTO = (IntroductionStoryDTO) o;
    return Objects.equals(this.activityId, introductionStoryDTO.activityId) &&
        Objects.equals(this.id, introductionStoryDTO.id) &&
        Objects.equals(this.image, introductionStoryDTO.image) &&
        Objects.equals(this.imageContentType, introductionStoryDTO.imageContentType) &&
        Objects.equals(this.story, introductionStoryDTO.story);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, id, image, imageContentType, story);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntroductionStoryDTO {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
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

