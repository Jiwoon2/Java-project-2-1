package ch10;

class Shape{}
class Rectangle extends Shape{}
class Circle extends Shape{}

public class CastExceptionTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(); //rectangle ��ü
		try{
			casting(r);
		}catch(ClassCastException e) {
			Shape s = r;	//��ĳ����
			s = new Circle();	//�θ�=�ڽ�. ��Ŭ ����ϱ� ���� ��ĳ����
			Circle c = (Circle) s; //�ٿ�ĳ����.
		}
		
	}
	static void casting(Shape s) throws ClassCastException{//��ĳ����
		Circle c=(Circle)s;//��Ŭ������� �ʴµ� ��Ŭ�� ����ȯ �Ϸ����ϴϱ� ����.
	}

}
