public class Plate {
	private int food;
	public Plate(int food) {
		this.food = food;
	}
	public int decreaseFood(int n) {
		if (food < n) {
			return (n - food);
		} else if (food == n) {
			food -= n;
			return 0;
		} else {
			food -= n;
			return -1;
		}
	}

	public void fill (int foodValue) {
		food += foodValue;
		System.out.println("Тарелка пополнена на " + foodValue);
	}

	public void info() {
		System.out.println("В тарелке: " + food + " еды");
	}
}
