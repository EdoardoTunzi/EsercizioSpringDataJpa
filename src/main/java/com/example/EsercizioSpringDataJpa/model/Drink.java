package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*@Table(name = "drinks")*/
@NoArgsConstructor
@Data
public class Drink extends MenuElement {


    public Drink(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                '}';
    }
}
