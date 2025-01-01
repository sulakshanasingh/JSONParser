package com.json.demo;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.json.demo.model.Employee;
import com.json.demo.model.EmployeeModelData;
import java.io.IOException;

import static com.json.demo.model.Constants.json;

public class JacksonJsonMain {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //Jackson Support for LocalDate
        mapper.registerModule(new JavaTimeModule());
        //Configuration to ignore extra fields
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Deserialize the JSON
        EmployeeModelData employeeModelData = mapper.readValue(json, EmployeeModelData.class);
        Employee employee=employeeModelData.getEmployee();

        // display Json fields
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department Name: " + employee.getDepartment().getName());
        System.out.println("Skills: " + employee.getSkills());
        System.out.println("Team Members Count: " + employeeModelData.getTeamMembers().size());
    }
}
