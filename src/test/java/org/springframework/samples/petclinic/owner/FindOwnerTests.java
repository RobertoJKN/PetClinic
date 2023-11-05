package org.springframework.samples.petclinic.owner;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FindOwnerTests {

	protected static WebDriver driver = new ChromeDriver();

	private FindOwnersPage page = new FindOwnersPage(driver);

	@AfterAll

	static void close() {
		driver.close();
	}

	@Test
	public void findOwnersBasedOnTheirLastNames() {

		AddOwnerInfo owner1 = new AddOwnerInfo(

				"John", "Doe", "some address", "some city", "11111");

		AddOwnerInfo owner2 = new AddOwnerInfo(

				"Jane", "Doe", "some address", "some city", "11111");

		AddOwnerInfo owner3 = new AddOwnerInfo(

				"Sally", "Smith", "some address", "some city", "11111");

		addOwners(owner1, owner2, owner3);

		page.visit();

		ListOfOwnersPage listPage = page.findOwners("Doe");

		List<OwnerInfo> all = listPage.all();

		Assertions.assertThat(all).hasSize(2).

			containsExactlyInAnyOrder(

					owner1.toOwnerInfo(), owner2.toOwnerInfo());

	}

	private void addOwners(AddOwnerInfo... owners) {

		AddOwnerPage addOwnerPage = new AddOwnerPage(driver);

		for (AddOwnerInfo owner : owners) {

			addOwnerPage.visit();

			addOwnerPage.add(owner);

		}
	}
}
