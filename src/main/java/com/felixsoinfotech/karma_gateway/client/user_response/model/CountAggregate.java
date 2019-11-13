package com.felixsoinfotech.karma_gateway.client.user_response.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CountAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-13T10:30:57.787246900+05:30[Asia/Calcutta]")

public class CountAggregate   {
  @JsonProperty("likedUserPhotos")
  @Valid
  private List<String> likedUserPhotos = null;

  @JsonProperty("noOfComments")
  private Long noOfComments = null;

  @JsonProperty("noOfLoves")
  private Long noOfLoves = null;

  public CountAggregate likedUserPhotos(List<String> likedUserPhotos) {
    this.likedUserPhotos = likedUserPhotos;
    return this;
  }

  public CountAggregate addLikedUserPhotosItem(String likedUserPhotosItem) {
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

  public CountAggregate noOfComments(Long noOfComments) {
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

  public CountAggregate noOfLoves(Long noOfLoves) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountAggregate countAggregate = (CountAggregate) o;
    return Objects.equals(this.likedUserPhotos, countAggregate.likedUserPhotos) &&
        Objects.equals(this.noOfComments, countAggregate.noOfComments) &&
        Objects.equals(this.noOfLoves, countAggregate.noOfLoves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(likedUserPhotos, noOfComments, noOfLoves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountAggregate {\n");
    
    sb.append("    likedUserPhotos: ").append(toIndentedString(likedUserPhotos)).append("\n");
    sb.append("    noOfComments: ").append(toIndentedString(noOfComments)).append("\n");
    sb.append("    noOfLoves: ").append(toIndentedString(noOfLoves)).append("\n");
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

