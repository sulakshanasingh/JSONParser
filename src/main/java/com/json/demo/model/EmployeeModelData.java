package com.json.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeModelData {
    private Employee employee;
    // Jackson Library property mapping annotation
    @JsonProperty("team_members")
    // GSON Library property mapping annotation
    @SerializedName("team_members")
    private List<Employee> teamMembers;

    // Getters and setters
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<Employee> teamMembers) {
        this.teamMembers = teamMembers;
    }
}
