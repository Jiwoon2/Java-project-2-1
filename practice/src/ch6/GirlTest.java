package ch6;

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls= {new Girl("����")};
		for( Girl g: girls)
			g.show();
	}

}

class Girl{
	protected String name;
	void show() {System.out.println(name+"�ʺ�");}
	Girl(String name){this.name=name;}
}
class GoodGirl extends Girl{
	GoodGirl(String name){super(name);}
	void show() {System.out.println("�ڹ� �߾�");}
	
}
class BestGirl extends GoodGirl{
	BestGirl(String name){super(name);}
	void show() {System.out.println("�ڹ� �����ϰ� �߾�");}
}