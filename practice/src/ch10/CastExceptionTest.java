package ch10;

class Shape{}
class Rectangle extends Shape{}
class Circle extends Shape{}

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(); //rectangle 객체
		try{
			casting(r);
		}catch(ClassCastException e) {
			Shape s = r;	//업캐스팅
			s = new Circle();	//부모=자식. 서클 기억하기 위해 업캐스팅
			Circle c = (Circle) s; //다운캐스팅.
		}
		
	}
	static void casting(Shape s) throws ClassCastException{//업캐스팅
		Circle c=(Circle)s;//서클기억하지 않는데 서클로 형변환 하려고하니까 오류.
	}

}
