package anand.learn.jackson.guru;

import com.fasterxml.jackson.annotation.JsonIgnore;
public class IgnoreDemoBean {
    @JsonIgnore
    public long personId = 11;
    public String  name = "Anand Patel";
    @Override
    public String toString() {
        return "IgnoreDemoBean{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
