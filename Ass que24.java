CREATE TABLE Student (
    Student_ID INT PRIMARY KEY,
    Roll_No INT,
    Name VARCHAR(50) UNIQUE,
    Age INT,
    Date_of_Birth DATE,
    Email_ID VARCHAR(100) UNIQUE,
    Phone_Number VARCHAR(15) NOT NULL,
    Address VARCHAR(100)
);

INSERT INTO Student
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email_ID, Phone_Number, Address)
VALUES
(1, 101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore'),
(2, 102, 'Kiran', 19, '2007-08-20', 'kiran@gmail.com', '9876543211', 'Mysore'),
(3, 103, 'Bhargavi', 20, '2006-11-10', 'bhargavi@gmail.com', '9876543212', 'Tumkur');

SELECT * FROM Student;
