package cz.educanet.zoo;


import cz.educanet.zoo.models.Animal;
import cz.educanet.zoo.models.CareTaker;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class CaretakerManager {

    private int id = 0;

    private ArrayList<CareTaker> careTakers = new ArrayList<CareTaker>();

    public ArrayList<CareTaker> getCareTakers(){
        return careTakers;
    }

    public boolean editCareTaker(int id, CareTaker careTaker){
        CareTaker careTakerById = returnCareTakerById(id);

        if(doesCareTakerExist(id)){
            careTaker.setName(careTakerById.getName());
            careTaker.setLastName(careTakerById.getGender());
            careTaker.setGender(careTakerById.getGender());
            return true;
        }else return false;
    }

    public CareTaker addCareTaker(CareTaker careTaker){
        careTaker.setId(id);
        id++;
        careTakers.add(careTaker);
        return careTaker;
    }

    public boolean deleteCareTakerById(int id){
        return careTakers.remove(returnCareTakerById(id));

    }

    public CareTaker returnCareTakerById(int id){
        return careTakers.stream().filter(careTaker -> id == careTaker.getId()).findAny().orElse(null);
    }

    public boolean doesCareTakerExist(int id){
        return careTakers.stream().filter(careTaker -> id == careTaker.getId()).findAny().orElse(null) != null;
    }


    public void saveCareTaker(CareTaker careTaker){
        careTakers.add(careTaker);
    }
}
