package ch10;

public class MaxTest {

	public static void main(String[] args) {
		Max m = new Max();
		System.out.println(m.max(10.0,8.0));
		System.out.println(m.max(5,8.0));
		System.out.println(m.max(5,3.0));

	}

}
class Max<T>{
	private T n1;
	private T n2;
	public Max(){}
	public T max(T n1, T n2){
		this.n1=n1;
		this.n2=n2;
		Number b1 =  (Number) n1;//Çæ.. »óÀ§°´Ã¼ÀÎ ³Ñ¹ö°´Ã¼·Î ¹Ù²Û´ÙÀ½ ÇÏ¸éµÇ´ÂµÔ...***
		Number b2 =  (Number) n2;
		
		if(b1.doubleValue()>b2.doubleValue()) {
			return n1;
		}else return n2;
	}
}
