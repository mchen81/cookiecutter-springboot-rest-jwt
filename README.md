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

# Java Version

This project is using Java 11

# Cookiecutter

You may want to provide your own setting, but make sure you type correct words because it doesn't check everything for you.

- project_name: This will be you head folder's name
- company_name: This will be in the com.**company_name**.moduel (lower case recommand)
- moduel_name: This will be in the com.comany.company.**moduel_name** (lower case recommand)
- application_name: This is the name of spinrg's main class (lower case without space ,underscore and dash recommand)
- mysql_container_name: The container's name where having the mysql
- mysql_port: The port to connect in mysql
- mysql_db_name: The database you will use in this project
- mysql_user_name: Mysql user name (not root)
- mysql_user_password: The password of the user you just typed in (not root)

# MySQL

The container uses mysql8. If you want to change it, edit the run-mysql.sh and application.yml.
