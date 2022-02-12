package ru.geekbrains.lesson7.hw;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            return true; // in the plate enough food
        } else {
            return false; // in the plate lack of food
        }
    }

    public void fill(int addition) { // this method fills the plate
        food += addition;
    }

    public void info() {
        System.out.println("the plate consists " + food + " food.");
    }
}
