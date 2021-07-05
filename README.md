# Description
This cookiecutter template is to generate a spring boot server which has basic user sign up and log in. After user logged in, a JWT will be issued, 
users can provide the token in the request header to visit some secured endpoints.

# Example
Please take a look [this repo](https://github.com/mchen81/springboot-auth-jwt) to see som build in endpoints. 

# You May Need
1. To generate project from this template, you need [CookieCutter](https://cookiecutter.readthedocs.io/en/1.7.2/)
2. You may need the [Docker](https://www.docker.com) to run the [run-mysql.sh](/%7B%7Bcookiecutter.project_name%7D%7D/run-mysql.sh) (Not necessary if you have a database installed).
3. Config the [main/resources/application.yml](/%7B%7Bcookiecutter.project_name%7D%7D/src/main/resources/application.yml), provide a correct database connection is important.
4. Define Roles: the [main/resources/import.sql](/%7B%7Bcookiecutter.project_name%7D%7D/src/main/resources/import.sql) provides two roles for you, you can change it to whatever you want.

# Cookiecutter
- project_name: 



