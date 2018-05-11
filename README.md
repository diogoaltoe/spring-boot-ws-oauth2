# Spring Boot WS OAuth2

Spring Boot server publishing a RESTful Web Service with OAuth2.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites


```
Android Studio or other.
```
```
RESTful Web Service (coming soon).
```

### Installing


```
Download the project by clicking the "Clone or download" button.
```
```
Unzip the project into the directory of your choice.
```
```
Using Eclipse (or another publisher), open the project you saved in the directory of your choice.
```
```
Click the Run (Shift + F10) button to run the project.

```
OR 

# Desenvolver com Git em Eclipse

http://clubedosgeeks.com.br/programacao/desenvolver-com-git-em-eclipse



## Deployment

Another project (coming soon) will be the server that will publish the services that are consumed in this project.


# Build and Run
```java
mvn clean install -DskipTests spring-boot:run
```
# Usage
### Checking app is deployed sucessfullly
```sh
curl -i http://localhost:9191/api/hello
Hello User!
```
### Access secure resource with token
```sh
curl -i http://localhost:9191/api/secure

{"timestamp":1444985908768,"status":401,"error":"Unauthorized","message":"Access Denied","path":"/api/secure"}
```

### Fetching refresh_token
```sh
curl -vu rajithapp:secret 'http://localhost:9191/api/oauth/token?username=admin&password=admin&grant_type=password'

{"access_token":"91202244-431f-444a-b053-7f50716f2012","token_type":"bearer","refresh_token":"e6f8624f-213d-4343-a971-980e83f734be","expires_in":1738,"scope":"read write"}
```

### Fetching acess_token by submitting refresh_token
```sh
curl -vu rajithapp:secret 'http://localhost:9191/api/oauth/token?grant_type=refresh_token&refresh_token=<refresh_token>'

{"access_token":"821c99d4-2c9f-4990-b68d-18eacaff54b2","token_type":"bearer","refresh_token":"e6f8624f-213d-4343-a971-980e83f734be","expires_in":1799,"scope":"read write"}
```

### Access secure resource sucessfully
```sh
curl -i -H "Authorization: Bearer <access_token>" http://localhost:9191/api/secure

Secure Hello!
```



## Built With

* [Maven](https://gradle.org/) - Dependency Management

## Versioning

We use [Git](https://git-scm.com/) for versioning.

## Author

* **Diogo** - *Initial work* - [diogoaltoe](https://github.com/diogoaltoe)

## License

This project is licensed under the MIT License.
