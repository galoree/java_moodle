package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {
    int satiety;
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }


    public abstract Size getSize();

    public abstract void eat(Food food) throws WrongFoodException;
}
