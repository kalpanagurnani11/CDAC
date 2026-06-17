package com.example.controller;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeClientController {

    @Autowired
    private RestTemplate restTemplate;

    private final String apiUrl = "http://localhost:8080/api/employees";

    @GetMapping("/")
    public String viewEmployees(Model model) {
        try {
            Employee[] response = restTemplate.getForObject(apiUrl, Employee[].class);
            List<Employee> employees = response != null ? Arrays.asList(response) : List.of();
            model.addAttribute("employees", employees);
        } catch (Exception e) {
            model.addAttribute("employees", List.of());
            model.addAttribute("error", "Could not connect to API: " + e.getMessage());
        }
        return "employees";
    }
}
