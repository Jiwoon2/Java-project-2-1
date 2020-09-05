package ch7;

interface Printable {
    
}
class A4 implements Printable {
    public void a() {
        System.out.println("A4");
    }
}
class B4 implements Printable {
    public void b() {
        System.out.println("B4");
    }
}
class Call {//ㅠㅠ 다시.. 인터페이스 매개변수 받고 캐스팅후 각각의 메소드 실행
    void invoke(Printable p) {
    	if(p instanceof B4) {
    		((B4)p).b();
    	}else
    		((A4)p).a();
    }
}

public class PrintableTest {
    public static void main(String[] args) {
        Printable p = new B4();
        Call c = new Call();
        c.invoke(p);
    }
}
