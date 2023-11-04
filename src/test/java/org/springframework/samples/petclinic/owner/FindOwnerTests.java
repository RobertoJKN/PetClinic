package org.springframework.samples.petclinic.owner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOwnerTests {

	@Test
	public void testFindOwner() {
		WebDriver browser = new ChromeDriver();
		browser.get("http://localhost:8080/owners/find");

	}
}
