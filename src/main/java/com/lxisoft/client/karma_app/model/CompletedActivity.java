package com.lxisoft.client.karma_app.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.lxisoft.client.karma_app.model.Activity;
import com.lxisoft.client.karma_app.model.Media;
import com.lxisoft.client.karma_app.model.RegisteredUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompletedActivity
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-12T10:08:37.448866800+05:30[Asia/Calcutta]")

public class CompletedActivity   {
  @JsonProperty("activityid")
  private Activity activityid = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("proofs")
  @Valid
  private List<Media> proofs = null;

  @JsonProperty("registeredUser")
  private RegisteredUser registeredUser = null;

  public CompletedActivity activityid(Activity activityid) {
    this.activityid = activityid;
    return this;
  }

  /**
   * Get activityid
   * @return activityid
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Activity getActivityid() {
    return activityid;
  }

  public void setActivityid(Activity activityid) {
    this.activityid = activityid;
  }

  public CompletedActivity id(Long id) {
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

  public CompletedActivity proofs(List<Media> proofs) {
    this.proofs = proofs;
    return this;
  }

  public CompletedActivity addProofsItem(Media proofsItem) {
    if (this.proofs == null) {
      this.proofs = new ArrayList<Media>();
    }
    this.proofs.add(proofsItem);
    return this;
  }

  /**
   * Get proofs
   * @return proofs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Media> getProofs() {
    return proofs;
  }

  public void setProofs(List<Media> proofs) {
    this.proofs = proofs;
  }

  public CompletedActivity registeredUser(RegisteredUser registeredUser) {
    this.registeredUser = registeredUser;
    return this;
  }

  /**
   * Get registeredUser
   * @return registeredUser
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RegisteredUser getRegisteredUser() {
    return registeredUser;
  }

  public void setRegisteredUser(RegisteredUser registeredUser) {
    this.registeredUser = registeredUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletedActivity completedActivity = (CompletedActivity) o;
    return Objects.equals(this.activityid, completedActivity.activityid) &&
        Objects.equals(this.id, completedActivity.id) &&
        Objects.equals(this.proofs, completedActivity.proofs) &&
        Objects.equals(this.registeredUser, completedActivity.registeredUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityid, id, proofs, registeredUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletedActivity {\n");
    
    sb.append("    activityid: ").append(toIndentedString(activityid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proofs: ").append(toIndentedString(proofs)).append("\n");
    sb.append("    registeredUser: ").append(toIndentedString(registeredUser)).append("\n");
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

