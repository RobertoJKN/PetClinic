package org.springframework.samples.petclinic.owner;

public class OwnerInfo {

	private String name;

	private String address;

	private String city;

	private String telephone;

	private String pets;

	public OwnerInfo(String name, String address, String city, String telephone, String pets) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getPets() {
		return pets;
	}

}
