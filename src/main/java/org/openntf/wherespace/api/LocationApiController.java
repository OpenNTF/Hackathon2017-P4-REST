package org.openntf.wherespace.api;
import org.openntf.wherespace.model.Location;
import org.openntf.wherespace.model.Success;

import io.swagger.annotations.*;

import org.openntf.wherespace.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Controller
public class LocationApiController implements LocationApi {

    private LocationService locationService = new LocationService();

    public ResponseEntity<List<Location>> locationAllGet() {
        // do some magic!
        List<Location> locations = locationService.getAllLocations();
        return new ResponseEntity<List<Location>>(locations, HttpStatus.OK);
    }

    public ResponseEntity<Success> locationLocationIdDelete(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        Success success = locationService.delete(locationId);
        return new ResponseEntity<Success>(success, HttpStatus.OK);
    }

    public ResponseEntity<Location> locationLocationIdGet(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        Location location = locationService.get(locationId);
        return new ResponseEntity<Location>(location, HttpStatus.OK);
    }

    public ResponseEntity<Location> locationLocationIdPost(@ApiParam(value = "The location." ,required=true ) @RequestBody Location body,
        @ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        Location location = locationService.post(body);
        return new ResponseEntity<Location>(location, HttpStatus.OK);
    }

    public ResponseEntity<Location> locationLocationIdPut(@ApiParam(value = "The location." ,required=true ) @RequestBody Location body,
        @ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        Location location = locationService.put(body);
        return new ResponseEntity<Location>(location, HttpStatus.OK);
    }

}
