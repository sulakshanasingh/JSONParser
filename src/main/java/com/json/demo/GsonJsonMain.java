package com.json.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.json.demo.model.EmployeeModelData;
import com.json.demo.model.LocalDateAdapter;

import java.time.LocalDate;

import static com.json.demo.model.Constants.json;

public class GsonJsonMain {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter()) // Register LocalDate adapter
                .serializeNulls() // Handle null values
                .setPrettyPrinting() // Pretty print JSON
                .create();

        // Deserialize the JSON
        EmployeeModelData data = gson.fromJson(json, EmployeeModelData.class);

        // Print Employee information
        System.out.println("GSON Library parsing output");
        System.out.println("Employee Name: " + data.getEmployee().getName());
        System.out.println("Department Name: " + data.getEmployee().getDepartment().getName());
        System.out.println("Skills: " + data.getEmployee().getSkills());
        System.out.println("Team Members Count: " + data.getTeamMembers().size());
    }
}
