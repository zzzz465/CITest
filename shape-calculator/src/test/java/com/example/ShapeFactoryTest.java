package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTest {
    @Test
    public void testCreateSquare() {
        Shape square = ShapeFactory.createShape("square", 4);
        assertNotNull(square);
        assertTrue(square instanceof Square);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("rectangle", 3, 4);
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("circle", 2);
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateTriangle() {
        Shape triangle = ShapeFactory.createShape("triangle", 3, 4, 5);
        assertNotNull(triangle);
        assertTrue(triangle instanceof Triangle);
    }

    @Test
    public void testCreateUnknownShape() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeFactory.createShape("pentagon", 1);
        });
    }
}
