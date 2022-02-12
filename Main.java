package ru.geekbrains.lesson7.hw;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[4] = new Cat("Gizmo", 10); // we can play with their appetit
        cats[3] = new Cat("Theo", 8);
        cats[2] = new Cat("Ziggy", 5);
        cats[1] = new Cat("Kiki", 2);
        cats[0] = new Cat("Mia", 3);
        Plate plate = new Plate(15);         // and quantity off food in the plate
        plate.info();
        for (Cat cat : cats) { // here we can feed kittens
            cat.eat(plate);
        }
        System.out.println("After feeding:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " is " + cat.isFullness() + ";"); //here we can check if they are fullness
        }
        plate.info();
        System.out.println("Lets fill the plate");
        plate.fill(20);               // here we can fill the plate
        plate.info();
    }

}
