package cz.educanet.zoo.models;

public class CareTaker {
    private String name;
    private String lastName;
    private String gender;
    private int id;

    public CareTaker( String name, String lastName, String gender){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setId(int id){
        this.id = id;
    }

}
