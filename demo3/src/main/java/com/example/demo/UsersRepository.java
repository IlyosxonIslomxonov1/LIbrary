package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {
    private List<Users> usersList = new ArrayList<>();

    public List<Users> getAll() {
        return usersList;
    }

    public String create(Users users) {
        for (Users u : usersList) {

            if (u.getId() == users.getId()) {
                return "user already exists";
            }
        }
        usersList.add(users);
        return "success";
    }

    public String delete(int id) {
        for (Users u : usersList) {
            if (u.getId() == id) {
                usersList.remove(u);

                return "success delete!!";
            }
        }
        return "failed delete!!";
    }
}
