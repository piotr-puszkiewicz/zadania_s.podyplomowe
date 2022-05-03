package com.company;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 9.0;
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.5;

    final String species;
    private Double weight;
    Integer age;
    public String name;
    Boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species){
            case "felis":this.weight = DEFAULT_CAT_WEIGHT; break;
            case "canis":this.weight = DEFAULT_DOG_WEIGHT; break;
            default: this.weight = DEFAULT_WEIGHT; break;
        }
    }

    public Double getWeight(){
        return this.weight;
    }


    void feed() {
        if (isAlive) {
            weight += 1.0; // weight = weight + 1
            System.out.println("thx for food");
        } else {
            System.out.println("troche za późno");
        }
    }

    void takeForAWalk() {
        if (isAlive) {
            weight -= 1.0;
            System.out.println("nice walk, thx");
            if (weight <= 0.0) {
                isAlive = false;
            }
        } else {
            System.out.println("halo policja, ktoś targa martwe zwierze po chodniku");
        }
    }
}