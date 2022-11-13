# Springboot-Tutorial


### Notes 

- DevTools Setup in Intelij

### H2 Database
H2 database is an open source, embedded and in memory relational database management system. It is written in Java and provides a client/server application. It stores data in system memory instead of disk. Once program is closed, data is also lost.

### @Bean
It is a method-level annotation. It is an alternative of XML <bean> tag. It tells the method to produce a bean to be managed by Spring Container.

### @ComponentScan
It is used when we want to scan a package for beans. It is used with the annotation @Configuration. We can also specify the base packages to scan for Spring Components.


### @SpringBootApplication Annotation
Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". A single @SpringBootApplication annotation can be used to enable those three features, that is:

- @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
- @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
- @Configuration: allow to register extra beans in the context or import additional configuration classes
- The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes,

### @Controller

A controller class is normally a class part of the Model View Controller (MVC) pattern. A controller basically controls the flow of the data.

- It controls the data flow into model object and updates the view whenever data changes.
- The @Controller annotation indicates that a particular class serves the role of a controller.


### @RequestMapping

- the annotation is used to map web requests to Spring Controller methods.
- We typically use @Controller in combination with a @RequestMapping annotation for request handling methods.
- We can use it with class definition to create the base URI. For example:

#### @RequestMapping with Class
```
@Controller
@RequestMapping("/home")
public class HomeController {

}
```
Now /home is the URL for which this controller will be used. 

#### @RequestMapping with Method

- We can use it with method to provide the URI pattern for which handler method will be used. For example:

```
@RequestMapping(value="/method0")
@ResponseBody
public String method0(){
return "method0";
}
```



