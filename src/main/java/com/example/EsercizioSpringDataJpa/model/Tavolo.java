package com.example.EsercizioSpringDataJpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "tavoli")
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numeroTavolo;
    private int numeroCoperti;
    private boolean disponibile;

    public Tavolo(int numeroTavolo, int numeroCoperti, boolean disponibile) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCoperti = numeroCoperti;
        this.disponibile = disponibile;
    }

    public void printTavoloInfo() {
        System.out.println("numero tavolo--> " + numeroTavolo);
        System.out.println("numero massimo coperti--> " + numeroCoperti);
        System.out.println("occupato/libero--> " + (this.disponibile ? "Libero" : "Occupato"));
    }
}


