package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalTime;
import java.util.UUID;
import org.folio.calendar.domain.types.Weekday;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import javax.annotation.Nullable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.With;

import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.*;

/**
 * A range of hours when a calendar is open
 */
@ApiModel(description = "A range of hours when a calendar is open")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class NormalHoursDTO   {
   /**
    * The UUID of the calendar which these hours are for
    */
  @JsonProperty("calendarId")
  @Nullable
  
  private UUID calendarId;

   /**
    * A day of the week.  Either SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, or SATURDAY
    */
  @JsonProperty("startDay")
  
  private Weekday startDay;

   /**
    * The time when this opening starts, inclusive
    */
  @JsonProperty("startTime")
  
  private LocalTime startTime;

   /**
    * A day of the week.  Either SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, or SATURDAY
    */
  @JsonProperty("endDay")
  
  private Weekday endDay;

   /**
    * The last minute of this opening, inclusive (11:59 if it should be open at 11:59 and closed at 12:00)
    */
  @JsonProperty("endTime")
  
  private LocalTime endTime;













  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalHoursDTO {\n");
    
    sb.append("    calendarId: ").append(toIndentedString(calendarId)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

