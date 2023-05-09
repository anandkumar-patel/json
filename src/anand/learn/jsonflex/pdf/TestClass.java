package anand.learn.jsonflex.pdf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import flexjson.JSONSerializer;

public class TestClass {

	public static void main(String[] args) {
		List<Address> addresses = new ArrayList<Address>();
		List<Phone> phoneNumbers = new ArrayList<Phone>();

		Date birthday = new Date(1996, 06, 25);

		ZipCode zipCode1 = new ZipCode("560076");
		ZipCode zipCode2 = new ZipCode("560078");

		Phone phone1 = new Phone("Home", "9916543690");
		Phone phone2 = new Phone("Office", "8795086981");

		Address address1 = new Address("331/9E", "Hulimavu Main Road", "Bangalore", "Karnataka", zipCode1);
		Address address2 = new Address("practo building", "JP Nagar 3rd phase", "Bangalore", "Karnataka", zipCode2);

		addresses.add(address1);
		addresses.add(address2);

		phoneNumbers.add(phone1);
		phoneNumbers.add(phone2);

		Person person = new Person("Anand", birthday, "Bhulan", addresses, phoneNumbers);

		JSONSerializer serializer = new JSONSerializer();
		String jsonStr = serializer.include("phoneNumbers", "addresses").serialize(person);
	}
}
