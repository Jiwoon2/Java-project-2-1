package ch9;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println(new Student("��"));
		System.out.println(new Student("�浿"));
		
	}

}
class Student{
	String name;
	String blank="";
	public String toString() {
		return "�л�["+name+"]";
	}
	Student(String a){
		name=a;
//		//System.out.print(); return�� ""�ְ� �� ��� ���°� ù��°���
//		System.out.print(name);
//		System.out.print("]");
		
	}
}
