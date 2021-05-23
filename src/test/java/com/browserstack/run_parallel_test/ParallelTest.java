package com.browserstack.run_parallel_test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.browserstack.common.ComBase;

import java.util.List;

public class ParallelTest extends BrowserStackTestNGTest {

	// @Test
//    public void test() throws Exception {
//      AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
//      searchElement.click();
//      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//          ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
//      insertTextElement.sendKeys("BrowserStack");
//      Thread.sleep(5000);
//
//      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//      Assert.assertTrue(allProductsName.size() > 0);
//    }
	@Test
	public void test() throws InterruptedException {

		ComBase.login(driver);
		ComBase.swipe(921, 610, 175, 620, driver);
		ComBase.swipe(540, 1824, 540, 620, driver);
		ComBase.creditScoreView(driver);
		ComBase.swipe(540, 1824, 540, 672, driver);
		ComBase.pragatiPage(driver);
		ComBase.swipe(540, 1824, 540, 672, driver);
		ComBase.navigateBack(driver);
		ComBase.loanStatement(driver);
		ComBase.topUp(driver);
		ComBase.requestSupport(driver);
		ComBase.navigateBack(driver);
		ComBase.swipe(540, 1824, 540, 672, driver);
		ComBase.makePayment(driver);
		ComBase.logout(driver);
		ComBase.quit(driver);

	}
}
