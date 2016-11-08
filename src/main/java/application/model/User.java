package application.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by nicasandra on 11/8/2016.
 */

public class User {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
