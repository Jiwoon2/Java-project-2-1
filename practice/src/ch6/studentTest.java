package ch6;
/*참고.https://blog.naver.com/PostView.nhn?blogId=hello_toi&logNo=221857122616&categ
oryNo=43&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=section*/
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	String getName() {return name;}
	int getAge() {return age;}
	void show() {
		System.out.println("사람 [ 이름 : " + name + ", 나이 : " + age + " ]");
	}
}
class Student extends Person{
	int num;
	Student(String name,int age, int num){
		super(name, age);
		this.num=num;
	}
	int getNum() {return num;}
	void show() {
		System.out.println("학생 [ 이름 : " + getName() + ", "+getAge()+" ,"+getNum());
	}
}
class ForeignStudent extends Student{
	String country;
	String getCountry() {return country;}
	ForeignStudent(String name,int age, int num,String country){
		super(name,age,num);
		this.country=country;
	}
	void show() {
		System.out.println("other학생 [ 이름 : " + getName() + ", "+getAge()+" ,"+getNum()+" ,"+getCountry());
	}
}

public class studentTest {

	public static void main(String[] args) {
		Person p[]= new Person[3];
		p[0]=new Person("길동",32);
		p[1]=new Student("황진",23,100);
		p[2]=new ForeignStudent("Amy",30,200,"holiy");
	
		for(Person i: p)
			i.show();
	}

}


//class Person{
//	String name;
//	int age;
//	void setName(String name) {this.name=name;}
//	String getName() {return name;}
//	int getAge() {return age;}
//	void show() {
//		System.out.println("사람 [ 이름 : " + name + ", 나이 : " + age + " ]");
//		}
//	Person(){name=" "; age=0;}
//}
//class Student extends Person{
//	int number;
//	void setNum(int a) {this.number=a;}
//	int getNum() {return number;}
//	Student(){number=0;}
//	void show() {
//		  System.out.print("학생 [ 이름 : " + getName() + ", ");
//	        System.out.print("나이 : " + getAge() + ", ");
//	        System.out.println("학번 : " + number + " ]");
//	}
//}
//class ForeignStudent extends Student{
//	String country;
//	String getCountry() {return country;}
//	ForeignStudent(){country=" ";}
//	void show() {
//		  System.out.print("학생 [ 이름 : " + getName() + ", ");
//	        System.out.print("나이 : " + getAge() + ", ");
//	        System.out.println("학번 : " + getNum()  );
//	        System.out.println("국적 : "+country+"]");
//	}
//}