package com.example.EsercizioSpringDataJpa.runner;

//import com.example.EsercizioSpringDataJpa.model.Menu;

import com.example.EsercizioSpringDataJpa.model.Menu;
import com.example.EsercizioSpringDataJpa.model.Ordine;
import com.example.EsercizioSpringDataJpa.model.Tavolo;
import com.example.EsercizioSpringDataJpa.model.Topping;
import com.example.EsercizioSpringDataJpa.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    @Autowired
    private AppService appService;
    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {

        /*//Toppings
        appService.insertTopping(appService.createCheeseTopping());
        appService.insertTopping(appService.createTomatoTopping());
        appService.insertTopping(appService.createHamTopping());
        appService.insertTopping(appService.createPineappleTopping());
        appService.insertTopping(appService.createSalamiTopping());

        //Pizzas
        appService.insertPizza(appService.createMargheritaPizza());
        appService.insertPizza(appService.createHawaiianPizza());
        appService.insertPizza(appService.createSalamiPizza());
        appService.insertPizza(appService.createSalamiPizzaXL());
        //Drinks
        appService.insertDrink(appService.createLemonade());
        appService.insertDrink(appService.createWine());
        appService.insertDrink(appService.createWater());

        //Menu
        Menu menu = appService.createMenu();
        appService.insertMenu(menu);*/

        //tavoli
        /*appService.insertTavolo(appService.createTavolo1());
        appService.insertTavolo(appService.createTavolo2());
        appService.insertTavolo(appService.createTavolo3());
*/
        //ordine

        Ordine o1 = new Ordine(4,appService.getTavoloById(1L));
        appService.insertOrdine(o1);
    }
}
