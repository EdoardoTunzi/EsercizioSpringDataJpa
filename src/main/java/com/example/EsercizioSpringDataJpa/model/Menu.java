package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Component
public class Menu {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany
    private List<Pizza> pizzaList;
    @OneToMany
    private List<Drink> drinkList;
    @OneToMany
    private List<Topping> toppingList;

    public Menu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}

