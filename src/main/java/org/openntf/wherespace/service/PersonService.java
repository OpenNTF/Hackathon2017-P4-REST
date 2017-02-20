package org.openntf.wherespace.service;

import org.openntf.wherespace.model.Location;
import org.openntf.wherespace.model.Person;
import org.openntf.wherespace.model.Success;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by frankvanderlinden on 20/02/2017.
 */
@Service
public class PersonService extends BaseService {

    public Person post(Person person){
        getGenerator().getPeople().add(person);
        return person;
    }

    public Person put(Person person){
        getGenerator().getPeople().add(person);
        return person;
    }

    public Person get(String personId){
        List<Person> persons = getGenerator().getPeople();
        for(Person person : persons){
            if (personId.equals(person.getPersonId())){
                return person;
            }
        }
        return null;
    }

    public Person getByEmail(String email){
        List<Person> persons = getGenerator().getPeople();
        for(Person person : persons){
            if (email.equals(person.getEmailaddress())){
                return person;
            }
        }
        return null;
    }

    public Success delete(String personId){
        List<Person> persons = getGenerator().getPeople();
        for(Person person : persons){
            if (personId.equals(person.getPersonId())){
                persons.remove(person);
            }
        }
        Success success = new Success();
        success.setCode(200);
        success.setMessage("Success....");
        return new Success();
    }
}
