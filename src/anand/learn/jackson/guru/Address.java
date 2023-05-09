package anand.learn.jackson.guru;


import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class Address {
	public String doorNumber = null;
	public String streetName = null;
	public String pinCode = null;
	public String city = null;

	@Override
	public String toString() {
		return "Address{" + "doorNumber='" + doorNumber + '\'' + ", streetName='" + streetName + '\'' + ", pinCode='"
				+ pinCode + '\'' + ", city='" + city + '\'' + '}';
	}
}
