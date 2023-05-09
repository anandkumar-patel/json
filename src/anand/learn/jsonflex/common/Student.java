package anand.learn.jsonflex.common;


import java.util.Date;

public class Student {
  private String firstName;
  private String lastName;
  private int age;
  private String hobby;
  private Date dob;
  
  public Student(String firstName, String lastName, int age, String hobby,
      Date dob) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.hobby = hobby;
    this.dob = dob;
  }
  
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }
  public Date getDob() {
    return dob;
  }
  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String toString() {
    return "Student[ " +
      "firstName = " + firstName +
      ", lastName = " + lastName +
      ", age = " + age +
      ", hobby = " + hobby +
      ", dob = " + dob +
      " ]";
  }
}
