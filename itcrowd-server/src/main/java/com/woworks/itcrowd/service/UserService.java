package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.User;

public interface UserService {

    User registerUser(User user);

    User findByUsername(String username);
}
