package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(14, rectangle.calculatePerimeter());
    }
}
