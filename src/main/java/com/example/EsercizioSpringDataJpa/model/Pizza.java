package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "pizzas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pizza extends MenuElement{
    @OneToMany
    @JoinColumn(name = "pizza_id")
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
