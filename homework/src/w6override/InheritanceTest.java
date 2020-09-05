package w6override;

class Parent {
	String name;
	Parent(){name = "영조";}
	
	public void print() {
		System.out.println(name);
	}
	
}
class Child extends Parent{
	String name;
	Child(){name = "사도세자";}
	@Override
	public void print() {
		System.out.println("나는 "+ name + "이다.");
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
		Parent p = new Child();

		System.out.println(p.name);
		p.print();
		
	}

}