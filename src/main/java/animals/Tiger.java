package animals;

public class Tiger extends Carnivorous implements Run, Voice, Swim {
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
}