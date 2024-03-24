package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.ApplicationDto;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.service.IUserService;
import com.patika.kredinbizdeservice.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;


    // create user
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        System.out.println("userService: " + userService.hashCode());
        return userService.save(user);
    }

    /*
    get all users
     */
    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
    
    @GetMapping("/apps/{email}")
    public List<ApplicationDto> getAppByEmail(@PathVariable String email) {
        return userService.getAppByEmail(email);
    }

    @GetMapping("/{email}")
    public User getByEmail(@PathVariable String email) {
        return userService.getByEmail(email);
    }

    @PutMapping("/{email}")
    public ResponseEntity<User> update(@PathVariable String email, @RequestBody User user) {

        User user1 = userService.update(email, user);

        if (user1 != null){
            return ResponseEntity.ok().body(user1);
        }

        return ResponseEntity.notFound().build();
    }


   /* @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }*/
}
