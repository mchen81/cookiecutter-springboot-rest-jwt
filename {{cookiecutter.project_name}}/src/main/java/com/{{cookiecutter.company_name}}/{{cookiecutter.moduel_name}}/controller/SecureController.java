package com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}}.controller;

import com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}}.security.authtication.UserPrinciple;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("secured")
public class SecureController {
    @GetMapping
    public ResponseEntity<UserPrinciple> showWhoIam() {

        // After JwtAuthenticationFilter, authenticated user can see this page.
        UserPrinciple user =
                (UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return ResponseEntity.ok(user);
    }
}
