package com.example.demo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibraryRepository {

    private List<Library> libraryList = new ArrayList<>();

    public List<Library> getAll() {
        return libraryList;
    }

    public String create(Library library) {
        for (Library l : libraryList) {

            if (l.getId() == library.getId()) {
                return "library already exists";
            }
        }
        libraryList.add(library);
        return "success";
    }

    public String update(int id, Library library) {
        for (Library l : libraryList) {
            if (l.getId() == id) {
                l.setTitle(library.getTitle());

                return "success update!!";
            }
        }
        return "failed update!!";
    }

    public String delete(int id) {
        for (Library l : libraryList) {
            if (l.getId() == id) {
                libraryList.remove(l);

                return "success delete!!";
            }
        }
        return "failed delete!!";
    }
}
