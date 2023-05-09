package anand.learn.jackson.guru;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestingMainMethod {

	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		TestingMainMethod obj = new TestingMainMethod();

		System.out.println("============================{@JsonIgnore}==============================");

		obj.testSerializingWithJsonIgnore(objectMapper);
		obj.testDeSerializingWithJsonIgnore(objectMapper);

		System.out.println("============================{@JsonIgnoreProperties}==============================");

		obj.testSerializingWithJsonIgnoreProperties(objectMapper);
		obj.testDeSerializingWithJsonIgnoreProperties(objectMapper);

		System.out.println("============================{@JsonIgnoreType}==============================");

		obj.testSerializingWithJsonIgnoreType(objectMapper);
		obj.testDeSerializingWithJsonIgnoreType(objectMapper);

		System.out.println("============================{@JsonAutoDetect}==============================");

		obj.testSerializingWithJsonAutoDetect(objectMapper);

	}

	public void testSerializingWithJsonIgnore(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new IgnoreDemoBean());
		System.out.println("Serialized Object :" + jsonString);

	}

	public void testDeSerializingWithJsonIgnore(ObjectMapper objectMapper) throws IOException {
		String jsonString = "{\"personId\": 231, \"name\": \"Mary Parker\"}";
		IgnoreDemoBean bean = objectMapper.readValue(jsonString, IgnoreDemoBean.class);
		System.out.println("De-serialized Object :" + bean);

	}

	public void testSerializingWithJsonIgnoreProperties(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new IgnorePropertiesDemoBean());
		System.out.println("Serialized Object :" + jsonString);
	}

	public void testDeSerializingWithJsonIgnoreProperties(ObjectMapper objectMapper) throws IOException {
		String jsonString = "{\"userId\": 231, \"name\": \"Mary Parker\", \"gender\": \"male\"}";
		ObjectMapper mapper = new ObjectMapper();
		IgnorePropertiesDemoBean bean = objectMapper.readValue(jsonString, IgnorePropertiesDemoBean.class);
		System.out.println("De-serialized Object :" + bean);
	}

	public void testSerializingWithJsonIgnoreType(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new IgnoreTypeDemoBean());
		System.out.println("Serialized Object :" + jsonString);
	}

	public void testDeSerializingWithJsonIgnoreType(ObjectMapper objectMapper) throws IOException {
		String jsonString = "{\"personId\": 231,\"age\": 23, \"name\": \"Mary Parker\"}";
		ObjectMapper mapper = new ObjectMapper();
		IgnoreTypeDemoBean bean = objectMapper.readValue(jsonString, IgnoreTypeDemoBean.class);
		System.out.println("De-serialized Object :" + bean);
	}

	public void testSerializingWithJsonAutoDetect(ObjectMapper objectMapper) throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new AutoDetectDemoBean());
		System.out.println(jsonString);

	}
}

