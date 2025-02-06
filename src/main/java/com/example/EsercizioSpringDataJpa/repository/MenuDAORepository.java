package com.example.EsercizioSpringDataJpa.repository;

import com.example.EsercizioSpringDataJpa.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDAORepository extends JpaRepository<Menu, Long> {
}
