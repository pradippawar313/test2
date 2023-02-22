package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.folio.calendar.domain.dto.SingleDayOpeningRangeDTO;
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
 * Opening information for a single day
 */
@ApiModel(description = "Opening information for a single day")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class SingleDayOpeningDTO   {
   /**
    * The date (YYYY-MM-DD) that this object is describing openings for
    */
  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  
  private LocalDate date;

   /**
    * If the service point is open or closed for the entire day
    */
  @JsonProperty("allDay")
  @Getter(AccessLevel.NONE)
  
  private Boolean allDay;

   /**
    * If the service point is open on this day
    */
  @JsonProperty("open")
  @Getter(AccessLevel.NONE)
  
  private Boolean open;

   /**
    * If this opening (or closure) was the result of an exception
    */
  @JsonProperty("exceptional")
  @Getter(AccessLevel.NONE)
  
  private Boolean exceptional;

   /**
    * The name of an exception, if this day was affected by one
    */
  @JsonProperty("exceptionName")
  @Nullable
  
  private String exceptionName;

   /**
    * A list of all the opening ranges of the service point on this day
    */
  @JsonProperty("openings")
  @Valid
  
  @Singular
  private List<SingleDayOpeningRangeDTO> openings;





  /**
   * If the service point is open or closed for the entire day
   * @return allDay
  */
  public Boolean isAllDay() {
    return this.allDay;
  }


  /**
   * If the service point is open on this day
   * @return open
  */
  public Boolean isOpen() {
    return this.open;
  }


  /**
   * If this opening (or closure) was the result of an exception
   * @return exceptional
  */
  public Boolean isExceptional() {
    return this.exceptional;
  }






  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleDayOpeningDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    exceptional: ").append(toIndentedString(exceptional)).append("\n");
    sb.append("    exceptionName: ").append(toIndentedString(exceptionName)).append("\n");
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

