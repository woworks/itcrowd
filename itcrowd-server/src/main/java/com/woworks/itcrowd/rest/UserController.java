package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @RequestMapping("/authenticate")
    public User authenticate(@RequestBody User user) {
        if (user.getUsername().equals("user") && user.getPassword().equals("password")) {
            return user;
        }

        return null;
    }

/*    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () -> new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }*/
}
