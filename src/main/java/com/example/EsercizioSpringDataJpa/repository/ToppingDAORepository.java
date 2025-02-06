package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingDAORepository extends JpaRepository<Topping, Long> {
}
