package test;
//exclude test cases, include test cases and use regular expression to run specific test cases in testng.xml file
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Iterator;


public class Day3 {

    @Parameters({"Google_URL"})
    @Test
    public void officeReception(String urlName){
        System.out.println("OFFICE RECEPTION"+" : "+urlName);
    }

    @Test(groups={"SMOKE"})
    public void officeCabins(){
        System.out.println("OFFICE CABINS");
    }

    @Test(dependsOnMethods = {"officeMeetingRoom"})
    public void officeCafeteria(){
        System.out.println("OFFICE CAFETERIA");
    }

    @Parameters({"Google_URL","MY_URL"})
    @Test
    public void officeMeetingRoom(String nameURL, String murl){
        System.out.println("OFFICE MEETING ROOM: "+" : "+ nameURL+" :: "+murl);
    }

    @Test(dataProvider = "getData")
    public void officeSmokeRoom(String uname, String number){
        System.out.println(uname+" : "+number);
    }

    @DataProvider
    public Object[][] getData(){

        Object dataSet[][] = new Object[3][2];

        dataSet[0][0] = "ashok";
        dataSet[0][1] = "1989";

        dataSet[1][0] = "sharath";
        dataSet[1][1] = "1995";

        dataSet[2][0] = "Gnani";
        dataSet[2][1] = "1999";



        return dataSet;
    }
}
