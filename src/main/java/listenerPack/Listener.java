package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	public void onTestSuccess(ITestResult pass)
	{
		System.out.println(pass.getMethod().getMethodName()+" successfully executed");
	}
	
	
	
	public void onTestFailure(ITestResult failed)
	{
		System.out.println(failed.getMethod().getMethodName()+" got failed & ScreenShot Captured");
		System.out.println(failed.getThrowable());
	}
	
	
	

}
