NovelNest Web Application

Overview

NovelNest is a comprehensive platform that allows users to manage books efficiently. Built with Spring Boot, Spring MVC, Thymeleaf, and MySQL, it enables users to browse available books, add new books, and maintain their personal book collections with ease. The application supports full CRUD (Create, Read, Update, Delete) operations to ensure seamless book management.

Features


![Screenshot (110)](https://github.com/user-attachments/assets/8465a4bc-6541-4c9f-a9ce-389c27ee6605)


Home Page 


![Screenshot (112)](https://github.com/user-attachments/assets/0f48e99d-9491-4227-8329-3f9457716ca0)


Check Available Books: Browse the list of available books in the store.



![Screenshot (118)](https://github.com/user-attachments/assets/ae014c58-520a-4efc-a4c4-784a38c1b730)


My Books: Store selected books from the available list.



![Screenshot (114)](https://github.com/user-attachments/assets/764a928c-3eff-4753-9e7e-a2bc274f49af)


Register a New Book: Add new books to the database.

CRUD Operations:



![Screenshot (114)](https://github.com/user-attachments/assets/a09b0dd5-4368-40be-a77f-8565141d404c)


Create: Register new books.



![Screenshot (115)](https://github.com/user-attachments/assets/2062a295-f7a4-4747-b566-1f31c75aa6cc)


Read: View available books and personal book collection.



![Screenshot (116)](https://github.com/user-attachments/assets/056075d3-caa2-4038-b290-ebd2fed4e0ff)


Update: Edit book details.


![Screenshot (119)](https://github.com/user-attachments/assets/e782094b-a21d-48aa-bcd9-891284f0fa02)


Delete: Remove books from the collection.

Technologies Used

Spring Boot - Backend framework

Spring MVC - Web application framework

Thymeleaf - Template engine for UI

MySQL - Database management system

Installation & Setup

Prerequisites

Java 17+

MySQL Database

Maven

Steps to Run the Application

Clone the repository:

git clone https://github.com/yourusername/novelnest.git cd novelnest

Configure MySQL database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/novelnest spring.datasource.username=root spring.datasource.password=yourpassword spring.jpa.hibernate.ddl-auto=update

Build and run the application:

mvnw spring-boot:run

Access the application at:

http://localhost:8080

Contributing

Feel free to contribute by submitting pull requests or reporting issues.
