package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {


    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAll(){
        return libraryRepository.getAll();
    }

    public String create(Library library){
        return libraryRepository.create(library);
    }

    public String update(int id,Library library){
        return libraryRepository.update(id, library);
    }
    public String delete(int id){
        return libraryRepository.delete(id);
    }
}