package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaDAORepository extends JpaRepository<Pizza, Long> {
}
