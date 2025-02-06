package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public abstract class MenuElement {
    @Id
    @GeneratedValue
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
