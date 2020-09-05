package ch10;

public class PairTest {

	public static void main(String[] args) {
		Pair<Integer> p1=new Pair(10,20);
		Pair<Double> p2=new Pair(10.0,20.0);
		
		System.out.println(p1.first());//10
		System.out.println(p2.second());//20.0
	}

}
class Pair<T>{
	private T n1;
	private T n2;
	
	public Pair(T n1,T n2) {
		this.n1=n1;
		this.n2=n2;
	}
	public T first() {
		return n1;
	}
	public T second() {
		return n2;
	}
}
