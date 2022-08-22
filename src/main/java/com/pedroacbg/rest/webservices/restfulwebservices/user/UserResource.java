package com.pedroacbg.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
    public List<User> retriveAllUsers(){
        return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User findOne(@PathVariable Long id){
        return service.findOne(id);
    }

}
