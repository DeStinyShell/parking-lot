## **_Parking Lot_**

Simple web app based on the RDBMS MySQL, using JDBC, Servlets and JSP's. The project follows SOLID principles, N-tier architecture (DB, DAO layer, Service layer, Controller layer) and authentication implemented using filter. Dependency inversion principle realized through custom injector class.

---

## _**Functionality:**_

Registered user(driver) can view information about cars, manufacturers and drivers, so as creating and deleting them.

---

## **_Used Technologies:_**

 - Backend: Java, JDBC, Servlets  
 - Logger: Log4j
 - Frontend: HTML, CSS, JSP, JSTL
 - Database: MySql, MySQLWorkbench
 - Web-server: Tomcat
 - Packaging: Apache Maven

---

## **_How to start:_**

Follow these steps to start an app:  
 - clone the project to your local repository
 - create MySQL database by import from init_db.sql file
 - setup ConnectionUtil class by replacing mock values of constants with your own.
 - configure Tomcat Server
 - run a project