package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Instant;
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
 * Metadata associated with the calendar. This is provided by the server on a best-effort basis; no fields are guaranteed to be present. Metadata is provided from Okapi; any metadata sent directly from the client will be ignored.
 */
@ApiModel(description = "Metadata associated with the calendar. This is provided by the server on a best-effort basis; no fields are guaranteed to be present. Metadata is provided from Okapi; any metadata sent directly from the client will be ignored.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@SuppressWarnings("unused") // some imports may not be used
public class MetadataDTO   {
  @JsonProperty("createdDate")
  @Nullable
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private Instant createdDate;

  @JsonProperty("createdByUserId")
  @Nullable
  
  private UUID createdByUserId;

  @JsonProperty("updatedDate")
  @Nullable
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private Instant updatedDate;

  @JsonProperty("updatedByUserId")
  @Nullable
  
  private UUID updatedByUserId;











  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataDTO {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    updatedByUserId: ").append(toIndentedString(updatedByUserId)).append("\n");
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

