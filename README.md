# spring-aop
This is a simple spring boot application that implements Spring AOP

### What is Spring AOP
* Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity.
* AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity by cross-cutting concerns.

Spring AOP can be used in three different manners. 
1. By Spring1.2 Old style (dtd based) (also supported in Spring3)
2. By AspectJ annotation-style
3. By Spring XML configuration-style(schema-based)

But the most widely used approach is Spring AspectJ Annotation Style. This example implements using **AspectJ annotation-style**.

## Dependency to support Spring AOP
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

## Steps to create Spring AOP Application
1. Create Spring Boot Project
2. Add Spring AOP maven dependency
3. Write aspect class annotated with @Aspect annotaction
4. Write methods on which you want to execute advices
5. Run the application and watch the console

## Prerequisites
To run this project, you need to install;
* Java 8
* IDE like InteliJ idea


## Test cURL

```
curl --location 'http://localhost:8080/api/v1/users'
```

## References
https://medium.com/@toimrank/spring-boot-aop-with-example-a2757e389d0b <br>
https://www.edureka.co/blog/spring-aop-tutorial/

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
