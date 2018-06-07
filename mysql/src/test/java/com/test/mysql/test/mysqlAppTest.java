package com.test.mysql.test;

import com.test.mysql.entity.User;
import com.test.mysql.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application.yml"})
@SpringBootTest
public class mysqlAppTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void test(){
        List<User> users = userRepository.findAll();
    }
}
