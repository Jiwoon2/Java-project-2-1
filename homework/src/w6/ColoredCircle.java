package w6;

class ColoredCircle extends Circle {
	String color;
	public ColoredCircle() {
		super();
		this.color = "";}
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color=color;
	}
	@Override
	public void show() {
		System.out.println("�������� " + radius+"�� " + color+ " ���̴�.");
	}
	
}
