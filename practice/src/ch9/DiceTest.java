package ch9;

public class DiceTest {

	public static void main(String[] args) {
		System.out.println(new Dice().roll());
	}

}
class Dice{
	int roll() {
	int i=((int)(Math.random()*(7-1))+1);
	return i;
	}
	
}