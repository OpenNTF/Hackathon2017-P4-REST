package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Person;

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
public class PeopleApiController implements PeopleApi {

    public ResponseEntity<List<Person>> peopleEventEventIdGet(@ApiParam(value = "The ID of the event.",required=true ) @PathVariable("eventId") String eventId) {
        // do some magic!
        return new ResponseEntity<List<Person>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Person>> peopleLocationLocationIdGet(@ApiParam(value = "The ID of the location.",required=true ) @PathVariable("locationId") String locationId) {
        // do some magic!
        return new ResponseEntity<List<Person>>(HttpStatus.OK);
    }

}
