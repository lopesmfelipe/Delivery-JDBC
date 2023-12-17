# Delivery-JDBC-System

This is a personal project, made in order to learn more about database connection in java. It's a Delivery program, using JDBC and PostgreSQL database.


The project is divided into 3 packages:

- App package - Program Class: main class that makes a query to the database using "INNER JOIN", then scrolls through the result of that query that is in "table" format and transforms the rows of that table into Objects.

- DB package - DB class: contains the database connection class. (It's a local db)

- entities package: package that contains the classes:
  - Order
  - OrderStatus
  - Product
  
 Where the 'Order' and 'Product' classes will be instantiated according to the rows returned by the database.


## By doing this project I was able to learn more about different topics and concepts, such as :

- Primary key, foreign key
- DDL (create table, alter table)
- SQL
  - INSERT
  - SELECT
  - INNER JOIN
- enumerated types
- Composition of objects
- Collections (list, map)
- Access data in relational DB and instantiate corresponding objects
