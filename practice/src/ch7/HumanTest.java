package ch7;

interface Human {
    void eat();
    public static void echo() {
    	System.out.println("yaho~~!!");
    }
}
 
class Worker implements Human {
    public void eat() {
        System.out.println("���� �Խ��ϴ�.");
    }
    public void print() {
		System.out.println("�ΰ���.");
	}
}

class Student implements Human{
	public void print() {
		System.out.println("�л���.");
	}
	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
	}

}
public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		 
        Student s = new Student();
        s.print();
        s.eat();
 
        Worker p = new Worker();
        p.print();
        p.eat();	
	}

}
