package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest extends ShapeTest {

    @Override
    protected Shape createShape() {
        return new Triangle(3, 4, 5);
    }

    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.calculateArea(), 0.001);
    }

    @Test
    public void testCalculatePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.calculatePerimeter());
    }
}
