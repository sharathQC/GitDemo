package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {

    @Test
    public void show(){
        System.out.println("Day2->show one method");
        System.out.println("Day2.1->show one method");
        System.out.println("Day2.2->show one method");
        System.out.println("Day2.3->show one method");
        System.out.println("Day2.4->show one method");
    }

    @Test
    public void showTwo(){
        System.out.println("Day2->show two method");
        //Assert.assertTrue(false);
    }

    @Test
    public void showThree(){
        System.out.println("Day2->show three method");
    }
    @Test
    public void showFour(){
        System.out.println("Day2->show four method");
    }

}
