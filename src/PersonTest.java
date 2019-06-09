package com.marcusbiel.javacourse;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




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
}
