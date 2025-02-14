package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/library")
public class LibraryController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/get-all")
    public List<Users> getAll() {
        return usersService.getAll();
    }
    @PostMapping("/create")
    public String create(@RequestBody Users users) {
        return usersService.create(users);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable(name = "id")int id,
                         @RequestBody Users users) {
        return users.update(id, users);
    }

    @DeleteMapping
    public String delete(@RequestParam(name = "id")int id) {
        return usersService.delete(id);
    }
}


