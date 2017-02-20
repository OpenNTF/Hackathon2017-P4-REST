package io.openntf.wherespace.api;
import io.openntf.wherespace.model.Location;
import io.openntf.wherespace.model.Success;

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


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Controller
public class LocationApiController implements LocationApi {

    public ResponseEntity<List<Location>> locationAllGet() {
        // do some magic!
        return new ResponseEntity<List<Location>>(HttpStatus.OK);
    }

    public ResponseEntity<Success> locationLocationIdDelete(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        return new ResponseEntity<Success>(HttpStatus.OK);
    }

    public ResponseEntity<Location> locationLocationIdGet(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        return new ResponseEntity<Location>(HttpStatus.OK);
    }

    public ResponseEntity<Location> locationLocationIdPost(@ApiParam(value = "The location." ,required=true ) @RequestBody Location body,
        @ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        return new ResponseEntity<Location>(HttpStatus.OK);
    }

    public ResponseEntity<Location> locationLocationIdPut(@ApiParam(value = "The location." ,required=true ) @RequestBody Location body,
        @ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        return new ResponseEntity<Location>(HttpStatus.OK);
    }

}
