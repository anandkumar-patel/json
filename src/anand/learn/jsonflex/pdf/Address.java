package anand.learn.jsonflex.pdf;

public class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private ZipCode zipCode;

	public Address(String name, String street, String city, String state, ZipCode zipCode) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ZipCode getZipCode() {
		return zipCode;
	}

	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}

	public String toString() {
		return "Name :" + name + ", Street :" + street + ",city :" + city + ", state :" + state;
	}
}
