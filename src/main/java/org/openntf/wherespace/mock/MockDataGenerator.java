package org.openntf.wherespace.mock;

import org.openntf.wherespace.model.Event;
import org.openntf.wherespace.model.Location;
import org.openntf.wherespace.model.Person;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class MockDataGenerator {
    private static int nextPersonId = 1;
    private static int nextEventtId = 1;

    private static final Random random = new Random(1);

    private List<Person> people = null;
    private List<Location> locations = null;
    private List<Event> events = null;

    public MockDataGenerator(){

    }

    public void run(){
    	createLocations();
    	createPeople();
    	createEvents();
    }

    private void createPeople() {
        Person person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("graham.acres@brytek.ca");
        person.setFirstName("Graham");
        person.setLastName("Acres");
        person.setPersonId("1");
        person.setPhoneNumber("(604) 916-7526");

        this.getPeople().add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("betty.robinson@brytek.ca");
        person.setFirstName("Betty");
        person.setLastName("Robinson");
        person.setPersonId("20");
        person.setPhoneNumber("(604) 916-7526");

        this.getPeople().add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("kgodbold@canalbarge.com");
        person.setFirstName("Kerry");
        person.setLastName("Godbold");
        person.setPersonId("2");
        person.setPhoneNumber("(504) 669 4391");

        this.getPeople().add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("slohja@hotmail.com");
        person.setFirstName("Slobodan");
        person.setLastName("Lohja");
        person.setPersonId("3");
        person.setPhoneNumber("(773) 297 8756");

        this.getPeople().add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("pwithers@intect.co.uk");
        person.setFirstName("Paul");
        person.setLastName("Withers");
        person.setPersonId("4");
        person.setPhoneNumber("+44 774 904 6270");

        getPeople().add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("flinden68@elstarit.nl");
        person.setFirstName("Frank");
        person.setLastName("Linden");
        person.setPersonId("5");
        person.setPhoneNumber("+31 63 739 4111");
    }

    private void createLocations(){
    	Location location = new Location();
    	location.setLocationId("540");
    	location.setName("IBM Hackathon");

    	getLocations().add(location);

    	location = new Location();
    	location.setLocationId("560");
    	location.setName("Canal Barge Company");

    	this.locations.add(location);

    	location = new Location();
    	location.setLocationId("570");
    	location.setName("ElstarIt");

        getLocations().add(location);

    	location = new Location();
    	location.setLocationId("580");
    	location.setName("Intect");

        getLocations().add(location);

    	location = new Location();
    	location.setLocationId("590");
    	location.setName("Brytec");
    }

    private void createEvents() {
        Event event = new Event();
        List<LocalDate> range = new ArrayList<LocalDate>();
        range.add(new LocalDate("2017-02-20"));
        int counter = 0;

        for(Iterator<Person> i = getPeople().iterator(); i.hasNext(); ) {
            Person person = i.next();
            Event currentEvent = new Event();
            currentEvent.setPersonId(person.getPersonId());
            currentEvent.setLocationId("540");
            currentEvent.setDates(range);
            currentEvent.setEventId("400-" + counter++);
            currentEvent.setLongitude(new Float(0));
            currentEvent.setLatitude(new Float(0));
        }


    }


    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
