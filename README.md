# Evalu8

Prerequisite

Install mysql in your system and set your email ID and Password.



Step 1 - Clone the Project and Import it to Eclipse/IntelliJ
Step 2 - Update your application.properties file with the following details :

spring.datasource.url= jdbc:mysql://localhost:3306/evalu8
spring.datasource.username="User_name"
spring.datasource.password="password"
spring.jpa.show-sql=true spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults=false

Step 3 - Run the following SQL Script: 
create database evalu8; 
use evalu8; 

Create table student( student_id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255) NOT NULL, date_of_birth VARCHAR(255) NOT NULL, grade INT NOT NULL, PRIMARY KEY (student_id) ); 

insert into student(student_id, date_of_birth, name, grade) values (345, "08-14-1993", "Nachi", 04); 

insert into student(student_id, date_of_birth, name, grade) VALUES (455, "07-25-1997", "Mayank", 06);

Step 4 - Run as Spring Boot application
Step 5 - Open - localhost:8080/login.html in Google Chrome

Now you have the application running with two registered students for whom the username will be ‘345’ and ‘455’ which can be used for login and performing calculations.
The date of birth field on the login screen is not mandatory and will be used in future sprints for a more robust login functionality.



