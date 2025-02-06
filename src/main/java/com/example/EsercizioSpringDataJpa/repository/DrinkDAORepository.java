package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkDAORepository extends JpaRepository<Drink, Long> {
}
