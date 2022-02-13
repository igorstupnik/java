package ru.geekbrains.lesson6.hw;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty","calico",3);
        Cat cat2 = new Cat("Theo","black",5);
        Cat cat3 = new Cat("Kiki", "blue tortie", 4);

        Dog dog1 = new Dog("Archie","spotted",3);
        Dog dog2 = new Dog("Iggy","smoky",4);

        cat1.run(100);
        cat1.swim(1);
        cat2.run(500);
        cat3.run(50);
        System.out.println();

        dog1.run(400);
        dog1.swim(15);
        dog2.run(700);
        dog2.swim(7);
        System.out.println();

        info();
        
    }
    public static void info(){
        System.out.printf("At this moment we have %d animals in the program:%n %d of them are cats.%n %d of them are dogs.%n",
                Animal.counts, Cat.catsCounts, Dog.dogsCount);
    }
}
