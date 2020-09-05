package w5;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");

		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", 
	            Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}

class Car{
	private String color;
	public static int carNum=0, redNum=0;
	
	Car(String color){
		this.color=color;
		carNum++;
		if(color.equalsIgnoreCase("red"))
			redNum++;
	}
	public static int getNumOfCar() {
		return carNum;
	}
	
	public static int getNumOfRedCar() {
		return redNum;
	}
}
