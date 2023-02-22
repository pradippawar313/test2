/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.folio.calendar.rest.resource;

import org.folio.calendar.domain.dto.CalendarCollectionDTO;
import org.folio.calendar.domain.dto.CalendarDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.folio.calendar.domain.dto.ErrorResponseDTO;
import java.time.LocalDate;
import org.folio.calendar.domain.dto.SingleDayOpeningCollectionDTO;
import org.folio.calendar.domain.dto.SurroundingOpeningsDTO;
import java.util.UUID;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.enums.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T11:03:51.029559Z[UTC]")
@Validated
@Api(value = "calendar", description = "the calendar API")
@SuppressWarnings("unused")
public interface CalendarApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /calendar/calendars : Create a new calendar
     * Create a new calendar from a provided body.  If an ID is provided for the calendar, it will be ignored (and a new one generated).
     *
     * @param calendarDTO  (required)
     * @return The created calendar (status code 201)
     *         or Invalid request or parameters (status code 400)
     *         or A calendar creation/update cannot be performed due to an existing assignment overlapping with the provided date range (status code 409)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Create a new calendar",
        nickname = "createCalendar",
        notes = "Create a new calendar from a provided body.  If an ID is provided for the calendar, it will be ignored (and a new one generated).",
        response = CalendarDTO.class
    )
    @ApiResponses({
        @ApiResponse(code = 201, message = "The created calendar", response = CalendarDTO.class),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 409, message = "A calendar creation/update cannot be performed due to an existing assignment overlapping with the provided date range", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/calendar/calendars",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CalendarDTO> createCalendar(
        @Parameter(name = "CalendarDTO", description = "", required = true) @Valid @RequestBody CalendarDTO calendarDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Sample Spring Calendar\", \"startDate\" : \"2022-01-08\", \"endDate\" : \"2022-05-09\", \"assignments\" : [ \"44444444-4444-4444-4444-444444444444\", \"bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb\", \"dddddddd-dddd-dddd-dddd-dddddddddddd\" ], \"normalHours\" : [ { \"startDay\" : \"MONDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"FRIDAY\", \"endTime\" : \"22:00:00\" }, { \"startDay\" : \"SATURDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"SATURDAY\", \"endTime\" : \"22:00:00\" } ], \"exceptions\" : [ { \"name\" : \"Spring break (closed)\", \"startDate\" : \"2022-03-01\", \"endDate\" : \"2022-03-05\", \"openings\" : [ ] }, { \"name\" : \"Early closure\", \"startDate\" : \"2022-04-01\", \"endDate\" : \"2022-04-01\", \"openings\" : [ { \"startDate\" : \"2022-04-01\", \"startTime\" : \"07:00:00\", \"endDate\" : \"2022-04-01\", \"endTime\" : \"12:00:00\" } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /calendar/calendars/{calendarId} : Delete a calendar
     * Delete a calendar by its ID.
     *
     * @param calendarId The calendar ID to operate on. (required)
     * @return The requested calendar was deleted (status code 204)
     *         or Invalid request or parameters (status code 400)
     *         or A calendar with the given UUID could not be found. (status code 404)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Delete a calendar",
        nickname = "deleteCalendar",
        notes = "Delete a calendar by its ID."
    )
    @ApiResponses({
        @ApiResponse(code = 204, message = "The requested calendar was deleted"),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 404, message = "A calendar with the given UUID could not be found.", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/calendar/calendars/{calendarId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteCalendar(
        @Parameter(name = "calendarId", description = "The calendar ID to operate on.", required = true, in = ParameterIn.PATH) @PathVariable("calendarId") UUID calendarId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /calendar/calendars : Delete multiple calendars
     * Delete a calendar by its ID.
     *
     * @param id A list of calendars to delete, sent as separate parameters (?id&#x3D;aaaa&amp;id&#x3D;bbbb...).  If any calendars are missing, a 404 will be returned and nothing modified. (required)
     * @return The requested calendars were deleted (status code 204)
     *         or Invalid request or parameters (status code 400)
     *         or A calendar with the given UUID could not be found. (status code 404)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Delete multiple calendars",
        nickname = "deleteCalendars",
        notes = "Delete a calendar by its ID."
    )
    @ApiResponses({
        @ApiResponse(code = 204, message = "The requested calendars were deleted"),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 404, message = "A calendar with the given UUID could not be found.", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/calendar/calendars",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteCalendars(
        @NotNull @Size(min = 1) @Parameter(name = "id", description = "A list of calendars to delete, sent as separate parameters (?id=aaaa&id=bbbb...).  If any calendars are missing, a 404 will be returned and nothing modified.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "id", required = true) List<UUID> id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /calendar/dates/{servicePointId}/all-openings : Daily opening information
     * Calculate the opening information for each date within a range
     *
     * @param servicePointId The service point to calculate openings on (required)
     * @param startDate The first date (YYYY-MM-DD) to include, inclusive (required)
     * @param endDate The last date (YYYY-MM-DD) to include, inclusive (required)
     * @param includeClosed Whether or not the results should include days where the service point is closed.  Exceptional closures will always be returned (required)
     * @param offset Skip a certain number of the first values; used for pagination (optional, default to 0)
     * @param limit The maximum number of elements returned in the response, used for pagination.  A limit of zero will not include any results (however, totalRecords will still be included) -- to include all results, use a large number such as 2147483647. (optional, default to 10)
     * @return The query results (status code 200)
     *         or Invalid request or parameters (status code 400)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Daily opening information",
        nickname = "getAllOpenings",
        notes = "Calculate the opening information for each date within a range",
        response = SingleDayOpeningCollectionDTO.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "The query results", response = SingleDayOpeningCollectionDTO.class),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/calendar/dates/{servicePointId}/all-openings",
        produces = { "application/json" }
    )
    default ResponseEntity<SingleDayOpeningCollectionDTO> getAllOpenings(
        @Parameter(name = "servicePointId", description = "The service point to calculate openings on", required = true, in = ParameterIn.PATH) @PathVariable("servicePointId") UUID servicePointId,
        @NotNull @Parameter(name = "startDate", description = "The first date (YYYY-MM-DD) to include, inclusive", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "startDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
        @NotNull @Parameter(name = "endDate", description = "The last date (YYYY-MM-DD) to include, inclusive", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "endDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
        @NotNull @Parameter(name = "includeClosed", description = "Whether or not the results should include days where the service point is closed.  Exceptional closures will always be returned", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "includeClosed", required = true) Boolean includeClosed,
        @Min(0) @Parameter(name = "offset", description = "Skip a certain number of the first values; used for pagination", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset,
        @Min(0) @Parameter(name = "limit", description = "The maximum number of elements returned in the response, used for pagination.  A limit of zero will not include any results (however, totalRecords will still be included) -- to include all results, use a large number such as 2147483647.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dates\" : [ { \"date\" : \"2022-05-01\", \"allDay\" : false, \"open\" : true, \"exceptional\" : true, \"exceptionName\" : \"Holiday (reduced hours with lunch break)\", \"openings\" : [ { \"startTime\" : \"10:00:00\", \"endTime\" : \"12:00:00\" }, { \"startTime\" : \"13:30:00\", \"endTime\" : \"17:00:00\" } ] }, { \"date\" : \"2022-05-02\", \"allDay\" : true, \"open\" : false, \"exceptional\" : false, \"openings\" : [ ] }, { \"date\" : \"2022-05-03\", \"allDay\" : true, \"open\" : true, \"exceptional\" : false, \"openings\" : [ { \"startTime\" : \"00:00:00\", \"endTime\" : \"23:59:00\" } ] } ], \"totalRecords\" : 3 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /calendar/calendars/{calendarId} : Get a calendar
     * Get a calendar&#39;s information by its ID.
     *
     * @param calendarId The calendar ID to retrieve (required)
     * @return The resulting calendar (status code 200)
     *         or Invalid request or parameters (status code 400)
     *         or A calendar with the given UUID could not be found. (status code 404)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Get a calendar",
        nickname = "getCalendar",
        notes = "Get a calendar's information by its ID.",
        response = CalendarDTO.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "The resulting calendar", response = CalendarDTO.class),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 404, message = "A calendar with the given UUID could not be found.", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/calendar/calendars/{calendarId}",
        produces = { "application/json" }
    )
    default ResponseEntity<CalendarDTO> getCalendar(
        @Parameter(name = "calendarId", description = "The calendar ID to retrieve", required = true, in = ParameterIn.PATH) @PathVariable("calendarId") UUID calendarId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Sample Spring Calendar\", \"startDate\" : \"2022-01-08\", \"endDate\" : \"2022-05-09\", \"assignments\" : [ \"44444444-4444-4444-4444-444444444444\", \"bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb\", \"dddddddd-dddd-dddd-dddd-dddddddddddd\" ], \"normalHours\" : [ { \"startDay\" : \"MONDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"FRIDAY\", \"endTime\" : \"22:00:00\" }, { \"startDay\" : \"SATURDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"SATURDAY\", \"endTime\" : \"22:00:00\" } ], \"exceptions\" : [ { \"name\" : \"Spring break (closed)\", \"startDate\" : \"2022-03-01\", \"endDate\" : \"2022-03-05\", \"openings\" : [ ] }, { \"name\" : \"Early closure\", \"startDate\" : \"2022-04-01\", \"endDate\" : \"2022-04-01\", \"openings\" : [ { \"startDate\" : \"2022-04-01\", \"startTime\" : \"07:00:00\", \"endDate\" : \"2022-04-01\", \"endTime\" : \"12:00:00\" } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /calendar/dates/{servicePointId}/surrounding-openings : Surrounding openings
     * Calculate openings nearest to a given date for a specified service point
     *
     * @param servicePointId The service point to calculate openings on (required)
     * @param date The date (YYYY-MM-DD) to calculate openings around (required)
     * @return The query results (status code 200)
     *         or Invalid request or parameters (status code 400)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Surrounding openings",
        nickname = "getSurroundingOpenings",
        notes = "Calculate openings nearest to a given date for a specified service point",
        response = SurroundingOpeningsDTO.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "The query results", response = SurroundingOpeningsDTO.class),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/calendar/dates/{servicePointId}/surrounding-openings",
        produces = { "application/json" }
    )
    default ResponseEntity<SurroundingOpeningsDTO> getSurroundingOpenings(
        @Parameter(name = "servicePointId", description = "The service point to calculate openings on", required = true, in = ParameterIn.PATH) @PathVariable("servicePointId") UUID servicePointId,
        @NotNull @Parameter(name = "date", description = "The date (YYYY-MM-DD) to calculate openings around", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "date", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"openings\" : [ { \"date\" : \"2022-05-01\", \"allDay\" : false, \"open\" : true, \"exceptional\" : true, \"exceptionName\" : \"Holiday (reduced hours with lunch break)\", \"openings\" : [ { \"startTime\" : \"10:00:00\", \"endTime\" : \"12:00:00\" }, { \"startTime\" : \"13:30:00\", \"endTime\" : \"17:00:00\" } ] }, { \"date\" : \"2022-05-02\", \"allDay\" : true, \"open\" : false, \"exceptional\" : false, \"openings\" : [ ] }, { \"date\" : \"2022-05-03\", \"allDay\" : true, \"open\" : true, \"exceptional\" : false, \"openings\" : [ { \"startTime\" : \"00:00:00\", \"endTime\" : \"23:59:00\" } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /calendar/calendars : Search all calendars
     * Get all calendars that match the given query
     *
     * @param id The list of calendar IDs to retrieve, sent as separate parameters (?id&#x3D;aaaa&amp;id&#x3D;bbbb...).  If this list is passed, calendars must have an ID in this list in addition to any additional criteria. (optional)
     * @param servicePointId Filter for calendars that are assigned to a certain service point.  If this parameter is excluded, all service points will be considered/included in the response.  Multiple service points may be specified with form-style query expansions; in this case, calendars that are assigned to any of the provided service points will be returned. (optional)
     * @param startDate The first date (YYYY-MM-DD) to consider, inclusively (optional)
     * @param endDate The last date (YYYY-MM-DD) to consider, inclusively (optional)
     * @param offset Skip a certain number of the first values; used for pagination (optional, default to 0)
     * @param limit The maximum number of elements returned in the response, used for pagination.  A limit of zero will not include any results (however, totalRecords will still be included) -- to include all results, use a large number such as 2147483647. (optional, default to 10)
     * @return The query results (status code 200)
     *         or Invalid request or parameters (status code 400)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Search all calendars",
        nickname = "searchCalendars",
        notes = "Get all calendars that match the given query",
        response = CalendarCollectionDTO.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "The query results", response = CalendarCollectionDTO.class),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/calendar/calendars",
        produces = { "application/json" }
    )
    default ResponseEntity<CalendarCollectionDTO> searchCalendars(
        @Parameter(name = "id", description = "The list of calendar IDs to retrieve, sent as separate parameters (?id=aaaa&id=bbbb...).  If this list is passed, calendars must have an ID in this list in addition to any additional criteria.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "id", required = false) List<UUID> id,
        @Parameter(name = "servicePointId", description = "Filter for calendars that are assigned to a certain service point.  If this parameter is excluded, all service points will be considered/included in the response.  Multiple service points may be specified with form-style query expansions; in this case, calendars that are assigned to any of the provided service points will be returned.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "servicePointId", required = false) List<UUID> servicePointId,
        @Parameter(name = "startDate", description = "The first date (YYYY-MM-DD) to consider, inclusively", in = ParameterIn.QUERY) @Valid @RequestParam(value = "startDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
        @Parameter(name = "endDate", description = "The last date (YYYY-MM-DD) to consider, inclusively", in = ParameterIn.QUERY) @Valid @RequestParam(value = "endDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
        @Min(0) @Parameter(name = "offset", description = "Skip a certain number of the first values; used for pagination", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset,
        @Min(0) @Parameter(name = "limit", description = "The maximum number of elements returned in the response, used for pagination.  A limit of zero will not include any results (however, totalRecords will still be included) -- to include all results, use a large number such as 2147483647.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"calendars\" : [ { \"name\" : \"Sample Spring Calendar\", \"startDate\" : \"2022-01-08\", \"endDate\" : \"2022-05-09\", \"assignments\" : [ \"44444444-4444-4444-4444-444444444444\", \"bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb\", \"dddddddd-dddd-dddd-dddd-dddddddddddd\" ], \"normalHours\" : [ { \"startDay\" : \"MONDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"FRIDAY\", \"endTime\" : \"22:00:00\" }, { \"startDay\" : \"SATURDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"SATURDAY\", \"endTime\" : \"22:00:00\" } ], \"exceptions\" : [ { \"name\" : \"Spring break (closed)\", \"startDate\" : \"2022-03-01\", \"endDate\" : \"2022-03-05\", \"openings\" : [ ] }, { \"name\" : \"Early closure\", \"startDate\" : \"2022-04-01\", \"endDate\" : \"2022-04-01\", \"openings\" : [ { \"startDate\" : \"2022-04-01\", \"startTime\" : \"07:00:00\", \"endDate\" : \"2022-04-01\", \"endTime\" : \"12:00:00\" } ] } ] } ], \"totalRecords\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /calendar/calendars/{calendarId} : Update an existing calendar
     * Overwrite an existing calendar with the provided payload.  The provided calendar must already exist (attempting to overwrite a calendar that does not yet exist will result in a 404).  If the payload includes any IDs, they will be ignored, and the existing calendar ID reused.
     *
     * @param calendarId The calendar ID to replace (required)
     * @param calendarDTO  (required)
     * @return The newly saved calendar (status code 200)
     *         or Invalid request or parameters (status code 400)
     *         or A calendar with the given UUID could not be found. (status code 404)
     *         or A calendar creation/update cannot be performed due to an existing assignment overlapping with the provided date range (status code 409)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(
        tags = {  },
        value = "Update an existing calendar",
        nickname = "updateCalendar",
        notes = "Overwrite an existing calendar with the provided payload.  The provided calendar must already exist (attempting to overwrite a calendar that does not yet exist will result in a 404).  If the payload includes any IDs, they will be ignored, and the existing calendar ID reused.",
        response = CalendarDTO.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "The newly saved calendar", response = CalendarDTO.class),
        @ApiResponse(code = 400, message = "Invalid request or parameters", response = ErrorResponseDTO.class),
        @ApiResponse(code = 404, message = "A calendar with the given UUID could not be found.", response = ErrorResponseDTO.class),
        @ApiResponse(code = 409, message = "A calendar creation/update cannot be performed due to an existing assignment overlapping with the provided date range", response = ErrorResponseDTO.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponseDTO.class)
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/calendar/calendars/{calendarId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CalendarDTO> updateCalendar(
        @Parameter(name = "calendarId", description = "The calendar ID to replace", required = true, in = ParameterIn.PATH) @PathVariable("calendarId") UUID calendarId,
        @Parameter(name = "CalendarDTO", description = "", required = true) @Valid @RequestBody CalendarDTO calendarDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Sample Spring Calendar\", \"startDate\" : \"2022-01-08\", \"endDate\" : \"2022-05-09\", \"assignments\" : [ \"44444444-4444-4444-4444-444444444444\", \"bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb\", \"dddddddd-dddd-dddd-dddd-dddddddddddd\" ], \"normalHours\" : [ { \"startDay\" : \"MONDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"FRIDAY\", \"endTime\" : \"22:00:00\" }, { \"startDay\" : \"SATURDAY\", \"startTime\" : \"07:00:00\", \"endDay\" : \"SATURDAY\", \"endTime\" : \"22:00:00\" } ], \"exceptions\" : [ { \"name\" : \"Spring break (closed)\", \"startDate\" : \"2022-03-01\", \"endDate\" : \"2022-03-05\", \"openings\" : [ ] }, { \"name\" : \"Early closure\", \"startDate\" : \"2022-04-01\", \"endDate\" : \"2022-04-01\", \"openings\" : [ { \"startDate\" : \"2022-04-01\", \"startTime\" : \"07:00:00\", \"endDate\" : \"2022-04-01\", \"endTime\" : \"12:00:00\" } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
