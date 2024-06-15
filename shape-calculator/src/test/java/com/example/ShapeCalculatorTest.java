package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShapeCalculatorTest {
    private ShapeCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new ShapeCalculator();
    }

    @Test
    public void testCalculateTotalArea() {
        List<Shape> shapes = List.of(
                ShapeFactory.createShape("square", 5),
                ShapeFactory.createShape("rectangle", 3, 4),
                ShapeFactory.createShape("circle", 2),
                ShapeFactory.createShape("triangle", 3, 4, 5));

        double totalArea = calculator.calculateTotalArea(shapes);
        assertEquals(55.566, totalArea, 0.001);
    }

    @Test
    public void testCalculateTotalPerimeter() {
        List<Shape> shapes = List.of(
                ShapeFactory.createShape("square", 5),
                ShapeFactory.createShape("rectangle", 3, 4),
                ShapeFactory.createShape("circle", 2),
                ShapeFactory.createShape("triangle", 3, 4, 5));

        double totalPerimeter = calculator.calculateTotalPerimeter(shapes);
        assertEquals(58.566, totalPerimeter, 0.001);
    }

    @Test
    public void testCalculateTotalAreaWithMocks() {
        Shape square = mock(Shape.class);
        Shape rectangle = mock(Shape.class);
        Shape circle = mock(Shape.class);
        Shape triangle = mock(Shape.class);

        when(square.calculateArea()).thenReturn(25.0);
        when(rectangle.calculateArea()).thenReturn(12.0);
        when(circle.calculateArea()).thenReturn(Math.PI * 4);
        when(triangle.calculateArea()).thenReturn(6.0);

        List<Shape> shapes = List.of(square, rectangle, circle, triangle);

        double totalArea = calculator.calculateTotalArea(shapes);
        assertEquals(55.566, totalArea, 0.001);

        verify(square).calculateArea();
        verify(rectangle).calculateArea();
        verify(circle).calculateArea();
        verify(triangle).calculateArea();
    }

    @Test
    public void testCalculateTotalPerimeterWithMocks() {
        Shape square = mock(Shape.class);
        Shape rectangle = mock(Shape.class);
        Shape circle = mock(Shape.class);
        Shape triangle = mock(Shape.class);

        when(square.calculatePerimeter()).thenReturn(20.0);
        when(rectangle.calculatePerimeter()).thenReturn(14.0);
        when(circle.calculatePerimeter()).thenReturn(2 * Math.PI * 2);
        when(triangle.calculatePerimeter()).thenReturn(12.0);

        List<Shape> shapes = List.of(square, rectangle, circle, triangle);

        double totalPerimeter = calculator.calculateTotalPerimeter(shapes);
        assertEquals(58.566, totalPerimeter, 0.001);

        verify(square).calculatePerimeter();
        verify(rectangle).calculatePerimeter();
        verify(circle).calculatePerimeter();
        verify(triangle).calculatePerimeter();
    }
}
