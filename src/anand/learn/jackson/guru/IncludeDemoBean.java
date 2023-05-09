package anand.learn.jackson.guru;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncludeDemoBean {
    public long personId = 123L;
    public String  name = null;
    
    @Override
	public String toString() {
		return "IncludeDemoBean{" + "personId=" + personId + ", name='" + name + '\'' + '}';
	}
}
