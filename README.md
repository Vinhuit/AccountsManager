## What is Accounts Manager?

Accounts manager is a simple web application that do basic operations (create,read,update and delete) on 2 entities: Account and Role.

<img src="https://raw.github.com/maachou/AccountsManager/master/src/main/webapp/resources/app-screenshots/Accounts-List.png" border="0" />

## Demo: 

The application is deployed to Heroku at :

-  http://accountsmanager.herokuapp.com/login

## Technologies used:

- Spring MVC with Rest like url for controllers.
- Spring Security for user/password authentication.
- Spring Data JPA for persistency.
- Twitter BootStrap for the UI.
- Jquery for Ajax for REST calls.
- JQuery DataDatable plugin.
- Apache Tiles for web page templating.


## Run the application:

```text
mvn jetty:run
```