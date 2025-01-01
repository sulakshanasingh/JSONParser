package com.json.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

@JsonInclude
public class Employee {
    private int id;
    private String name;
    private Role role;
    @JsonProperty("start_date")
    private LocalDate startDate;
    private Department department;
    private Address address;
    private List<String> skills;
    @JsonProperty("is_active")
    private boolean isActive;
    private Object metadata;

    public Employee(int id, String name, Role role, LocalDate startDate, Department department, Address address, List<String> skills, boolean isActive, Object metadata) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.startDate = startDate;
        this.department = department;
        this.address = address;
        this.skills = skills;
        this.isActive = isActive;
        this.metadata = metadata;
    }

    public Employee() {
        //this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

}
