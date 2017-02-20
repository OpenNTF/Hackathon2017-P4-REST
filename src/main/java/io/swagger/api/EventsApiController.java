package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Event;
import io.swagger.model.Success;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T20:19:27.184Z")

@Controller
public class EventsApiController implements EventsApi {

    public ResponseEntity<Success> eventsEventIdDelete(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        return new ResponseEntity<Success>(HttpStatus.OK);
    }

    public ResponseEntity<Event> eventsEventIdGet(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        return new ResponseEntity<Event>(HttpStatus.OK);
    }

    public ResponseEntity<Event> eventsEventIdPost(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        return new ResponseEntity<Event>(HttpStatus.OK);
    }

    public ResponseEntity<Event> eventsEventIdPut(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
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
