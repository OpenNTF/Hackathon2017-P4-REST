package io.openntf.wherespace.api;


import io.openntf.wherespace.model.Person;
import io.openntf.wherespace.model.Success;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Api(value = "person", description = "the person API")
public interface PersonApi {

    @ApiOperation(value = "Get events by person", notes = "Get the person by email", response = Person.class, tags={ "Person", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Person.class),
        @ApiResponse(code = 400, message = "Invalid email supplied", response = Person.class),
        @ApiResponse(code = 404, message = "Person not found", response = Person.class) })
    @RequestMapping(value = "/person/email",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Person> personEmailGet(@ApiParam(value = "Fetched all the person by email", required = true) @RequestParam(value = "email", required = true) String email);


    @ApiOperation(value = "Delete the person by his id", notes = "Delete the Person by his ID", response = Success.class, tags={ "Person", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Success.class),
        @ApiResponse(code = 400, message = "Invalid person ID supplied", response = Success.class),
        @ApiResponse(code = 404, message = "Person not found", response = Success.class) })
    @RequestMapping(value = "/person/{personId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Success> personPersonIdDelete(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId);


    @ApiOperation(value = "Get the person by his id", notes = "Return the Event by his ID", response = Person.class, tags={ "Person", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Person.class),
        @ApiResponse(code = 400, message = "Invalid person ID supplied", response = Person.class),
        @ApiResponse(code = 404, message = "Person not found", response = Person.class) })
    @RequestMapping(value = "/person/{personId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Person> personPersonIdGet(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId);


    @ApiOperation(value = "Create the person by his id", notes = "Create the Person by his ID", response = Person.class, tags={ "Person", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Person.class),
        @ApiResponse(code = 400, message = "Invalid person ID supplied", response = Person.class),
        @ApiResponse(code = 404, message = "Person not found", response = Person.class) })
    @RequestMapping(value = "/person/{personId}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Person> personPersonIdPost(@ApiParam(value = "The person." ,required=true ) @RequestBody Person body,
        @ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId);


    @ApiOperation(value = "Update the person by his id", notes = "Update the Person by his ID", response = Person.class, tags={ "Person", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Person.class),
        @ApiResponse(code = 400, message = "Invalid person ID supplied", response = Person.class),
        @ApiResponse(code = 404, message = "Person not found", response = Person.class) })
    @RequestMapping(value = "/person/{personId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Person> personPersonIdPut(@ApiParam(value = "The person." ,required=true ) @RequestBody Person body,
        @ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId);

}
