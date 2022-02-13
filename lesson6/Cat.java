package ru.geekbrains.lesson6.hw;

public class Cat extends Animal implements Runnable, Swimmable{
    public final int RUN_LIMITS = 200;
    public static int catsCounts = 0;


    public Cat(String name, String colour, int age) {
        super(name, colour, age);
        catsCounts++;
    }

    @Override
    public void run(int runLength) {
        if(runLength < RUN_LIMITS){
            System.out.printf("The cat named %s, %d yeas old, %s colour runs %d meters.%n", name, age, colour, runLength);
        }else{
            System.out.printf("Cats can't run %d meters distance.%n", runLength);
        }
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Cat's cant swim at all!");
    }
}
