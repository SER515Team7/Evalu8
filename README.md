# Evalu8

Update your application.properties file with the following details : 

spring.datasource.url= jdbc:mysql://localhost:3306/"your schema_name"
spring.datasource.username="your User_name"
spring.datasource.password="yourpassword"
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults=false

The input JSON format for the Login:

{
    "studentId": "2",
    "dateOfBirth": "",
    "name": "",
    "grade":""
}


