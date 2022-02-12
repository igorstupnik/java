package ru.geekbrains.lesson7.hw;

public class Cat {
    private String name;
    private int appetit;
    private boolean fullness;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    public String getName() {
        return name;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public String isFullness() { // here we can check if the cat is hungry
        if (fullness) {
            return "fullness";
        } else {
            return "hungry";
        }
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetit)) { // if the cat have got enough food
            fullness = true;          // it becomes fullness
        }

    }
}
