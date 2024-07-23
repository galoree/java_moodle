package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {
    Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (!(food instanceof Grass)) {
            throw new WrongFoodException();
        } else {
            satiety++;
        }
    }

}