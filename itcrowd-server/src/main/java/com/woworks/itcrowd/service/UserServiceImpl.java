package com.woworks.itcrowd.service;

import com.woworks.itcrowd.domain.User;
import com.woworks.itcrowd.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UsersRepository usersRepository;

    UserServiceImpl(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public User registerUser(User user) {
        return this.usersRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return this.usersRepository.findByUsername(username);
    }
}
