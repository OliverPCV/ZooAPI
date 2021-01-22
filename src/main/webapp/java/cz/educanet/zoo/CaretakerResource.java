package cz.educanet.zoo;


import cz.educanet.zoo.models.CareTaker;

import javax.faces.push.Push;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("caretakers")
@Produces(MediaType.APPLICATION_JSON)
public class CaretakerResource {

    @Inject
    public CaretakerManager caretakerManager;

    @GET
    public Response getAllCareTakers(){
        return Response.ok(caretakerManager.getCareTakers()).build();
    }

    @GET
    @Path("{id}")
    public Response getCareTakerById(@PathParam("id") int id){
        if (caretakerManager.doesCareTakerExist(id)){
            return Response.ok(caretakerManager.returnCareTakerById(id)).build();

        } else return Response.ok(Response.Status.BAD_REQUEST).build();
    }

    @POST
    @Path("create")
    public Response addCareTaker(@FormParam("name") String name,@FormParam("lastName") String lastName, @FormParam("gender") String gender){

        CareTaker careTaker = new CareTaker(name, lastName, gender);
        caretakerManager.saveCareTaker(caretakerManager.addCareTaker(careTaker));
        return Response.ok().build();
    }

    @PUT
    @Path("{id}")
    public Response editCareTaker(@PathParam("id") int id, CareTaker careTaker){
        if(caretakerManager.editCareTaker(id, careTaker)){
            return Response.ok("Ok").build();
        } else return Response.ok(Response.Status.BAD_REQUEST).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteCareTaker(@PathParam("id") int id){
        if(caretakerManager.deleteCareTakerById(id)){
            return Response.ok("Ok").build();
        } else return Response.ok(Response.Status.BAD_REQUEST).build();
    }

}
