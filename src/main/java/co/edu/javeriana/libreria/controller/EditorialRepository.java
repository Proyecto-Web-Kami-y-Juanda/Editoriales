package co.edu.javeriana.libreria.controller;

import co.edu.javeriana.libreria.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface EditorialRepository extends JpaRepository<Editorial, Integer>
{
    @Query("SELECT r.name FROM Editorial r where r.id = :id")
    String findNameById(@Param("id")Integer id);

}
