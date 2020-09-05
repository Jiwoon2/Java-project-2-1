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
class Call {//�Ф� �ٽ�.. �������̽� �Ű����� �ް� ĳ������ ������ �޼ҵ� ����
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
