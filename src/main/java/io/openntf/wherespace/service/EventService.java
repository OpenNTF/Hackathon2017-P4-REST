package io.openntf.wherespace.service;

import io.openntf.wherespace.model.Event;
import org.springframework.stereotype.Service;

/**
 * Created by frankvanderlinden on 20/02/2017.
 */
@Service
public class EventService extends BaseService {

    public Event post(Event event){

        return event;
    }

    public Event get(String eventId){
        return new Event();
    }
}
