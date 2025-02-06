package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class MenuElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int calories;
    private double price;

    public MenuElement(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
