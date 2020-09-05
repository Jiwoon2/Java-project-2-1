package ch6;

class Point{
	private int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	int getX() {return x;}
	int getY() {return y;}
	public String toString() {
		String f= "xÁÂÇ¥"+x+"yÁÂÇ¥"+y;
			return f;
	}
}
class MovablePoint extends Point{
	private int xSpeed, ySpeed;
	MovablePoint(int x, int y, int xSpeed, int ySpeed){
		super(x,y);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	int getxSpeed() {return xSpeed;}
	int getySpeed() {return ySpeed;}
	public String toString() {
		String f= "xÁÂÇ¥"+getX()+"yÁÂÇ¥"+getY()+"x: "+xSpeed+"y: "+ySpeed;
			return f;
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point a=new Point(1,2);
		MovablePoint b=new MovablePoint(2,3,50,60);
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
