package co.edu.javeriana.libreria.service;

import co.edu.javeriana.libreria.controller.EditorialRepository;
import co.edu.javeriana.libreria.entity.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EditorialService
{
    @Autowired
    private EditorialRepository repo;

    public List<Editorial> listAll()
    {
        return this.repo.findAll();
    }

    public void save(Editorial product) {
        repo.save(product);
    }

    public Editorial get(Integer id) {
        return repo.findById(id).get();
    }

    public String namebyId(Integer id){ return repo.findNameById(id);}

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public void saveOrUpdate(Editorial books)
    {
       repo.save(books);
    }


}
