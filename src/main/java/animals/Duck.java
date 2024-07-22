package animals;

import model.Size;

public class Duck extends Herbivore implements Swim, Fly, Voice, Run {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public String getVoice() {
        return "quack";
    }

    @Override
    public void run() {
        System.out.println("The duck is running");

    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }
}