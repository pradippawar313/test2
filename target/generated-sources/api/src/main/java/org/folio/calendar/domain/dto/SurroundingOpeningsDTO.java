package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.folio.calendar.domain.dto.SingleDayOpeningDTO;
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
 * Information for three dates: one before when the SP is open, one representing an opening or closure for the current date, and one after the provided date where the SP is open.  If there are no openings before or after a given date, then an opening object will be returned with the date immediately following, denoting a closure.
 */
@ApiModel(description = "Information for three dates: one before when the SP is open, one representing an opening or closure for the current date, and one after the provided date where the SP is open.  If there are no openings before or after a given date, then an opening object will be returned with the date immediately following, denoting a closure.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class SurroundingOpeningsDTO   {
  @JsonProperty("openings")
  @Valid
  
  @Singular
  private List<SingleDayOpeningDTO> openings;





  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurroundingOpeningsDTO {\n");
    
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

