package com.example;

public class ShapeFactory {
    public static Shape createShape(String shapeType, double... params) {
        switch (shapeType.toLowerCase()) {
            case "square":
                return new Square(params[0]);
            case "rectangle":
                return new Rectangle(params[0], params[1]);
            case "circle":
                return new Circle(params[0]);
            case "triangle":
                return new Triangle(params[0], params[1], params[2]);
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
