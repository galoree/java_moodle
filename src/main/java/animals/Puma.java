package animals;

import model.Size;

public class Puma extends Carnivorous implements Run, Voice, Swim {

    public Puma(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The puma is running");

    }

    @Override
    public String getVoice() {
        return "brrr";
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");

    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }
}