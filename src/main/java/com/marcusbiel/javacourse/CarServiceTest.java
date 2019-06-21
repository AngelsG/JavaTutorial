package com.marcusbiel.javacourse;

import org.junit.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging() {
        com.marcusbiel.javacourse.CarService carService = new com.marcusbiel.javacourse.CarService();
        carService.process("BMW");
    }
}