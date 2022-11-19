package co.edu.javeriana.libreria.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import co.edu.javeriana.libreria.entity.Editorial;
import co.edu.javeriana.libreria.service.EditorialService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EditorialController
{
    @Autowired
    private final EditorialService editorialService;
    public EditorialController(EditorialService bookService)
    {
        this.editorialService = bookService;
    }

    @GetMapping("/")
    public List<Editorial> list()
    {
        return editorialService.listAll();
    }

    @GetMapping("/editorialName")
    public String findById(@RequestParam("id")Integer id)
    {
        System.out.println("holis");
        return editorialService.namebyId(id);
    }

    @DeleteMapping("/editorial/{editorialId}")
    private void deleteBook(@PathVariable("editorialId") int ediId)
    {
        editorialService.delete(ediId);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/editorial")
    private void saveBook(@RequestBody Editorial editorial)
    {
        editorialService.saveOrUpdate(editorial);
    }
    //creating put mapping that updates the book detail
    @PutMapping("/editorial/{editorialId}")
    private Editorial update(@RequestBody Editorial editorial, @PathVariable("editorialId") int editorialId)
    {
        editorialService.saveOrUpdate(editorial);
        return editorial;
    }


}
