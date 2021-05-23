package com.browserstack.common;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class ComBase {
	
public static void login(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		
		driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText").sendKeys("8888833333");
		driver.findElementById("com.riviera.indifi.app:id/loginContinueButton").click();
		Thread.sleep(10000);
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
		driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
		Thread.sleep(20000);
		System.out.println("Login and Otp Page Checked");
		
	}





public static void topUp(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	//TopUp
	 driver.findElementById("com.riviera.indifi.app:id/loanDetailsCustomerButton1").click();
	 Thread.sleep(5000);
	 driver.findElementById("com.riviera.indifi.app:id/topupTncCheckBox").click();
     driver.findElementById("com.riviera.indifi.app:id/buttonApplyTopup").click();
     Thread.sleep(3000);
	 driver.findElementByAccessibilityId("Go Back").click();
	 System.out.println("TopUp Page Checked");
	 Thread.sleep(5000);
}



public static void requestSupport(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	driver.findElementById("com.riviera.indifi.app:id/buttonSupport").click();
	Thread.sleep(10000);
	driver.findElementById("android:id/text1").click();
	Thread.sleep(5000);
	driver.findElementByXPath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
			.click();
	driver.findElementById("com.riviera.indifi.app:id/concernText").sendKeys("Nach Keys");
	//driver.findElementById("com.riviera.indifi.app:id/requestSupportButton").click();
	//Thread.sleep(5000);
	//driver.findElementByAccessibilityId("Go Back").click();
	 System.out.println("Request Support Page Checked");
	 Thread.sleep(5000);
   
//	click("android:id/text1");

	
}

public static void loanStatement(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	 //loan
	 driver.findElementById("com.riviera.indifi.app:id/buttonLoanStatement").click();
	 Thread.sleep(5000);
	 driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"TODO\"])[2]").click();
	 //Thread.sleep(5000);
	 //driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
	// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]").click();
	 Thread.sleep(5000);
	 driver.findElementByAccessibilityId("Go Back").click();
	 System.out.println("LoanStatement Page Checked");
	 Thread.sleep(5000);
}

public static void makePayment(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	//Payment
		driver.findElementById("com.riviera.indifi.app:id/buttonMakePayment").click();
		Thread.sleep(2000);
		driver.findElementById("com.riviera.indifi.app:id/editTextAmount").sendKeys("500");;
		driver.findElementById("com.riviera.indifi.app:id/buttonMakePayment").click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("Go Back").click();
		System.out.println("Make Payment Page Checked");
		Thread.sleep(5000);
}

public static void creditScoreView(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	//creditScire
	driver.findElementById("com.riviera.indifi.app:id/cibilExploreMore").click();
	 Thread.sleep(20000);
	 
	 //payments
	 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[1]").click();
	 Thread.sleep(5000);
	 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View").click();
	 Thread.sleep(5000);
	 driver.navigate().back();
	 System.out.println("Credit Score Page Checked");
	 Thread.sleep(5000);
	
}

public static void pragatiPage(AndroidDriver<AndroidElement> driver) throws InterruptedException {
    driver.findElementById("com.riviera.indifi.app:id/pragatiExploreMore").click();
//    Thread.sleep(10000);
//	driver.navigate().back();
//	System.out.println("Pragati Page Checked");
//	 Thread.sleep(5000);
}



public static void swipe(int startx, int starty, int endx, int endy,AndroidDriver<AndroidElement> driver) {
	
	System.out.println("Swipe Screen");
    TouchAction touchAction = new TouchAction(driver);

    touchAction.longPress(PointOption.point(startx, starty))
  
               .moveTo(PointOption.point(endx, endy))
               .release()
               .perform();
  
}


public static void logout(AndroidDriver<AndroidElement> driver) throws InterruptedException {
 driver.findElementByAccessibilityId("TODO").click();
 Thread.sleep(3000);
 driver.findElementById("android:id/content").click();
 System.out.println("LogOut Checked");
 Thread.sleep(1000);
 
	
}

public static void quit(AndroidDriver<AndroidElement> driver) {
	driver.quit();
}

public static void navigateBack(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	driver.navigate().back();
	Thread.sleep(5000);
}

}
