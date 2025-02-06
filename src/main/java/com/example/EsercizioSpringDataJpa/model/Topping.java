package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "toppings")
@NoArgsConstructor
@Data
public class Topping extends MenuElement {

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Topping{ " + super.toString() + "}";
    }
}
