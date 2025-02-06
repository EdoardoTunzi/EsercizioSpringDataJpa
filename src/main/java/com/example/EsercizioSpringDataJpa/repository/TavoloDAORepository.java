package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Tavolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TavoloDAORepository extends JpaRepository<Tavolo,Long> {
}
