package test;

import org.testng.annotations.*;

public class Day4 {


    @BeforeSuite
    public void preSuite(){
        System.out.println("Before Suite: HOME Day4 Class");
    }
    @BeforeTest
    public void preCondition(){
        System.out.println("Before Test method: HOME Day4 Class ");
    }
    @Test
    public void hall(){
        System.out.println("HALL");
    }

    @Test
    public void kitchen(){
        System.out.println("HOME KITCHEN");
    }

    @BeforeMethod
    public void preMethod(){
        System.out.println("Before Method: HOME DAY4 Class");
    }
    @Test
    public void bedRoom(){
        System.out.println("HOME BED ROOM");
    }

    @Test(groups={"SMOKE"})
    public void balcony(){
        System.out.println("HOME BALCONY");
    }


    @AfterMethod
    public void postMethod(){
        System.out.println("After Method: HOME Day4");
    }
    @AfterTest
    public void postCondition(){
        System.out.println("After Test method: HOME Day4 class ");
    }

    @AfterSuite
    public void postSuite(){
        System.out.println("After Suite: HOME DAY4 Class");
    }
}
