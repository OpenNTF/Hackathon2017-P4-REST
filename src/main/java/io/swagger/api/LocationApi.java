package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Location;
import io.swagger.model.Success;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T20:19:27.184Z")

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
    ResponseEntity<Location> locationLocationIdPost(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);


    @ApiOperation(value = "Update the location by his id", notes = "Update the Location by his ID", response = Location.class, tags={ "Location", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Location.class),
        @ApiResponse(code = 400, message = "Invalid location ID supplied", response = Location.class),
        @ApiResponse(code = 404, message = "Location not found", response = Location.class) })
    @RequestMapping(value = "/location/{locationId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Location> locationLocationIdPut(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId);

}
