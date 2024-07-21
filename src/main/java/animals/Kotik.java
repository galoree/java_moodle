package animals;

public class Kotik {
    private final static int METHODS = 5;
    private static int count;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    {
        count++;
    }
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public Kotik(){

    }

    public boolean play() {
        if (satiety > 0) {
            satiety--;
            System.out.println("I'm playing");
            return true;
        }
        else {
            System.out.println("I'm hungry, feed me first!");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            System.out.println("I'm sleeping");
            return true;
        }
        else {
            System.out.println("I'm hungry, feed me first!");
            return false;
        }
    }
    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            System.out.println("I'm washing myself");
            return true;
        }
        else {
            System.out.println("I'm hungry, feed me first!");
            return false;
        }
    }
    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            System.out.println("I'm walking");
            return true;
        }
        else {
            System.out.println("I'm hungry, feed me first!");
            return false;
        }
    }
    public boolean hunt() {
        if (satiety > 0) {
            satiety--;
            System.out.println("I'm hunting");
            return true;
        }
        else {
            System.out.println("I'm hungry, feed me first!");
            return false;
        }
    }

    public void eat(int satietyAmount) {
        satiety += satietyAmount;
    }
    public void eat(int satietyAmount, String foodName) {
        satiety += satietyAmount;
    }
    public void eat() {
        this.eat(3,"Friskies");
    }

    public String[] liveAnotherDay() {
        String[] log = new String[24];
        for (int i = 0; i < 24; i++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (play()) {
                        log[i] = i + " - " + "I was playing";
                    }
                    else {
                        eat();
                        log[i] = i + " - " + "I was eating";
                    }
                break;
                case 2:
                    if (sleep()) {
                        log[i] = i + " - " + "I was sleeping";
                    }
                    else {
                        eat();
                        log[i] = i + " - " + "I was eating";
                    }
                break;
                case 3:
                    if (wash()) {
                        log[i] = i + " - " + "I was washing";
                    }
                    else {
                        eat();
                        log[i] = i + " - " + "I was eating";
                    }
                break;
                case 4:
                    if (walk()) {
                        log[i] = i + " - " + "I was walking";
                    }
                    else {
                        eat();
                        log[i] = i + " - " + "I was eating";
                    }
                break;
                case 5:
                    if (hunt()) {
                        log[i] = i + " - " + "I was hunting";
                    }
                    else {
                        eat();
                        log[i] = i + " - " + "I was eating";
                    }
                break;
            }
        }
        return log;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count;
    }
}
