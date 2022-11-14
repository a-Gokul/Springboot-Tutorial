package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController  // controller and which will be interacting with web so rest
public class DepartmentController {

    @Autowired
    // We dont need to create object using new keyword since we already have spring managing the objects
    // Autowiring feature of spring framework enables you to inject the object dependency implicitly.
    // It internally uses setter or constructor injection.
    private DepartmentService departmentService;

    // Spring boot as sl4j for logging
    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);


    // The Json data that is recived needs to be converted to object, for that we use @RequestBody
    // we have given @NotBlank for department name , we use @Valid to check the value during post
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    // we pass the data type of key and @PathVariable
    // @PathVariable annotation is used to extract the value of the template variables
    // and assign their value to a method variable.
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
            throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully!!";
    }

    // Put means update so we need which id and what needs to be updated
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
