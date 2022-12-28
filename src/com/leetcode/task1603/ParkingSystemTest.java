package com.leetcode.task1603;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

    @Test
    void addCarTest() {
        final ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        boolean test1 = parkingSystem.addCar(1);
        assertTrue(test1);
        boolean test2 = parkingSystem.addCar(2);
        assertTrue(test2);
        boolean test3 = parkingSystem.addCar(3);
        assertFalse(test3);
        boolean test4 = parkingSystem.addCar(1);
        assertFalse(test4);
    }
}
