package org.openntf.wherespace.service;

import org.openntf.wherespace.model.Location;
import org.openntf.wherespace.model.Success;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by frankvanderlinden on 20/02/2017.
 */
@Service
public class LocationService extends BaseService {

    public Location post(Location location){
        getGenerator().getLocations().add(location);
        return location;
    }

    public Location put(Location location){
        getGenerator().getLocations().add(location);
        return location;
    }

    public Location get(String locationId){
        List<Location> locations = getGenerator().getLocations();
        for(Location location : locations){
            if (locationId.equals(location.getLocationId())){
                return location;
            }
        }
        return null;
    }

    public List<Location> getAllLocations(){
        return getGenerator().getLocations();
    }

    public Success delete(String locationId){
        List<Location> locations = getGenerator().getLocations();
        for(Location location : locations){
            if (locationId.equals(location.getLocationId())){
                locations.remove(location);
            }
        }
        Success success = new Success();
        success.setCode(200);
        success.setMessage("Success....");
        return new Success();
    }
}
