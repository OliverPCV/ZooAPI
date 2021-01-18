package cz.educanet.zoo.models;

public class CareTaker {
    private String name;
    private String lastName;
    private Integer age;

    public CareTaker( String name, String lastName, Integer age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public Integer getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
