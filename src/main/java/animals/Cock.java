package animals;

public class Cock extends Herbivore implements Run, Voice, Swim {

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
}