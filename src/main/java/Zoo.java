import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {
	private static Aviary<Carnivorous> carnivorousAviary = new Aviary(Size.LARGE);
	private static Aviary<Herbivore> herbivoreAviary = new Aviary(Size.MEDIUM);
	public static void main(String[] args) {
		Worker worker = new Worker();
		Cock cock = new Cock("Kyle");
		Cow cow = new Cow("Ziggy");
		Duck duck = new Duck("Madison");
		Fish fish = new Fish("Jenifer");
		Puma puma = new Puma("Peter");
		Tiger tiger = new Tiger("Elizabeth");
		Grass grass = new Grass();
		Meat meat = new Meat();


		worker.feed(duck, grass);
		worker.feed(puma, grass);
		worker.feed(puma, meat);
		worker.getVoice(puma);
		worker.getVoice(cow);
		worker.feed(cow, grass);
		worker.feed(cow, meat);
		worker.getVoice(tiger);

		Swim[] animals = createPond();
		for (int i = 0; i < animals.length; i++) {
			animals[i].swim();
		}

	}
	public static Swim[] createPond() {
		Cock cock = new Cock("Garfield");
		Duck duck = new Duck("Kate");
		Tiger tiger = new Tiger("Mads");
		Puma puma = new Puma("Conor");
		Fish fish = new Fish("Alice");
		Swim[] animals = new Swim[]{cock, duck, tiger, puma, fish};
		return animals;
	}

	private static void fillCarnivorousAviary() {
		int a = 2 + (int) (Math.random() * 5);
		for (int i = 0; i < a; i++) {
			Tiger tiger = new Tiger("Josh");
			carnivorousAviary.addAnimal(tiger);
		}
	}
	private static void fillHerbivoreAviary() {
		int a = 2 + (int) (Math.random() * 5);
		for (int i = 0; i < a; i++) {
			Duck duck = new Duck("Lucas");
			herbivoreAviary.addAnimal(duck);
		}
	}
	private static Carnivorous getCarnivorous(String name) {
		return carnivorousAviary.getAnimal(name);
	}

	private static Herbivore getHerbivore(String name) {
		return herbivoreAviary.getAnimal(name);
	}

}
