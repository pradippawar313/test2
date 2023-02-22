package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;
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
 * An opening as part of an exception
 */
@ApiModel(description = "An opening as part of an exception")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class ExceptionalOpeningDTO   {
   /**
    * The UUID of the exception which this opening is for
    */
  @JsonProperty("exceptionId")
  @Nullable
  
  private UUID exceptionId;

   /**
    * The first effective date (inclusive, YYYY-MM-DD) of this opening
    */
  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate startDate;

   /**
    * The first opening time (inclusive) of this opening
    */
  @JsonProperty("startTime")
  
  private LocalTime startTime;

   /**
    * The first effective date (inclusive, YYYY-MM-DD) of this opening
    */
  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate endDate;

   /**
    * The last open time (inclusive) of this opening
    */
  @JsonProperty("endTime")
  
  private LocalTime endTime;













  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionalOpeningDTO {\n");
    
    sb.append("    exceptionId: ").append(toIndentedString(exceptionId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

