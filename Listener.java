package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener   
{  
  
    public void onTestStart1(ITestResult result) {  
        // TODO Auto-generated method stub  
          
    }  
  
    public void onTestSuccess1(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Success of test cases and its details are : "+result.getName());  
    }  
  
    public void onTestFailure1(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());  
    }  
  
    public void onTestSkipped1(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Skip of test cases and its details are : "+result.getName());  
    }  
  
    public void onTestFailedButWithinSuccessPercentage1(ITestResult result) {  
        // TODO Auto-generated method stub  
        System.out.println("Failure of test cases and its details are : "+result.getName());  
    }  
  
    public void onStart1(ITestContext context) {  
        // TODO Auto-generated method stub  
          
    }  
  
    public void onFinish1(ITestContext context) {  
        // TODO Auto-generated method stub  
          
    }

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}  
}  