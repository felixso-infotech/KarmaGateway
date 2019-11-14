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
 * ActivityDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-14T11:39:47.531112900+05:30[Asia/Calcutta]")

public class ActivityDTO   {
  @JsonProperty("challengeId")
  private Long challengeId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dimensions")
  @Valid
  private List<DimensionDTO> dimensions = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isMultipleProofsRequired")
  private Boolean isMultipleProofsRequired = null;

  @JsonProperty("noOfPages")
  private Integer noOfPages = null;

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

  public ActivityDTO challengeId(Long challengeId) {
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

  public ActivityDTO createdDate(OffsetDateTime createdDate) {
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

  public ActivityDTO dimensions(List<DimensionDTO> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public ActivityDTO addDimensionsItem(DimensionDTO dimensionsItem) {
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

  public ActivityDTO isMultipleProofsRequired(Boolean isMultipleProofsRequired) {
    this.isMultipleProofsRequired = isMultipleProofsRequired;
    return this;
  }

  /**
   * Get isMultipleProofsRequired
   * @return isMultipleProofsRequired
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsMultipleProofsRequired() {
    return isMultipleProofsRequired;
  }

  public void setIsMultipleProofsRequired(Boolean isMultipleProofsRequired) {
    this.isMultipleProofsRequired = isMultipleProofsRequired;
  }

  public ActivityDTO noOfPages(Integer noOfPages) {
    this.noOfPages = noOfPages;
    return this;
  }

  /**
   * Get noOfPages
   * @return noOfPages
  **/
  @ApiModelProperty(value = "")


  public Integer getNoOfPages() {
    return noOfPages;
  }

  public void setNoOfPages(Integer noOfPages) {
    this.noOfPages = noOfPages;
  }

  public ActivityDTO proofType(ProofTypeEnum proofType) {
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

  public ActivityDTO type(TypeEnum type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityDTO activityDTO = (ActivityDTO) o;
    return Objects.equals(this.challengeId, activityDTO.challengeId) &&
        Objects.equals(this.createdDate, activityDTO.createdDate) &&
        Objects.equals(this.description, activityDTO.description) &&
        Objects.equals(this.dimensions, activityDTO.dimensions) &&
        Objects.equals(this.id, activityDTO.id) &&
        Objects.equals(this.isMultipleProofsRequired, activityDTO.isMultipleProofsRequired) &&
        Objects.equals(this.noOfPages, activityDTO.noOfPages) &&
        Objects.equals(this.proofType, activityDTO.proofType) &&
        Objects.equals(this.successMessage, activityDTO.successMessage) &&
        Objects.equals(this.title, activityDTO.title) &&
        Objects.equals(this.type, activityDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeId, createdDate, description, dimensions, id, isMultipleProofsRequired, noOfPages, proofType, successMessage, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDTO {\n");
    
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMultipleProofsRequired: ").append(toIndentedString(isMultipleProofsRequired)).append("\n");
    sb.append("    noOfPages: ").append(toIndentedString(noOfPages)).append("\n");
    sb.append("    proofType: ").append(toIndentedString(proofType)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

