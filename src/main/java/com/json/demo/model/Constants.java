package com.json.demo.model;

public class Constants {
    public static final String json = """
            {
              "employee": {
                "id": 101,
                "name": "Alice Johnson",
                "role": "MANAGER",
                "start_date": "2023-01-15",
                "department": {
                  "id": 501,
                  "name": "Engineering",
                  "head": {
                    "id": 101,
                    "name": "Alice Johnson",
                    "role": "MANAGER"
                  }
                },
                "address": {
                  "street": "123 Main Street",
                  "city": "San Francisco",
                  "state": "CA",
                  "zipcode": "94101"
                },
                "skills": ["Java", "Spring Boot", "Leadership"],
                "is_active": true,
                "metadata": null,
                "extra_field": "Unexpected Data"
              },
              "team_members": [
                {
                  "id": 102,
                  "name": "Bob Smith",
                  "role": "DEVELOPER",
                  "start_date": null,
                  "department": {
                    "id": 501,
                    "name": "Engineering",
                    "head": null
                  }
                },
                {
                  "id": 103,
                  "name": "Carol White",
                  "role": "INTERN",
                  "start_date": "2024-06-01",
                  "department": {
                    "id": 502,
                    "name": "Human Resources",
                    "head": {
                      "id": 201,
                      "name": "David Green",
                      "role": "DIRECTOR"
                    }
                  }
                }
              ]
            }
            """;
}
