This is a REST API (Car service) that manages all details related to a car inventory. 

Technologies used 
Spring Boot
Spring
Maven
Java
Hibernate
HikariCP
H2 in-memory database
Junit

Existing operation 
   
Find car details of based on a car id
GET : /api/v1/cars{id}    

Find details of all available cars
GET : /api/v1/cars

Add details for a new car
POST : /api/v1/cars

Future enhancements
Add Oauth/jwt token based authentication
Add roles for this rest end point

