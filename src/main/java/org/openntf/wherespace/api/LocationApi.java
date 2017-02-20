package org.openntf.wherespace.api;

import org.openntf.wherespace.model.Location;
import org.openntf.wherespace.model.Success;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Api(value = "location", description = "the location API")
public interface LocationApi {

    @ApiOperation(value = "Get all locations by person", notes = "Get the Locations", response = Location.class, responseContainer = "List", tags={ "Location", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Location.class),
        @ApiResponse(code = 404, message = "Location not found", response = Location.class) })
    @RequestMapping(value = "/location/all",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Location>> locationAllGet();


    @ApiOperation(value = "Delete the location by his id", notes = "Delete the Location by his ID", response = Success.class, tags={ "Location", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Success.class),
        @ApiResponse(code = 400, message = "Invalid location ID supplied", response = Success.class),
        @ApiResponse(code = 404, message = "Location not found", response = Success.class) })
    @RequestMapping(value = "/location/{locationId}",
        produces = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Success> locationLocationIdDelete(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);


    @ApiOperation(value = "Get the location by his id", notes = "Return the Location by his ID", response = Location.class, tags={ "Location", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid location ID supplied", response = Location.class),
        @ApiResponse(code = 404, message = "Location not found", response = Location.class) })
    @RequestMapping(value = "/location/{locationId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Location> locationLocationIdGet(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);


    @ApiOperation(value = "Create the location by his id", notes = "Create the Location by his ID", response = Location.class, tags={ "Location", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid location ID supplied", response = Location.class),
        @ApiResponse(code = 404, message = "Location not found", response = Location.class) })
    @RequestMapping(value = "/location/{locationId}",
        produces = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Location> locationLocationIdPost(@ApiParam(value = "The location." ,required=true ) @RequestBody Location body,
        @ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);


    @ApiOperation(value = "Update the location by his id", notes = "Update the Location by his ID", response = Location.class, tags={ "Location", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid location ID supplied", response = Location.class),
        @ApiResponse(code = 404, message = "Location not found", response = Location.class) })
    @RequestMapping(value = "/location/{locationId}",
        produces = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Location> locationLocationIdPut(@ApiParam(value = "The location." ,required=true ) @RequestBody Location body,
        @ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);

}
