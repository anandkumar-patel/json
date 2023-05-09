package anand.learn.jsonflex.pdf;

import java.util.Date;
import java.util.List;

public class Person {

	private String name;
	private Date birthday;
	private String nickname;
	private List<Address> addresses;
	private List<Phone> phoneNumbers;

	public Person(String name, Date birthday, String nickname, List<Address> addresses, List<Phone> phoneNumbers) {
		this.name = name;
		this.birthday = birthday;
		this.nickname = nickname;
		this.addresses = addresses;
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String toString() {
		return "Person[ " + "Name = " + name + ", Birthday = " + birthday + ", Nickname = " + nickname
				+ ", Addresses = " + addresses + ", Phone Numbers = " + phoneNumbers + " ]";
	}

}
