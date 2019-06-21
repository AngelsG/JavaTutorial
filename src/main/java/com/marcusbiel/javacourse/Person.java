package com.marcusbiel.javacourse;

public class Person {

    private com.marcusbiel.javacourse.Name personName;
    private static int personCounter;

    public Person(com.marcusbiel.javacourse.Name personName){
        this.personName  = personName;


    }

    public Person(){
        personCounter ++;
        //empty on purpose, default constructor
    }
    public String helloworld() {
        return "Hello World";
    }

    public com.marcusbiel.javacourse.Name name(){
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
