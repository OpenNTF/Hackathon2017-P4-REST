package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Person;
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
public class PersonApiController implements PersonApi {

    public ResponseEntity<Person> personEmailGet(@ApiParam(value = "Fetched all the person by email", required = true) @RequestParam(value = "email", required = true) String email) {
        // do some magic!
        return new ResponseEntity<Person>(HttpStatus.OK);
    }

    public ResponseEntity<Success> personPersonIdDelete(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        return new ResponseEntity<Success>(HttpStatus.OK);
    }

    public ResponseEntity<Person> personPersonIdGet(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        return new ResponseEntity<Person>(HttpStatus.OK);
    }

    public ResponseEntity<Person> personPersonIdPost(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        return new ResponseEntity<Person>(HttpStatus.OK);
    }

    public ResponseEntity<Person> personPersonIdPut(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        return new ResponseEntity<Person>(HttpStatus.OK);
    }

}
