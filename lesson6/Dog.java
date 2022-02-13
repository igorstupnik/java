package ru.geekbrains.lesson6.hw;

public class Dog extends Animal implements Runnable, Swimmable{
    public final int RUN_LIMITS = 500;
    public final int SWIM_LIMITS = 10;
    public static int dogsCount = 0;

    public Dog(String name, String colour, int age) {
        super(name, colour, age);
        dogsCount++;
    }

    @Override
    public void swim(int swimLength) {
        if(swimLength < SWIM_LIMITS){
            System.out.printf("The dog named %s, %d yeas old, %s colour swims %d meters.%n", name, age, colour, swimLength);
        }else{
            System.out.printf("Dogs can't swim %d meters distance.%n", swimLength);
        }
    }

    @Override
    public void run(int runLength) {
        if(runLength < RUN_LIMITS){
            System.out.printf("The dog named %s, %d yeas old, %s colour runs %d meters.%n", name, age, colour, runLength);
        }else{
            System.out.printf("Dogs can't run %d meters distance.%n", runLength);
        }
    }
}
