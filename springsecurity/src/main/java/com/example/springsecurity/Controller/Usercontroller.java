package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.web.csrf.CsrfToken;
import com.example.springsecurity.empl.Emp;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/")
    public String getdata() {
        return "Hello World";
    }

    @GetMapping("/csrf")
    public String csrf(CsrfToken token) {
        return token.getToken();
    }

    private List<Emp> list = new ArrayList<>();

    {
        list.add(new Emp("sourav", 101, 22));
    }

    @GetMapping("/emp")
    public List<Emp> getEmployees() {
        return list;
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Emp emp) {
        list.add(emp);
    }

}
