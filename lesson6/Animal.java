package ru.geekbrains.lesson6.hw;

public class Animal {
    public String name;
    public String colour;
    public  int age;
    public static int counts = 0;

    public Animal(String name, String colour, int age){
        this.name = name;
        this.colour = colour;
        this.age = age;
        counts++;
    }


}
