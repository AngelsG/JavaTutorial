package com.marcusbiel.javacourse;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personName){
        this.personName  = personName;


    }

    public Person(){
        personCounter ++;
        //empty on purpose, default constructor
    }
    public String helloworld() {
        return "Hello World";
    }

    public Name name(){
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
