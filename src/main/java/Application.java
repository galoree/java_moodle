import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Chester", "meeoow", 10, 1000 );
        Kotik kotik2 = new Kotik();

        kotik2.setName("Chief");
        kotik2.setVoice("meow");
        kotik2.setSatiety(15);
        kotik2.setWeight(20);

        for (String i : kotik1.liveAnotherDay())
            System.out.println(i);

        System.out.println("name: " + kotik2.getName() +  ", weight: " + kotik2.getWeight());

        System.out.println(compareVoice(kotik1, kotik2));

        System.out.println(Kotik.getCount());
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }


}
