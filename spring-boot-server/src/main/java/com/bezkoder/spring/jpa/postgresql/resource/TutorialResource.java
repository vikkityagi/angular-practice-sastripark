package com.bezkoder.spring.jpa.postgresql.resource;

import com.bezkoder.spring.jpa.postgresql.model.Tutorial;
import com.fasterxml.jackson.annotation.JsonProperty;



public class TutorialResource {

  @JsonProperty("id")
  private long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("published")
  private boolean published;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  
  
}
