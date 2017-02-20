package org.openntf.wherespace.api;
import org.openntf.wherespace.model.Person;
import org.openntf.wherespace.model.Success;

import io.swagger.annotations.*;

import org.openntf.wherespace.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-20T21:14:48.243Z")

@Controller
public class PersonApiController implements PersonApi {

    private PersonService personService = new PersonService();
    public ResponseEntity<Person> personEmailGet(@ApiParam(value = "Fetched all the person by email", required = true) @RequestParam(value = "email", required = true) String email) {
        // do some magic!
        Person person = personService.getByEmail(email);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    public ResponseEntity<Success> personPersonIdDelete(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!

        Success success = personService.delete(personId);
        return new ResponseEntity<Success>(success, HttpStatus.OK);
    }

    public ResponseEntity<Person> personPersonIdGet(@ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        Person person = personService.get(personId);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    public ResponseEntity<Person> personPersonIdPost(@ApiParam(value = "The person." ,required=true ) @RequestBody Person body,
        @ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        Person person = personService.post(body);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    public ResponseEntity<Person> personPersonIdPut(@ApiParam(value = "The person." ,required=true ) @RequestBody Person body,
        @ApiParam(value = "The ID of the person.",required=true ) @PathVariable("personId") String personId) {
        // do some magic!
        Person person = personService.put(body);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

}
