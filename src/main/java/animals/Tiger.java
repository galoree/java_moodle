package animals;

import model.Size;

public class Tiger extends Carnivorous implements Run, Voice, Swim {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The tiger is running");

    }

    @Override
    public void swim() {
        System.out.println("The tiger is swimming");

    }

    @Override
    public String getVoice() {
        return "brrr";
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }
}