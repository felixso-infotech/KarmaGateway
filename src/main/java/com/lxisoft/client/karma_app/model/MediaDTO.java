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
 * MediaDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:30:16.473+05:30[Asia/Calcutta]")

public class MediaDTO   {
  @JsonProperty("activityId")
  private Long activityId = null;

  @JsonProperty("completedActivityId")
  private Long completedActivityId = null;

  @JsonProperty("file")
  private byte[] file = null;

  @JsonProperty("fileContentType")
  private String fileContentType = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("id")
  private Long id = null;

  public MediaDTO activityId(Long activityId) {
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

  public MediaDTO completedActivityId(Long completedActivityId) {
    this.completedActivityId = completedActivityId;
    return this;
  }

  /**
   * Get completedActivityId
   * @return completedActivityId
  **/
  @ApiModelProperty(value = "")


  public Long getCompletedActivityId() {
    return completedActivityId;
  }

  public void setCompletedActivityId(Long completedActivityId) {
    this.completedActivityId = completedActivityId;
  }

  public MediaDTO file(byte[] file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getFile() {
    return file;
  }

  public void setFile(byte[] file) {
    this.file = file;
  }

  public MediaDTO fileContentType(String fileContentType) {
    this.fileContentType = fileContentType;
    return this;
  }

  /**
   * Get fileContentType
   * @return fileContentType
  **/
  @ApiModelProperty(value = "")


  public String getFileContentType() {
    return fileContentType;
  }

  public void setFileContentType(String fileContentType) {
    this.fileContentType = fileContentType;
  }

  public MediaDTO fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public MediaDTO id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaDTO mediaDTO = (MediaDTO) o;
    return Objects.equals(this.activityId, mediaDTO.activityId) &&
        Objects.equals(this.completedActivityId, mediaDTO.completedActivityId) &&
        Objects.equals(this.file, mediaDTO.file) &&
        Objects.equals(this.fileContentType, mediaDTO.fileContentType) &&
        Objects.equals(this.fileName, mediaDTO.fileName) &&
        Objects.equals(this.id, mediaDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, completedActivityId, file, fileContentType, fileName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaDTO {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    completedActivityId: ").append(toIndentedString(completedActivityId)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fileContentType: ").append(toIndentedString(fileContentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

