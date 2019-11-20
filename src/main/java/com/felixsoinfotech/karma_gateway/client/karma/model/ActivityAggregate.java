package com.felixsoinfotech.karma_gateway.client.karma.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.felixsoinfotech.karma_gateway.client.karma.model.ActivityDTO;
import com.felixsoinfotech.karma_gateway.client.karma.model.IntroductionStoryDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityAggregate
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-20T16:08:25.471549800+05:30[Asia/Calcutta]")

public class ActivityAggregate   {
  @JsonProperty("activityDTO")
  private ActivityDTO activityDTO = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("introductionStories")
  @Valid
  private List<IntroductionStoryDTO> introductionStories = null;

  public ActivityAggregate activityDTO(ActivityDTO activityDTO) {
    this.activityDTO = activityDTO;
    return this;
  }

  /**
   * Get activityDTO
   * @return activityDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ActivityDTO getActivityDTO() {
    return activityDTO;
  }

  public void setActivityDTO(ActivityDTO activityDTO) {
    this.activityDTO = activityDTO;
  }

  public ActivityAggregate id(Long id) {
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

  public ActivityAggregate introductionStories(List<IntroductionStoryDTO> introductionStories) {
    this.introductionStories = introductionStories;
    return this;
  }

  public ActivityAggregate addIntroductionStoriesItem(IntroductionStoryDTO introductionStoriesItem) {
    if (this.introductionStories == null) {
      this.introductionStories = new ArrayList<IntroductionStoryDTO>();
    }
    this.introductionStories.add(introductionStoriesItem);
    return this;
  }

  /**
   * Get introductionStories
   * @return introductionStories
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<IntroductionStoryDTO> getIntroductionStories() {
    return introductionStories;
  }

  public void setIntroductionStories(List<IntroductionStoryDTO> introductionStories) {
    this.introductionStories = introductionStories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityAggregate activityAggregate = (ActivityAggregate) o;
    return Objects.equals(this.activityDTO, activityAggregate.activityDTO) &&
        Objects.equals(this.id, activityAggregate.id) &&
        Objects.equals(this.introductionStories, activityAggregate.introductionStories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDTO, id, introductionStories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityAggregate {\n");
    
    sb.append("    activityDTO: ").append(toIndentedString(activityDTO)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    introductionStories: ").append(toIndentedString(introductionStories)).append("\n");
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

