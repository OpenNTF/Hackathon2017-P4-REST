package org.openntf.wherespace.api;

import java.math.BigDecimal;
import org.openntf.wherespace.model.Event;
import org.openntf.wherespace.model.Success;

import io.swagger.annotations.*;

import org.openntf.wherespace.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Controller
public class EventsApiController implements EventsApi {

    @Autowired
    private EventService eventService;

    public ResponseEntity<Success> eventsEventIdDelete(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        Success success = eventService.delete(eventId);
        return new ResponseEntity<Success>(success, HttpStatus.OK);
    }

    public ResponseEntity<Event> eventsEventIdGet(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        Event event = eventService.get(eventId);
        return new ResponseEntity<Event>(event, HttpStatus.OK);
    }

    public ResponseEntity<Event> eventsEventIdPost(@ApiParam(value = "The event." ,required=true ) @RequestBody Event body,
        @ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        Event event = eventService.post(body);
        return new ResponseEntity<Event>(HttpStatus.OK);
    }

    public ResponseEntity<Event> eventsEventIdPut(@ApiParam(value = "The event." ,required=true ) @RequestBody Event body,
        @ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        Event event = eventService.put(body);
        return new ResponseEntity<Event>(HttpStatus.OK);
    }

    public ResponseEntity<List<Event>> eventsPersonEventdateGet(@ApiParam(value = "Fetched all the events by person email", required = true) @RequestParam(value = "email", required = true) String email,
        @ApiParam(value = "Fetched all the events by certain date", required = true) @RequestParam(value = "date", required = true) BigDecimal date) {
        // do some magic!
        return new ResponseEntity<List<Event>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Event>> eventsPersonGet(@ApiParam(value = "Fetched all the events by person email", required = true) @RequestParam(value = "email", required = true) String email) {
        // do some magic!
        return new ResponseEntity<List<Event>>(HttpStatus.OK);
    }

}
