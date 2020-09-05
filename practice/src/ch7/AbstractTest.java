package ch7;

abstract class Abstract{
	int i;
	abstract void show();
	Abstract(int i){
		this.i=i;
	}
}
class Concrete extends Abstract{
	int j;
	Concrete(int i, int j){
		super(i);
		this.j=j;
	}
	void show() {
		System.out.println("i="+i+" j= "+j);
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		Concrete c= new Concrete(100,50);
		c.show();
		
	}

}
