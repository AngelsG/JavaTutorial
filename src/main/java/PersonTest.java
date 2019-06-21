package com.marcusbiel.javacourse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class PersonTest {


    @Test
    public void shouldReturnHelloWorld(){

       Person marcus = new Person ();
       assertEquals ("Hello World", marcus.helloworld());
    }
    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));

    }

    @Test
    public void shouldReturnNumberOfPerson(){
        Person person1 = new Person();
        Person person2= new Person();
        Person person3= new Person();

        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean(){
        boolean monday = false;
        boolean raining = true;
        boolean tuesday = true;
        boolean sunny = true;
        boolean friday = true;

        if(monday) {
            drinkbeer();
        } else if (friday) {
            drinkWater();
        } else{
            drinkMilk();
        }
    }

    private void drinkbeer() {
    }
    private void drinkWater() {
    }
    private void drinkMilk() {

    }
}

