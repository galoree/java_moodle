import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
	public static void main(String[] args) {
	Worker worker = new Worker();
	Cock cock = new Cock();
	Cow cow = new Cow();
	Duck duck = new Duck();
	Fish fish = new Fish();
	Puma puma = new Puma();
	Tiger tiger = new Tiger();
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
		Cock cock = new Cock();
		Duck duck = new Duck();
		Tiger tiger = new Tiger();
		Puma puma = new Puma();
		Fish fish = new Fish();
		Swim[] animals = new Swim[]{cock, duck, tiger, puma, fish};
		return animals;
	}
}
