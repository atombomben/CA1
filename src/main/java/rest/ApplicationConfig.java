package rest;

import utils.EMF_Creator;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        EMF_Creator.createEntityManagerFactory();
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(errorhandling.GenericExceptionMapper.class);
        resources.add(rest.CityInfoResource.class);
        // Resources to be added (found by <domain>/<war>/api/<path>)
        resources.add(rest.CorsFilter.class);
        resources.add(rest.HobbyResource.class);
        resources.add(rest.PersonResource.class);
        resources.add(rest.PhoneResource.class);
        resources.add(rest.RenameMeResource.class);
    }
    
}