package org.openntf.wherespace.service;

import org.joda.time.LocalDate;
import org.openntf.wherespace.model.Event;
import org.openntf.wherespace.model.Person;
import org.openntf.wherespace.model.Success;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by frankvanderlinden on 20/02/2017.
 */
@Service
public class EventService extends BaseService {

    public Event post(Event event){
        getGenerator().getEvents().add(event);
        return event;
    }

    public Event put(Event event){
        getGenerator().getEvents().add(event);
        return event;
    }

    public Event get(String eventId){
        List<Event> events = getGenerator().getEvents();
        for(Event event : events){
            if (eventId.equals(event.getEventId())){
                return event;
            }
        }
        return null;
    }

    public Success delete(String eventId){
        List<Event> events = getGenerator().getEvents();
        for(Event event : events){
            if (eventId.equals(event.getEventId())){
                events.remove(event);
            }
        }
        Success success = new Success();
        success.setCode(200);
        success.setMessage("Success....");
        return new Success();
    }

    public List<Event> getEventsByPersonEmail(String email){
        List<Event> events = new ArrayList<Event>();

        for(Event event : getGenerator().getEvents()){
            Person person = getPersonByPersonId(event.getPersonId());
            if(person != null) {
                if (email.equals(person.getEmailaddress())) {
                    events.add(event);
                }
            }
        }

        return events;
    }

    public List<Event> getEventsByPersonEmailAndDate(String email, LocalDate date){
        List<Event> events = new ArrayList<Event>();

        for(Event event : getGenerator().getEvents()){
            Person person = getPersonByPersonId(event.getPersonId());
            if(person != null) {
                if (email.equals(person.getEmailaddress()) && date.equals(event.getDate())) {
                    events.add(event);
                }
            }
        }

        return events;
    }

    private Person getPersonByPersonId(String personId){
        List<Person> persons = getGenerator().getPeople();
        for(Person person : persons){
            if(personId.equals(person.getPersonId())){
                return person;
            }
        }
        return null;
    }


}
