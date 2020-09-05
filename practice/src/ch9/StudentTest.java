package ch9;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println(new Student("삿갓"));
		System.out.println(new Student("길동"));
		
	}

}
class Student{
	String name;
	String blank="";
	public String toString() {
		return "학생["+name+"]";
	}
	Student(String a){
		name=a;
//		//System.out.print(); return문 ""넣고 이 방법 쓰는게 첫번째방법
//		System.out.print(name);
//		System.out.print("]");
		
	}
}
