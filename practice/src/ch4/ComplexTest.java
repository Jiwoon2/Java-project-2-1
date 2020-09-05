package ch4;

public class ComplexTest {

	public static void main(String[] args) {

		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5,2.5);
		c2.print();

	
	}

}
class Complex{
	double x,y;
	Complex(double a){
		x=a;
		y=0.0;
	}
	Complex(double a,double b){
		x=a; y=b;
	}
	void print() {
		System.out.println(x +" + "+ y+"i" );
	}
	
	
}
