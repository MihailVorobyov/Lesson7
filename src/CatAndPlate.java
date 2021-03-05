import java.util.Random;

public class CatAndPlate {
	public static void main(String[] args) {

		Cat[] cats = new Cat[6];

		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat("Cat" + (i + 1), new Random().nextInt(15));
		}

		Plate plate = new Plate(30);
		plate.info();

		for (Cat cat : cats) {
			cat.eat(plate);
			plate.info();
		}

		for (Cat cat : cats) {
			System.out.println(cat.isSatiety() == true ? cat.getName() + " наелся" :
					cat.getName() + " голоден");
		}

		plate.fill(40);
		plate.info();

	}
}
