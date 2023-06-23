package pl.testeroprogramowania;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am runing before test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am runing before method");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("I am runing after test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am runing after method");
    }
}
