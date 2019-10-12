create database student;
use student;

Create table student(
studentId INT NOT NULL AUTO_INCREMENT,
name VARCHAR(12) NOT NULL,
dateOfBirth VARCHAR(12) NOT NULL,
PRIMARY KEY (studentId)
);

insert into student(name, dateOfBirth) values ("Ashutosh", "01-21-1993");
insert into student(name, dateOfBirth) values ("Prakhar", "08-31-1997");

Select * from student;