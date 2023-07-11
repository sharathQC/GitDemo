package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners implements ITestListener {


    public void onTestStart(ITestResult result){

    }

    public void onTestSuccess(ITestResult result){
        System.out.println("onTestSuccess method: "+" : "+result.getName()+" : "+result.getStatus()+" : "+result.getMethod()+" : "+result.getParameters());

    }

    public void onTestFailure(ITestResult result){
        System.out.println("onTestFailure method: "+" : "+result.getName()+" : "+result.getStatus()+" : "+result.getMethod()+" : "+result.getParameters());
    }

}
