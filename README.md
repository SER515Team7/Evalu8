# Evalu8

Update your application.properties file with the following details : 

spring.datasource.url= jdbc:mysql://localhost:3306/student
spring.datasource.username="your User_name"
spring.datasource.password="yourpassword"
spring.jpa.show-sql=true

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

The input JSON format for the Login:

{
    "studentId": "2",
    "dateOfBirth": "",
    "name": "",
    "grade":""
}


