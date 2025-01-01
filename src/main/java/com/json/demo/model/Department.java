package com.json.demo.model;

public class Department {
    private int id;

    public Department() {
    }

    public Department(int id, String name, Employee head) {
        this.id = id;
        this.name = name;
        this.head = head;
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

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    private String name;
    private Employee head;
}
