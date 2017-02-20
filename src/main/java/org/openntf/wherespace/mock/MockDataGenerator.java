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

    private static List<Person> people1 = new ArrayList<Person>();
    private static List<Location> locations1 = new ArrayList<Location>();
    private static List<Event> events1 = new ArrayList<Event>();

    public MockDataGenerator(){

    }

    public void run(){
    	//createLocations();
    	//createPeople();
    	//createEvents();
    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<Person>();

        Person person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("graham.acres@brytek.ca");
        person.setFirstName("Graham");
        person.setLastName("Acres");
        person.setPersonId("1");
        person.setPhoneNumber("(604) 916-7526");

        people.add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("betty.robinson@brytek.ca");
        person.setFirstName("Betty");
        person.setLastName("Robinson");
        person.setPersonId("20");
        person.setPhoneNumber("(604) 916-7526");

        people.add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("kgodbold@canalbarge.com");
        person.setFirstName("Kerry");
        person.setLastName("Godbold");
        person.setPersonId("2");
        person.setPhoneNumber("(504) 669 4391");

        people.add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("slohja@hotmail.com");
        person.setFirstName("Slobodan");
        person.setLastName("Lohja");
        person.setPersonId("3");
        person.setPhoneNumber("(773) 297 8756");

        people.add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("pwithers@intect.co.uk");
        person.setFirstName("Paul");
        person.setLastName("Withers");
        person.setPersonId("4");
        person.setPhoneNumber("+44 774 904 6270");

        people.add(person);

        person = new Person();
        person.setDepartment("Development");
        person.setEmailaddress("flinden68@elstarit.nl");
        person.setFirstName("Frank");
        person.setLastName("Linden");
        person.setPersonId("5");
        person.setPhoneNumber("+31 63 739 4111");

        return people;

    }

    public static List<Location> getLocations(){
        List<Location> locations = new ArrayList<Location>();

    	Location location = new Location();
    	location.setLocationId("540");
    	location.setName("IBM Hackathon");

        locations.add(location);

    	location = new Location();
    	location.setLocationId("560");
    	location.setName("Canal Barge Company");

    	locations.add(location);

    	location = new Location();
    	location.setLocationId("570");
    	location.setName("ElstarIt");

        locations.add(location);

    	location = new Location();
    	location.setLocationId("580");
    	location.setName("Intect");

        locations.add(location);

    	location = new Location();
    	location.setLocationId("590");
    	location.setName("Brytec");

    	return locations;

    }

    public static List<Event> getEvents() {
        Event event = new Event();
        List<LocalDate> range = new ArrayList<LocalDate>();
        range.add(new LocalDate("2017-02-20"));
        int counter = 0;
        List<Event> events = new ArrayList<Event>();

        List<Person> people = getPeople();

        for(Iterator<Person> i = people.iterator(); i.hasNext(); ) {
            Person person = i.next();
            Event currentEvent = new Event();
            currentEvent.setPersonId(person.getPersonId());
            currentEvent.setLocationId("540");
            currentEvent.setDates(range);
            currentEvent.setEventId("400-" + counter++);
            currentEvent.setLongitude(new Float(0));
            currentEvent.setLatitude(new Float(0));

            events.add(currentEvent);
        }

        return events;
    }

}
