package com.lxisoft.client.karma_app.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ActivityDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-22T10:47:15.115011400+05:30[Asia/Calcutta]")

public class ActivityDTO   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("encodedFiles")
  @Valid
  private List<String> encodedFiles = null;

  @JsonProperty("encodedInstructionVideo")
  private String encodedInstructionVideo = null;

  @JsonProperty("files")
  @Valid
  private List<Media> files = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("instructionVideo")
  private InstructionVideo instructionVideo = null;

  @JsonProperty("instructionVideoId")
  private Long instructionVideoId = null;

  @JsonProperty("successMessage")
  private String successMessage = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("url")
  private String url = null;

  public ActivityDTO description(String description) {
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

  public ActivityDTO encodedFiles(List<String> encodedFiles) {
    this.encodedFiles = encodedFiles;
    return this;
  }

  public ActivityDTO addEncodedFilesItem(String encodedFilesItem) {
    if (this.encodedFiles == null) {
      this.encodedFiles = new ArrayList<String>();
    }
    this.encodedFiles.add(encodedFilesItem);
    return this;
  }

  /**
   * Get encodedFiles
   * @return encodedFiles
  **/
  @ApiModelProperty(value = "")


  public List<String> getEncodedFiles() {
    return encodedFiles;
  }

  public void setEncodedFiles(List<String> encodedFiles) {
    this.encodedFiles = encodedFiles;
  }

  public ActivityDTO encodedInstructionVideo(String encodedInstructionVideo) {
    this.encodedInstructionVideo = encodedInstructionVideo;
    return this;
  }

  /**
   * Get encodedInstructionVideo
   * @return encodedInstructionVideo
  **/
  @ApiModelProperty(value = "")


  public String getEncodedInstructionVideo() {
    return encodedInstructionVideo;
  }

  public void setEncodedInstructionVideo(String encodedInstructionVideo) {
    this.encodedInstructionVideo = encodedInstructionVideo;
  }

  public ActivityDTO files(List<Media> files) {
    this.files = files;
    return this;
  }

  public ActivityDTO addFilesItem(Media filesItem) {
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

  public ActivityDTO id(Long id) {
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

  public ActivityDTO instructionVideo(InstructionVideo instructionVideo) {
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

  public ActivityDTO instructionVideoId(Long instructionVideoId) {
    this.instructionVideoId = instructionVideoId;
    return this;
  }

  /**
   * Get instructionVideoId
   * @return instructionVideoId
  **/
  @ApiModelProperty(value = "")


  public Long getInstructionVideoId() {
    return instructionVideoId;
  }

  public void setInstructionVideoId(Long instructionVideoId) {
    this.instructionVideoId = instructionVideoId;
  }

  public ActivityDTO successMessage(String successMessage) {
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

  public ActivityDTO title(String title) {
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

  public ActivityDTO url(String url) {
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
    ActivityDTO activityDTO = (ActivityDTO) o;
    return Objects.equals(this.description, activityDTO.description) &&
        Objects.equals(this.encodedFiles, activityDTO.encodedFiles) &&
        Objects.equals(this.encodedInstructionVideo, activityDTO.encodedInstructionVideo) &&
        Objects.equals(this.files, activityDTO.files) &&
        Objects.equals(this.id, activityDTO.id) &&
        Objects.equals(this.instructionVideo, activityDTO.instructionVideo) &&
        Objects.equals(this.instructionVideoId, activityDTO.instructionVideoId) &&
        Objects.equals(this.successMessage, activityDTO.successMessage) &&
        Objects.equals(this.title, activityDTO.title) &&
        Objects.equals(this.url, activityDTO.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, encodedFiles, encodedInstructionVideo, files, id, instructionVideo, instructionVideoId, successMessage, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encodedFiles: ").append(toIndentedString(encodedFiles)).append("\n");
    sb.append("    encodedInstructionVideo: ").append(toIndentedString(encodedInstructionVideo)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructionVideo: ").append(toIndentedString(instructionVideo)).append("\n");
    sb.append("    instructionVideoId: ").append(toIndentedString(instructionVideoId)).append("\n");
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

