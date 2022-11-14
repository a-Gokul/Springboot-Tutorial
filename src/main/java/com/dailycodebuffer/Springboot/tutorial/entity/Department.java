package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity // specifies that the class is an entity and is mapped to a database table.
// @Data is = @setters @getters @equals hascode @tostringx
@Data // to use lombok we use this annotation
@NoArgsConstructor // for default constructor
@AllArgsConstructor // constructor with all args
@Builder  // @Builder annotation produces complex builder APIs for your classes. @Builder lets you automatically produce the code required to have your class be instantiable with code
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


    // *** Note we had setter getter and constructor before and we are removing those boiler plate code using lombok

}
