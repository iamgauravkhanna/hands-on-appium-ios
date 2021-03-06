package hands.on.appium_ios.apps_native;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class CalculatorExample {

	@Test
	public void calculatorTest() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("platformVersion", "13.3");
		desiredCapabilities.setCapability("deviceName", "iPhone 8");
		desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "io.cloudgrey.the-app");

		IOSDriver<IOSElement> iosDriver = new IOSDriver<IOSElement>(new URL("http://localhost:4723/wd/hub"),
				desiredCapabilities);

		Boolean status = iosDriver.findElement(MobileBy.AccessibilityId("Choose An Awesome View")).isDisplayed();

		System.out.println("Status : " + status);
		
		iosDriver.quit();

	}

}
