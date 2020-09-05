package ch6;

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls= {new Girl("갑순")};
		for( Girl g: girls)
			g.show();
	}

}

class Girl{
	protected String name;
	void show() {System.out.println(name+"초보");}
	Girl(String name){this.name=name;}
}
class GoodGirl extends Girl{
	GoodGirl(String name){super(name);}
	void show() {System.out.println("자바 잘암");}
	
}
class BestGirl extends GoodGirl{
	BestGirl(String name){super(name);}
	void show() {System.out.println("자바 무지하게 잘암");}
}