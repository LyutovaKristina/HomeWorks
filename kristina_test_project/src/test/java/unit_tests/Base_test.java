package unit_tests;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_test {

    @BeforeTest
    public void beforeTest () {
        System.out.println("Before test method was started");
    }

    @AfterTest
    public void afterTest () {
        System.out.println("After test method was started");
    }
}
