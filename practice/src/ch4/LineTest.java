package ch4;

public class LineTest {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
		
	}

}

class Line{
	int length;
	Line(int i){
		length=i;
	}
	boolean isSameLine(Line x){
		if(this.length==x.length)
			return true;
		else return false;
	}
	
}