# SpringCloudEureka
A sample code that consists of a Eureka service application and two microservices that interact with each other with the help of the Eureka service registry and discovery.

This sample code :
* Consists of EurekaServer Application
* Order Service (demo app)
* Product Service (demo app)

To run this :
* Checkout the code
* Run the EurekaServer Application 
* Go to http://localhost:8761/ - It will show the Eureka dashboard. Can see all details and the application section will be empty now
* Run the Order service 
* Run the Product service
* Go to http://localhost:8761/ - It will show the Eureka dashboard. Now you can see the application section which will show Order-Service and Product-Service
* Go to the browser and verify the endpoints using - http://localhost:7002/orders

**Note - In this sample code I have removed the address from Feign client interface. Now the product service is discovered by the Eureka service registry and discovery.
  If you see the application startup logs, you will see traces of Ribbon (A load balancer, default part of NetFlix Eureka) too.
**
