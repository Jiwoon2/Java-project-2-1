package w6;

class Circle {
	int radius;
	public Circle() {this.radius = 0;}
	public Circle(int radius) {
		this.radius = radius;
		
	}
	public void show() {
		System.out.println("반지름이 " + radius+"인 원이다.");
	}
	
}
