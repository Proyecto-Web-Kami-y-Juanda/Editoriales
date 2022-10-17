package co.edu.javeriana.libreria.controller;

import co.edu.javeriana.libreria.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialRepository extends JpaRepository<Editorial, Integer>
{
}
