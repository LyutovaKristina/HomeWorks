package ru.qaway.testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static ru.qaway.testng.Triangle.*;

public class TriangleTest {

    @Test (description = "Тест для определения фигуры", priority = 0)
    public void testTriangle () {
        String result = ru.qaway.testng.Triangle.isTriangle("4 5 6");
        Assert.assertEquals(result, TRIANGLE, "Input is triangle");
    }

    @Test (description = "Тест для определения равнобедренного треугольника", dependsOnMethods = "testTriangle")
    public void testEquiTriangle () {
        String result = ru.qaway.testng.Triangle.isTriangle("4 4 4 ");
        Assert.assertEquals(result, EQUILATERAL, "Input is equilateral triangle");
    }

    @Test (description = "Тест для определения равностороннего треугольника", dependsOnMethods = "testEquiTriangle", alwaysRun = true)
    public void testIsoscelesTriangle () {
        String result = ru.qaway.testng.Triangle.isTriangle("4 6 6");
        Assert.assertEquals(result, ISOSCELES, "Input is isosceles triangle");
    }

    @Test (description = "Тест для определения треугольник ли фигура", dependsOnMethods = {"testIsoscelesTriangle", "testEquiTriangle"})
    public void testNotTriangle () {
        String result = ru.qaway.testng.Triangle.isTriangle("4 5 20");
        Assert.assertEquals(result, NOT_TRIANGLE, "Input is not triangle");
    }

}

