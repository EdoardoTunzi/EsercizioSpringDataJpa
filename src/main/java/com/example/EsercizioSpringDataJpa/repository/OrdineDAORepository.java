package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdineDAORepository extends JpaRepository<Ordine,Long> {
}
