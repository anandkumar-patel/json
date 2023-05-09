package anand.learn.jackson.guru;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"userId", "gender"})
public class IgnorePropertiesDemoBean {
    public long  userId = 11;
    public String  name = "Anand Patel";
    public String  gender  = null;
    @Override
    public String toString() {
        return "IgnorePropertiesDemoBean{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
