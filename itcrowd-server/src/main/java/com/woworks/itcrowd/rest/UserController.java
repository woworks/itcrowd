package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.User;
import com.woworks.itcrowd.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    Logger LOG = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{username}")
    public User user(@PathVariable String username) {
        return this.userService.findByUsername(username);
    }

    @PostMapping("/authenticate")
    public User authenticate(@RequestBody User user) {
        LOG.info("authenticate():: user = {}", user);
        if (user.getUsername().equals("user") && user.getPassword().equals("password")) {
            return user;
        }

        return null;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return this.userService.registerUser(user);
    }
}
