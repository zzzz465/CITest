package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class ShapeTest {

    @Test
    public void testCalculateArea() {
        Shape shape = createShape();
        assertNotEquals(0, shape.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Shape shape = createShape();
        assertNotEquals(0, shape.calculatePerimeter());
    }

    protected abstract Shape createShape();
}
