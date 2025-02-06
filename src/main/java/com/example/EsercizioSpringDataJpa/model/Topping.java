package com.example.EsercizioSpringDataJpa.model;

import lombok.Data;


/*@NoArgsConstructor(force = true)*/

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
