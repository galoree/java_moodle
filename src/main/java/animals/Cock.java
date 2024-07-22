package animals;

import model.Size;

public class Cock extends Herbivore implements Run, Voice, Swim {

    public Cock(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The cock is running");
    }

    @Override
    public String getVoice() {
        return "Cock-a-doodle-doo";
    }

    @Override
    public void swim() {
        System.out.println("The cock is swimming");

    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }
}