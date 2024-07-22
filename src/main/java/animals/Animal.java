package animals;

import food.Food;

public abstract class Animal {
    int satiety;

    public int getSatiety() {
        return satiety;
    }

    public abstract void eat(Food food);
}
