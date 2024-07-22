package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            throw new WrongFoodException();
        } else {
            satiety++;
        }
    }
}