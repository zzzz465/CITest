package com.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
            ShapeFactory.createShape("square", 5),
            ShapeFactory.createShape("rectangle", 3, 4),
            ShapeFactory.createShape("circle", 2),
            ShapeFactory.createShape("triangle", 3, 4, 5)
        );

        ShapeCalculator calculator = new ShapeCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        double totalPerimeter = calculator.calculateTotalPerimeter(shapes);

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
