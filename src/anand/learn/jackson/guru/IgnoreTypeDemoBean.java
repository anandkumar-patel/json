package anand.learn.jackson.guru;

public class IgnoreTypeDemoBean {
    public long personId = 11;
    public int age =32;
    public String  name = "Anand Patel";
    public Address address = new Address();
    @Override
    public String toString() {
        return "IgnoreTypeDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
