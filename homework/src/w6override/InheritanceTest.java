package w6override;

class Parent {
	String name;
	Parent(){name = "����";}
	
	public void print() {
		System.out.println(name);
	}
	
}
class Child extends Parent{
	String name;
	Child(){name = "�絵����";}
	@Override
	public void print() {
		System.out.println("���� "+ name + "�̴�.");
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
		Parent p = new Child();

		System.out.println(p.name);
		p.print();
		
	}

}