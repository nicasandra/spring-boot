package application.controller;

import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    User user = new User("Nick", 12);

    @GetMapping("/")
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("/getUser")
    public User getUser(){
        return user;
    }
}
