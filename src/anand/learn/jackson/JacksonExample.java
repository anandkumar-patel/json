package anand.learn.jackson;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonExample {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		Staff staff = createStaff();

		try {

			// to enable pretty print
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			// normal
			String normalView = mapper.writerWithView(CompanyViews.Normal.class).writeValueAsString(staff);

			System.out.format("Normal views\n%s\n", normalView);

			// manager
			String managerView = mapper.writerWithView(CompanyViews.Manager.class).writeValueAsString(staff);

			System.out.format("Manager views\n%s\n", managerView);

			// hr
			String hrView = mapper.writerWithView(CompanyViews.HR.class).writeValueAsString(staff);

			System.out.format("HR views\n%s\n", hrView);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Staff createStaff() {

		Staff staff = new Staff();

		staff.setName("Uday Raj");
		staff.setAge(22);
		staff.setPosition(new String[] { "Founder", "CTO", "Writer" });
		Map<String, BigDecimal> salary = new HashMap<>();
		salary.put("2010", new BigDecimal(10000));
		salary.put("2012", new BigDecimal(12000));
		salary.put("2018", new BigDecimal(14000));

		staff.setSalary(salary);
		staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

		return staff;

	}
}

