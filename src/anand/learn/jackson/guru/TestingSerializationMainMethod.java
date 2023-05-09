package anand.learn.jackson.guru;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestingSerializationMainMethod {

	public static void main(String[] args) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		TestingSerializationMainMethod obj = new TestingSerializationMainMethod();

		System.out.println("============================{@JsonValue}==============================");
		obj.testSerializingWithJsonValue(objectMapper);

		System.out.println("============================{@JsonInclude}==============================");
		obj.testSerializingWithJsonInclude(objectMapper);

		System.out.println("============================{@JsonGetter}==============================");
		obj.testSerializingWithJsonGetter(objectMapper);
	}

	public void testSerializingWithJsonValue(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new ValueDemoBean());
		System.out.println(jsonString);
	}

	public void testSerializingWithJsonInclude(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new IncludeDemoBean());
		System.out.println(jsonString);
	}

	public void testSerializingWithJsonGetter(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new GetterDemoBean());
		System.out.println(jsonString);
	}

}

