package cz.educanet.zoo.models;

public class Animal {

    private String name;
    private int age;
    private double weight;
    private int id;
    private String gender;



    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public Integer getId(){
        return id;
    }

    public Integer getWeight(){
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

    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setGender(String gender){
        this.gender= gender;
    }

}
