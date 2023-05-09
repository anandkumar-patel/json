package anand.learn.jsonflex.tests;

import java.util.Date;

import anand.learn.jsonflex.common.Student;
import flexjson.JSONSerializer;

public class BasicTest {
	
	public static void main(String[] args) {

		JSONSerializer serializer = new JSONSerializer();
		Student stud = new Student("Anand", "Patel", 32, "Singing", new Date());

		String jsonStr = serializer.serialize(stud);
		System.out.println(jsonStr);
	}
}
