package org.openntf.wherespace.service;

import org.openntf.wherespace.model.Event;
import org.openntf.wherespace.model.Success;
import org.springframework.stereotype.Service;

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
        for(Event event : getGenerator().getEvents()){
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
}
