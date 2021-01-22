package cz.educanet.zoo.models;

public class Animal {

    public String name;
    public int age;
    public double weight;
    public int id;
    public String gender;

    public Animal(String name, int age, double weight, String gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public String getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setGender(String gender){
        this.gender= gender;
    }

}
