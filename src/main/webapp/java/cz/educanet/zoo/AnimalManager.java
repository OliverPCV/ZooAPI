package cz.educanet.zoo;

import cz.educanet.zoo.models.Animal;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class AnimalManager {

    private int id = 0;

    private ArrayList<Animal> animals = new ArrayList<>();


    public ArrayList<Animal> getAnimals(){
        return animals;
    }

    public Animal addAnimal(Animal animal){
        animal.setId(id);
        id++;
        animals.add(animal);
        return animal;
    }

    public boolean editAnimal(int id, Animal animal){
        Animal animalById = returnAnimalById(id);

        if(doesAnimalExist(id)){
            animal.setName(animalById.getName());
            animal.setAge(animalById.getAge());
            animal.setWeight(animalById.getWeight());
            animal.setGender(animalById.getGender());
            return true;
        }else return false;
    }

    public Animal returnAnimalById(int id){
        return animals.stream().filter(animal -> id == animal.getId()).findAny().orElse(null);
    }

    public boolean doesAnimalExist(int id){
        return animals.stream().filter(animal -> id == animal.getId()).findAny().orElse(null) != null;

    }

    public boolean deleteAnimalById(int id){
        return animals.remove(returnAnimalById(id));
    }

    public void saveAnimal(Animal animal){
        animals.add(animal);
    }

}
