package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // repository is a DAOs (Data Access Object) that access the database directly
// we are extending jpa repository it has all the functions to interact with database.
// we are passing our Entity and primary key type.
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Follow the naming convension to fetch data by column name
    public Department findByDepartmentName(String departmentName);


    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
