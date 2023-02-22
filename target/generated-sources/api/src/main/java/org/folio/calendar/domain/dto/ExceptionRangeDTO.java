package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.folio.calendar.domain.dto.ExceptionalOpeningDTO;
import org.springframework.format.annotation.DateTimeFormat;
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
 * An exception to a calendar, consisting of a set of openings (or none if a closure)
 */
@ApiModel(description = "An exception to a calendar, consisting of a set of openings (or none if a closure)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class ExceptionRangeDTO   {
   /**
    * The UUID of the calendar which this exception is for
    */
  @JsonProperty("calendarId")
  @Nullable
  
  private UUID calendarId;

   /**
    * A user-provided label for this exception
    */
  @JsonProperty("name")
  
  private String name;

   /**
    * The first effective date (inclusive, YYYY-MM-DD) of this exception range
    */
  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate startDate;

   /**
    * The first effective date (inclusive, YYYY-MM-DD) of this exception range
    */
  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate endDate;

   /**
    * The openings during this exception
    */
  @JsonProperty("openings")
  @Valid
  
  @Singular
  private List<ExceptionalOpeningDTO> openings;













  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionRangeDTO {\n");
    
    sb.append("    calendarId: ").append(toIndentedString(calendarId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    openings: ").append(toIndentedString(openings)).append("\n");
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

