package com.example.EsercizioSpringDataJpa.model;

import lombok.Data;

import java.util.List;


@Data
public class Pizza extends MenuElement{

    private List<Topping> toppingList;
    private boolean isXl = false;

    public Pizza(String name, int calories, double price, List<Topping> toppingList, boolean isXl) {
        super(name, calories, price);
        this.toppingList = toppingList;
        this.isXl = isXl;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppingList=" + toppingList +
                ", isXl=" + isXl +
                "} " + super.toString();
    }
}
