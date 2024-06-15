package com.example;

import java.util.List;

public class ShapeCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::calculateArea).sum();
    }

    public double calculateTotalPerimeter(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::calculatePerimeter).sum();
    }
}
