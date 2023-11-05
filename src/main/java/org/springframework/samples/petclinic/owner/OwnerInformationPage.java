package org.springframework.samples.petclinic.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OwnerInformationPage extends PetClinicPageObject {

	public OwnerInformationPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void isReady() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
	}

}
