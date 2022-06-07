package com.company;

import com.company.creatures.*;
import com.company.device.Car;
import com.company.device.Diesel;
import com.company.device.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Pet cat = new Pet("felis");
        cat.isAlive = true;
        cat.name = "Sierściuch";

        System.out.println("Pet.toString(): " + cat);

        Human kacper = new Human();
        kacper.age = 99;

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());

        Car fiat = new Diesel("bravo", "fiat", 2021);
        fiat.value = 500.0;

        kacper.setCar(fiat);
        kacper.isAlive = false;

        kacper.firstName = "Kacper";
        kacper.lastName = "Warda";
        kacper.pet = dog;
        kacper.mobile = new Phone("6s", "apple", 2018);

        kacper.pet.feed();


        System.out.println(kacper.getCar());
        System.out.println(kacper);


        Car pasat1 = new Diesel("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        Car pasat2 = new Diesel("pasat", "vw", 2001);
        pasat2.value = 1300.0;

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 3000.0;

        kacper.setCar(pasat1);

        try {
            pasat1.sell(kacper, brotherInLaw, 1000.0);
        } catch (Exception e) {
            System.out.println("Nie udało się sprzedać " + pasat1);
            e.printStackTrace();
        }

        System.out.println("Samochód szwagra: " + brotherInLaw.getCar());
        System.out.println("Samochód Kacpra: " + kacper.getCar());

        Human sister = new Human();
        sister.cash = 5000.0;

        kacper.pet = brotherInLaw;

        Phone nokia = new Phone("6410", "Nokia", 2000);
        nokia.installAnApp("YouTube");

        sister.takeForAWalk();

        System.out.println(nokia);

        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = kacper;
        animals[3] = new FarmAnimal("cow");

        System.out.println("Zwierzęta niejadalne:");
        for (Animal animal : animals) {
            if (!(animal instanceof Edible)) {
                System.out.println(animal);
            }
        }

        List<String> stringList = new LinkedList<>();
        Set<String> stringSet = new TreeSet<>();

        String pn = "poniedzialek";
        String wt = "wtorek";
        String sr = "sroda";
        String czw = "czwartek";

        stringList.add(pn);
        stringList.add(pn);
        stringList.add(pn);
        stringList.add(wt);
        stringList.add(sr);
        stringList.add(pn);

        Collections.sort(stringList);

        System.out.println(stringList);

        stringSet.add(pn);
        stringSet.add(czw);
        stringSet.add(pn);
        stringSet.add(wt);
        stringSet.add(sr);
        stringSet.add(pn);

        System.out.println(stringSet);


    }
}