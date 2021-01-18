package cz.educanet.zoo;

import cz.educanet.zoo.models.Animal;

import javax.validation.constraints.Positive;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/animals")
@Produces(MediaType.APPLICATION_JSON)
public class AnimalResource {

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    @GET
    public Response getAnimals(){
        return Response.ok(animals).build();
    }

    @POST
    public Response addAnimal(Animal animal){
        animal.setAge(22);
        animal.setName("Chuj");
        animal.setGender("female");
        animal.setWeight(50);
        return Response.ok(animal).build();
    }
}
