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
 * ActivityImageAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-30T11:09:57.665387700+05:30[Asia/Calcutta]")

public class ActivityImageAggregate   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("imageString")
  private String imageString = null;

  @JsonProperty("imageStringContentType")
  private String imageStringContentType = null;

  @JsonProperty("story")
  private String story = null;

  public ActivityImageAggregate id(Long id) {
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

  public ActivityImageAggregate imageString(String imageString) {
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

  public ActivityImageAggregate imageStringContentType(String imageStringContentType) {
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

  public ActivityImageAggregate story(String story) {
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
    ActivityImageAggregate activityImageAggregate = (ActivityImageAggregate) o;
    return Objects.equals(this.id, activityImageAggregate.id) &&
        Objects.equals(this.imageString, activityImageAggregate.imageString) &&
        Objects.equals(this.imageStringContentType, activityImageAggregate.imageStringContentType) &&
        Objects.equals(this.story, activityImageAggregate.story);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, imageString, imageStringContentType, story);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityImageAggregate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageString: ").append(toIndentedString(imageString)).append("\n");
    sb.append("    imageStringContentType: ").append(toIndentedString(imageStringContentType)).append("\n");
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

