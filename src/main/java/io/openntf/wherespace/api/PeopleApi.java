package io.openntf.wherespace.api;

import io.openntf.wherespace.model.Person;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T20:19:27.184Z")

@Api(value = "people", description = "the people API")
public interface PeopleApi {

    @ApiOperation(value = "Get all people by event", notes = "Get all people by Event", response = Person.class, responseContainer = "List", tags={ "People", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Person.class),
        @ApiResponse(code = 400, message = "Invalid event ID supplied", response = Person.class),
        @ApiResponse(code = 404, message = "People not found", response = Person.class) })
    @RequestMapping(value = "/people/event/{eventId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Person>> peopleEventEventIdGet(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId);


    @ApiOperation(value = "Get all people by location", notes = "Get all people by Location", response = Person.class, responseContainer = "List", tags={ "People", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Person.class),
        @ApiResponse(code = 400, message = "Invalid Location ID supplied", response = Person.class),
        @ApiResponse(code = 404, message = "People not found", response = Person.class) })
    @RequestMapping(value = "/people/location/{locationId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Person>> peopleLocationLocationIdGet(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);

}
