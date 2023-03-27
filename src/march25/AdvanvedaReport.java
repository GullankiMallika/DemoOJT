package march25;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AdvanvedaReport 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void generateReport()
	{
	report = new ExtentReports("./ExtentReports/Demo.html");

} 
@BeforeMethod
public void setup()
{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
}
@Test
public void testcase1()
{
	test= report.startTest("pass Test");
	test.assignAuthor("Mallika");
	test.assignCategory("Functional");
	java.lang.String Expected_Title ="Google";
	java.lang.String Actual_Title=driver.getTitle();
	
	if(Expected_Title.equalsIgnoreCase(Actual_Title))
	{
		test.log(LogStatus.PASS, "Title is Matching:::"+Expected_Title+"      "+Actual_Title);
	}
	else
	{
		test.log(LogStatus.FAIL, "Title is Matching:::"+Expected_Title+"      "+Actual_Title);	
}

}




public void testcase2()
{
	test= report.startTest("pass Test");
	test.assignAuthor("Mallika");
	test.assignCategory("Functional");
	java.lang.String Expected_Title ="Gmail";
	java.lang.String Actual_Title=driver.getTitle();
	
	if(Expected_Title.equalsIgnoreCase(Actual_Title))
	{
		test.log(LogStatus.PASS, "Title is Matching:::"+Expected_Title+"      "+Actual_Title);
	}
	else
	{
		test.log(LogStatus.FAIL, "Title is  Matching:::"+Expected_Title+"      "+Actual_Title);	

	}
}
		@AfterMethod
		public void tearDown()
		{
			
			driver.quit();

		}
	}


