# Spring Boot WS OAuth2

Spring Boot server publishing a RESTful Web Service with OAuth2.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites


```
I suggest use an Java IDE. I'm using Eclipse with Spring plugin.
```
```
PostgreSQL or other database (need edit the config).
```
```
An client to consume and test the service. I suggest Rest Web Service Client for Chrome or RESTClient for Firefox.
```

### Installing


```
Download the project by clicking the "Clone or download" button.
```
```
Unzip the project into the directory of your choice.
```
```
Using Eclipse (or another IDE), open the project you saved in the directory of your choice.
```
```
Run the project.

```


## Deployment

You can use another project like Client [android-ws-oauth2](https://github.com/diogoaltoe/android-ws-oauth2) or any Web Service RESTful Client extension for browser (Chrome or Firefox).


# Build and Run
```
Run as > Maven clean
```
```
Run as > Maven build
```
```
Run as > Spring Boot App
```

# Usage

### Checking app is deployed sucessfullly
```
curl -i http://localhost:<port>/spring-boot-ws-oauth2/

Server Response:
{
  "_links" : {
    "user" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/user{?page,size,sort}",
      "templated" : true
    },
    "authorities" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/authorities{?page,size,sort}",
      "templated" : true
    },
    "product" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product{?page,size,sort}",
      "templated" : true
    },
    "person" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/person{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/alps"
    }
  }
}
```

### Access secure resource with token
```
curl -i http://localhost:<port>/spring-boot-ws-oauth2/product/

Server Response:
{
	"timestamp":1444985908768,
	"status":401,
	"error":"Unauthorized",
	"message":"Access Denied",
	"path":"/spring-boot-ws-oauth2/product/"
}
```

### Fetching refresh_token
```
curl -vu wsapp:secret 'http://localhost:<port>/spring-boot-ws-oauth2/oauth/token?username=user@user.com&password=12345678&grant_type=password'

Server Response:
{
	"access_token":"92457844-4d4f-4f5a-b053-7f5074d6y892",
	"token_type":"bearer",
	"refresh_token":"e6f8624f-213d-4343-a971-980e83f734be",
	"expires_in":1738,
	"scope":"read write"
}
```

### Fetching acess_token by submitting refresh_token
```
curl -vu wsapp:secret 'http://localhost:<port>/spring-boot-ws-oauth2/oauth/token?grant_type=refresh_token&refresh_token=<refresh_token>'

Server Response:
{
	"access_token":"821c99d4-2c9f-4990-b68d-18eacaff54b2",
	"token_type":"bearer",
	"refresh_token":"e6f8624f-213d-4343-a971-980e83f734be",
	"expires_in":1799,
	"scope":"read write"
}
```

### Access secure resource sucessfully
```
curl -i -H "Authorization: Bearer <access_token>" http://localhost:<port>/spring-boot-ws-oauth2/product/

Server Response:
{
  "_links" : {
    "self" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product{?page,size,sort}",
      "templated" : true
    },
    "search" : {
      "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/search"
    }
  },
  "_embedded" : {
    "product" : [ {
      "name" : "Bermuda",
      "description" : "Bermuda Adidas",
      "cost" : 50.5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/3"
        }
      }
    }, {
      "name" : "Meia",
      "description" : "Meia Rebook",
      "cost" : 15.7,
      "_links" : {
        "self" : {
          "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/4"
        }
      }
    }, {
      "name" : "Camisa",
      "description" : "Camisa Nike",
      "cost" : 10.5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/6"
        }
      }
    }, {
      "name" : "Bone",
      "description" : "Do Milan",
      "cost" : 34.98,
      "_links" : {
        "self" : {
          "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/19"
        }
      }
    }, {
      "name" : "Cueca",
      "description" : "Cueca Polo Assassin",
      "cost" : 25.9,
      "_links" : {
        "self" : {
          "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/5"
        }
      }
    }, {
      "name" : "Tenis",
      "description" : "Tenis Nike Air",
      "cost" : 32.5,
      "_links" : {
        "self" : {
          "href" : "http://localhost:<port>/spring-boot-ws-oauth2/product/2"
        }
      }
    } ]
  },
  "page" : {
    "size" : 20,
    "totalElements" : 6,
    "totalPages" : 1,
    "number" : 0
  }
}
```


## Built With

* [Maven](https://gradle.org/) - Dependency Management.
* [OAuth2](https://oauth.net/2/) - Industry-standard protocol for authorization.
* [PostgreSQL](https://www.postgresql.org/) - is a powerful, open source object-relational database system.
* [Spring Boot](https://projects.spring.io/spring-boot/) - Makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/) - It eases development of applications that need to access JPA data sources.
* [Spring HATEOAS ](https://projects.spring.io/spring-hateoas/) - Provides some APIs to ease creating REST representations that follow the HATEOAS principle when working with Spring and especially Spring MVC.
* [Spring Security](https://projects.spring.io/spring-security/) - Is a framework that focuses on providing both authentication and authorization to Java applications.


## Versioning

We use [Git](https://git-scm.com/) for versioning.

## Author

* **Diogo** - *Initial work* - [diogoaltoe](https://github.com/diogoaltoe)

## License

This project is licensed under the [MIT License](LICENSE.md).
