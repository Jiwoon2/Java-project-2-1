package ch4;

public class DiceTest {

	public static void main(String[] args) {
		Dice d= new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());		
		
	}
	
}
class Dice{
	
	int roll() {
		int a= (int) ((int)10*Math.random());
		return a;
	}
	
}