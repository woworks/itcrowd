package com.woworks.itcrowd.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.woworks.itcrowd.domain.User;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@ComponentScan("ru.otus.hw19springsecurity.repository")
class UsersDaoImplTest {

    /*private static final String USERNAME = "JohnDoe";

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UsersRepository usersDao;

    @Test
    void getUserByUsername() {
        User user1 = new User();
        user1.setUsername(USERNAME);

        this.entityManager.persist(user1);
        this.entityManager.flush();

        User user2 = this.usersDao.getUserByUsername(USERNAME).get();

        assertEquals(user1, user2);
    }

    @Test
    void insert() {

        User user1 = new User();
        user1.setUsername(USERNAME);

        this.usersDao.save(user1);

        User user2 = this.usersDao.getUserByUsername(USERNAME).get();

        assertEquals(user1, user2);
    }*/
}