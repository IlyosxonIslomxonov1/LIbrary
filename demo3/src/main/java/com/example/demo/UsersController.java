package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/get-all")
    public List<Users> getAll() {
        return usersRepository.getAll();
    }
    @PostMapping("/create")
    public String create(@RequestBody Users users) {
        return usersRepository.create(users);
    }
    @PutMapping("/users/{id}")
    public String update(@PathVariable(name = "id")int id,
                         @RequestBody Users users) {
        return users.update(id, users);
    }

    @DeleteMapping
    public String delete(@RequestParam(name = "id")int id) {
        return usersRepository.delete(id);
    }
}
