public class Cat {


	private String name;
	private int appetite;
	private boolean satiety = false;

	public boolean isSatiety() {
		return satiety;
	}

	public String getName() {
		return name;
	}

	public Cat(String name, int appetite) {
		this.name = name;
		this.appetite = appetite;
	}

	public void eat(Plate p) {
		int hungry = p.decreaseFood(appetite);

		if (hungry <= 0) {
			satiety = true;
		} else {
			satiety = false;
		}

		System.out.println(satiety == true ? name + " съел " + appetite + " и наелся" :
				name + " хотел съесть " + appetite +
				", но в тарелке не хватало еды");
	}
}
