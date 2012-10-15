------------
Description-
------------
This project represents a simple spring MVC application secured by spring security.

-----------------------
Application parameters:
-----------------------

1.Database Configuration:
------------------------- 
 + Create a new Mysql database.
 +  Execute the sql script: src/main/resources/db.sql 
 + Open the file /src/main/webapp/WEB-INF/app.properties and fill in your database parameters :
	app.jdbc.driverClassName=com.mysql.jdbc.Driver
	app.jdbc.url=jdbc\:mysql\://acer.home.com/-->YOUR_BD_NAME<--
	app.jdbc.username=-->YOUR_DB_USER_NAME<--
	app.jdbc.password=-->YOUR_DB_USER_PASSWORD<--

2. Server parameters:
---------------------
Open the pom.xml and look for the properties: 
+ "application.contextpath" to setup the application context path (ex. /mvcapp) 
+ "application.port" to setup the server access port (ex. 8080) 

3. Login Accounts:
------------------
 + User: admin@mail.com / password: admin
 + User: john@mail.com  / password: john

Note: passwords are encrypted with MD5 algorithm  