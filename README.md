# JOB APPLICATION TRACKER

This project runs with help of SPRING BOOT for managing the tasks.

## Overview
The Job Application Tracker is a RESTful web service built to help users manage and monitor their job application progress. 
It provides a centralized system to store details like company names, job titles, application dates, and current statuses (e.g., Interview, Rejected, Offered).

### technoloogy used
 - **Java 17+**: Core programming language.
 -**Spring Boot**: Framework for building the production-ready REST API.
 -**H2** : Database (based on your application.properties).
 -**Maven**: Dependency management and build tool.
 -**Docker**: For containerization and deployment.

 ## Project structure:
   ```
   JOBAPP/backend/src/main/java/com/example/jobtracker/
├── config        # Security and CORS configurations (WebConfig.java)
├── controller    # REST endpoints (JobApplicationController.java)
├── model         # Database entities (JobApplication.java)
├── repository    # JPA Data layer (JobApplicationRepository.java)
├── service       # Business logic (Optional Layer)
└── JobTrackerApplication.java  # Main entry point
```
  ## Features

-**Full CRUD Support**: Create, Read, Update, and Delete job applications.

-**Status Tracking***: Monitor the lifecycle of an application (Applied, Interview, Rejected, Offered).

-**Location Tracking**: Keep record of job locations (Remote, Chennai, Hyderabad, etc.).

-**CORS Enabled**: Configured to allow communication with frontend frameworks (React).

## Installation
-**Clone the Repository**:


Bash
-**git clone <(https://github.com/3BCAdevops54/backend/)>
cd backend


Bash

-**mvn clean install**
## Run Application Command

## You can run the application using Maven:
```
Bash
mvn spring-boot:run
```
## API EndpointsThe base URL for the API is
[View API Data (Localhost)](http://localhost:8081/jobs)


GET/jobsFetch all job applications

GET/jobs/{id}Fetch a specific application by ID

POST/jobsAdd a new job application

PUT/jobs/{id}Update an existing application

DELETE/jobs/{id}Remove an application

## developement of backend

**backend is developed by spring boot 

Bash
mvn spring-boot:run

![Backend running]<img width="1407" height="1059" alt="backend running" src="https://github.com/user-attachments/assets/7cb4b420-2ddc-4484-9824-5cf1e50db956" />


## backend running in localhost:

 - **url**:  http://localhost:8081/jobs
    
    ![backend on host]<img width="1920" height="1080" alt="backend" src="https://github.com/user-attachments/assets/b0f20683-2047-4b44-b1ff-6da8b8397127" />



## sonar backend
   This project integrates Sonar for static code analysis and code quality monitoring.
   ![sonar]<img width="1920" height="1080" alt="SONAR" src="https://github.com/user-attachments/assets/5754997c-217c-47af-9027-6885d1b14afc" />

## docker image
   
docker build -t jobapp-backend.
docker run -p 8081:8080 jobapp-backend.

![docker image]<img width="1920" height="1080" alt="docker" src="https://github.com/user-attachments/assets/1dc8d523-76b5-4706-ac79-8e7ad4d962e4" />

## backend deployement 
project backend is deployed
![Backend deployement]<img width="1920" height="1080" alt="backend deployement" src="https://github.com/user-attachments/assets/a0dbbbe8-b678-4b93-9cf2-01ec9c8fca50" />





   

