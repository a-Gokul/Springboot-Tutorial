package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity // specifies that the class is an entity and is mapped to a database table.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id // mentioning the primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // this will generate id automatically
    private Long departmentId;



    @NotBlank(message = "Please Add Department Name") // Adding validation for department name
    /*@Length(max = 5,min =1)
    @Size(max = 10, min = 0)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
