package org.folio.calendar.domain.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * A code describing the error.
 */
@ToString
@AllArgsConstructor
@SuppressWarnings("unused")
public enum ErrorCodeDTO {
  
  /**
   * Catch-all for any other unhandled exceptions
   */
  INTERNAL_SERVER_ERROR("internalServerError"),
  
  /**
   * Catch-all for unparsable requests (bad JSON, etc)
   */
  INVALID_REQUEST("invalidRequest"),
  
  /**
   * Catch-all for missing or wrongly-typed parameters
   */
  INVALID_PARAMETER("invalidParameter"),
  
  /**
   * The provided dates overlap other dates for the same assignment
   */
  CALENDAR_DATE_OVERLAP("calendarDateOverlap"),
  
  /**
   * The calender with the provided UUID was not found
   */
  CALENDAR_NOT_FOUND("calendarNotFound"),
  
  /**
   * The calendar&#39;s name was empty or whitespace
   */
  CALENDAR_NO_NAME("calendarNoName"),
  
  /**
   * The calendar&#39;s start date was after the end date
   */
  CALENDAR_INVALID_DATE_RANGE("calendarInvalidDateRange"),
  
  /**
   * The calendar has overlapping normal openings
   */
  CALENDAR_INVALID_NORMAL_OPENINGS("calendarInvalidNormalOpenings"),
  
  /**
   * The calendar has overlapping exceptions
   */
  CALENDAR_INVALID_EXCEPTIONS("calendarInvalidExceptions"),
  
  /**
   * An exception has an empty or whitespace-only name
   */
  CALENDAR_INVALID_EXCEPTION_NAME("calendarInvalidExceptionName"),
  
  /**
   * An exception has a start date after its end date
   */
  CALENDAR_INVALID_EXCEPTION_DATE_ORDER("calendarInvalidExceptionDateOrder"),
  
  /**
   * An exception is outside of the boundary of the enclosing calendar
   */
  CALENDAR_INVALID_EXCEPTION_DATE_BOUNDARY("calendarInvalidExceptionDateBoundary"),
  
  /**
   * The calendar has overlapping openings within an exception
   */
  CALENDAR_INVALID_EXCEPTION_OPENINGS("calendarInvalidExceptionOpenings"),
  
  /**
   * The exception has an opening outside of its range
   */
  CALENDAR_INVALID_EXCEPTION_OPENING_BOUNDARY("calendarInvalidExceptionOpeningBoundary"),
  
  /**
   * The start date was after the end date
   */
  INVALID_DATE_RANGE("settings.error.invalidDateRange"),
  
  /**
   * The new calendar would overlap with another calendar for this service point!  Please change the dates or add an exception.
   */
  OVERLAPPING_CALENDAR("duplication"),
  
  /**
   * No calendar/period was found with this ID
   */
  NOT_FOUND("notFound");

  private String value;

  @JsonValue
  public String getValue() {
    return this.value;
  }

  @JsonCreator
  public static ErrorCodeDTO fromValue(String value) {
    for (ErrorCodeDTO b : ErrorCodeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

