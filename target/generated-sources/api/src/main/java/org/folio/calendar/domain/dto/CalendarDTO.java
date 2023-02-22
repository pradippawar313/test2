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
import org.folio.calendar.domain.dto.ExceptionRangeDTO;
import org.folio.calendar.domain.dto.MetadataDTO;
import org.folio.calendar.domain.dto.NormalHoursDTO;
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
 * A single calendar
 */
@ApiModel(description = "A single calendar")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class CalendarDTO   {
   /**
    * A unique UUID identifying this calendar
    */
  @JsonProperty("id")
  @Nullable
  
  private UUID id;

   /**
    * A user-provided name used to label this calendar
    */
  @JsonProperty("name")
  
  private String name;

   /**
    * The first effective date (inclusive, YYYY-MM-DD) of this calendar
    */
  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate startDate;

   /**
    * The first effective date (inclusive, YYYY-MM-DD) of this calendar
    */
  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate endDate;

   /**
    * A list of all service points that this calendar is assigned to
    */
  @JsonProperty("assignments")
  @Valid
  
  @Singular
  private List<UUID> assignments;

   /**
    * A list of objects describing when the calendar is normally open
    */
  @JsonProperty("normalHours")
  @Valid
  
  @Singular
  private List<NormalHoursDTO> normalHours;

   /**
    * A list of objects describing exceptions to the normal hours
    */
  @JsonProperty("exceptions")
  @Valid
  
  @Singular
  private List<ExceptionRangeDTO> exceptions;

  @JsonProperty("metadata")
  @Nullable
  
  private MetadataDTO metadata;



















  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    normalHours: ").append(toIndentedString(normalHours)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

