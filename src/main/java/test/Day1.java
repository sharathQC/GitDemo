package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {


    @Parameters({"Youtube_URL","Google_URL"})
    @Test
    public void display(String site, String uname){
        System.out.println("Day1->display method"+" : "+site+" :: "+uname);
        System.out.println("Day2->display method"+" : "+site+" :: "+uname);
        System.out.println("Day3->display method"+" : "+site+" :: "+uname);
    }

    @Test
    public void displayOne(){
        System.out.println("Day1->displayOne method");
    }

    @Test
    public void displayTwo(){
        System.out.println("Day1->displayTwo method");
    }
}
