package com.lxisoft.client.karma_app.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.lxisoft.client.karma_app.model.CompletedActivity;
import com.lxisoft.client.karma_app.model.InstructionVideo;
import com.lxisoft.client.karma_app.model.Media;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Activity
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-15T16:28:11.676+05:30[Asia/Calcutta]")

public class Activity   {
  @JsonProperty("completedActivities")
  @Valid
  private List<CompletedActivity> completedActivities = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("files")
  @Valid
  private List<Media> files = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("instructionVideo")
  private InstructionVideo instructionVideo = null;

  @JsonProperty("successMessage")
  private String successMessage = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("url")
  private String url = null;

  public Activity completedActivities(List<CompletedActivity> completedActivities) {
    this.completedActivities = completedActivities;
    return this;
  }

  public Activity addCompletedActivitiesItem(CompletedActivity completedActivitiesItem) {
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

  public Activity description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Activity files(List<Media> files) {
    this.files = files;
    return this;
  }

  public Activity addFilesItem(Media filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<Media>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Media> getFiles() {
    return files;
  }

  public void setFiles(List<Media> files) {
    this.files = files;
  }

  public Activity id(Long id) {
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

  public Activity instructionVideo(InstructionVideo instructionVideo) {
    this.instructionVideo = instructionVideo;
    return this;
  }

  /**
   * Get instructionVideo
   * @return instructionVideo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstructionVideo getInstructionVideo() {
    return instructionVideo;
  }

  public void setInstructionVideo(InstructionVideo instructionVideo) {
    this.instructionVideo = instructionVideo;
  }

  public Activity successMessage(String successMessage) {
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

  public Activity title(String title) {
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

  public Activity url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.completedActivities, activity.completedActivities) &&
        Objects.equals(this.description, activity.description) &&
        Objects.equals(this.files, activity.files) &&
        Objects.equals(this.id, activity.id) &&
        Objects.equals(this.instructionVideo, activity.instructionVideo) &&
        Objects.equals(this.successMessage, activity.successMessage) &&
        Objects.equals(this.title, activity.title) &&
        Objects.equals(this.url, activity.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedActivities, description, files, id, instructionVideo, successMessage, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    completedActivities: ").append(toIndentedString(completedActivities)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructionVideo: ").append(toIndentedString(instructionVideo)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

