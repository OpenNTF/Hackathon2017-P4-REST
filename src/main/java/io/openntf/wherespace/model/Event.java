package io.openntf.wherespace.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

/**
 * Event
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T20:19:27.184Z")

public class Event   {
  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("personId")
  private String personId = null;

  @JsonProperty("locationId")
  private String locationId = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("latitude")
  private Float latitude = null;

  @JsonProperty("longitude")
  private Float longitude = null;

  public Event eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Event personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Get personId
   * @return personId
  **/
  @ApiModelProperty(value = "")
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public Event locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Event date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Event latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Event longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.personId, event.personId) &&
        Objects.equals(this.locationId, event.locationId) &&
        Objects.equals(this.date, event.date) &&
        Objects.equals(this.latitude, event.latitude) &&
        Objects.equals(this.longitude, event.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, personId, locationId, date, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

