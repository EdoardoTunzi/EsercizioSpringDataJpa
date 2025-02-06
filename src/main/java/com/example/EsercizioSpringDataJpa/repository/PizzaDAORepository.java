package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaDAORepository extends JpaRepository<Pizza, Long> {
}
