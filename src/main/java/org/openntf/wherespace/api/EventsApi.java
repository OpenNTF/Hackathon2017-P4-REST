package org.openntf.wherespace.api;
import java.math.BigDecimal;
import org.openntf.wherespace.model.Event;
import org.openntf.wherespace.model.Success;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "Delete the event by his id", notes = "Delete the Event by his ID", response = Success.class, tags={ "Event", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Success.class),
        @ApiResponse(code = 400, message = "Invalid event ID supplied", response = Success.class),
        @ApiResponse(code = 404, message = "Event not found", response = Success.class) })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Success> eventsEventIdDelete(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId);


    @ApiOperation(value = "Get the event by his id", notes = "Return the Event by his ID", response = Event.class, tags={ "Event", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid event ID supplied", response = Event.class),
        @ApiResponse(code = 404, message = "Event not found", response = Event.class) })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Event> eventsEventIdGet(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId);


    @ApiOperation(value = "Create the event by his id", notes = "Create the Event by his ID", response = Event.class, tags={ "Event", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid event ID supplied", response = Event.class),
        @ApiResponse(code = 404, message = "Event not found", response = Event.class) })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Event> eventsEventIdPost(@ApiParam(value = "The event." ,required=true ) @RequestBody Event body,
        @ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId);


    @ApiOperation(value = "Update the event by his id", notes = "Update the Event by his ID", response = Event.class, tags={ "Event", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid event ID supplied", response = Event.class),
        @ApiResponse(code = 404, message = "Event not found", response = Event.class) })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Event> eventsEventIdPut(@ApiParam(value = "The event." ,required=true ) @RequestBody Event body,
        @ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId);


    @ApiOperation(value = "Get events by person", notes = "Get the events by email and date", response = Event.class, responseContainer = "List", tags={ "Event", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid email and date supplied", response = Event.class),
        @ApiResponse(code = 404, message = "Event not found", response = Event.class) })
    @RequestMapping(value = "/events/person/eventdate",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> eventsPersonEventdateGet(@ApiParam(value = "Fetched all the events by person email", required = true) @RequestParam(value = "email", required = true) String email,
        @ApiParam(value = "Fetched all the events by certain date", required = true) @RequestParam(value = "date", required = true) BigDecimal date);


    @ApiOperation(value = "Get events by person", notes = "Get the event by personId", response = Event.class, responseContainer = "List", tags={ "Event", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid email supplied", response = Event.class),
        @ApiResponse(code = 404, message = "Event not found", response = Event.class) })
    @RequestMapping(value = "/events/person",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> eventsPersonGet(@ApiParam(value = "Fetched all the events by person email", required = true) @RequestParam(value = "email", required = true) String email);

}
