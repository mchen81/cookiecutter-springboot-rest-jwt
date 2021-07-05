package com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.application_name}} {
    public static void main(String[] args) {
        SpringApplication.run({{cookiecutter.application_name}}.class, args);
    }
}
