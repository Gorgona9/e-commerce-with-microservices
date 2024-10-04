# Spring Boot Microservices Project
(Eureka Server, Config Server, API Gateway, Kafka, File Storage, JWT, Authentication, Authorization, Redis, Docker)

<img src ="resources/screenshot.png" alt="architecture">


# About the project

<ul style="list-style-type:disc">
  <li>This project is based Spring Boot Microservices</li>
  <li>User can register and login through auth service by user role (ADMIN or USER) through api gateway</li>
  <li>User can send any request to relevant service through api gateway with its bearer token</li>
</ul>

8 services whose name are shown below have been devised within the scope of this project.

- Config Server
- Discovery Server
- Gateway
- Customer Service
- Order Service
- Product Service
- Payment Service
- Notification Service


### Used Dependencies

* Core
    * Spring
        * Spring Boot
        * Spring Web
            * FeignClient
        * Spring Data
            * Spring Data JPA
            * PostgreSQL
        * Spring Cloud
            * Spring Cloud Config Server
            * Spring Cloud Config Client
    * Netflix
        * Eureka Server
        * Eureka Client
* Database
    * PostgreSQL
    * MongoDB
* Kafka
* Keycloak
* Zipkin
* Docker
* Validation
* Lombok

### 🔨 Run the App

<b>Local</b>

<b>1 )</b> Clone project `git clone https://github.com/Gorgona9/e-commerce-with-microservices.git`

<b>2 )</b> Go to the project's home directory :  `cd e-commerce-with-microservices`

<b>3 )</b> Run docker compose <b>`docker compose up`</b></b>

<b>4 )</b> Run <b>Config Server</b>

<b>5 )</b> Run <b>Discovery</b>

<b>6 )</b> Run other services
