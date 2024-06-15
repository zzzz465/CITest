package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest extends ShapeTest {

    @Override
    protected Shape createShape() {
        return new Square(4);
    }

    @Test
    public void testCalculateArea() {
        Square square = new Square(4);
        assertEquals(16, square.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.calculatePerimeter());
    }
}
