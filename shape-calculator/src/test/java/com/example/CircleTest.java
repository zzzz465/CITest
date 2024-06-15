package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {
    @Test
    public void testCalculateArea() {
        Circle circle = new Circle(2);
        assertEquals(Math.PI * 4, circle.calculateArea(), 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        Circle circle = new Circle(2);
        assertEquals(2 * Math.PI * 2, circle.calculatePerimeter(), 0.001);
    }
}
