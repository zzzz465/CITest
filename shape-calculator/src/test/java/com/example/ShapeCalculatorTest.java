package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeCalculatorTest {
    @Test
    public void testCalculateTotalArea() {
        List<Shape> shapes = List.of(
            ShapeFactory.createShape("square", 5),
            ShapeFactory.createShape("rectangle", 3, 4),
            ShapeFactory.createShape("circle", 2),
            ShapeFactory.createShape("triangle", 3, 4, 5)
        );

        ShapeCalculator calculator = new ShapeCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        assertEquals(67.566, totalArea, 0.001);
    }

    @Test
    public void testCalculateTotalPerimeter() {
        List<Shape> shapes = List.of(
            ShapeFactory.createShape("square", 5),
            ShapeFactory.createShape("rectangle", 3, 4),
            ShapeFactory.createShape("circle", 2),
            ShapeFactory.createShape("triangle", 3, 4, 5)
        );

        ShapeCalculator calculator = new ShapeCalculator();
        double totalPerimeter = calculator.calculateTotalPerimeter(shapes);
        assertEquals(40.283, totalPerimeter, 0.001);
    }
}
