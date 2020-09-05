package ch7;

public class ControllerTest {

	public static void main(String[] args) {
		Controller[] c = { new TV(false), new Radio(true) };
		 
        for (Controller controller : c) {
            controller.show();
        }	
	}
}

abstract class Controller{
	boolean power;
	public void show(){
		if(power==false) {
			System.out.println(getName()+"²¨Áü");
		}else System.out.println(getName()+"ÄÑÁü");
	};
	abstract String getName();
}

class TV extends Controller{
	TV(boolean a){
		this.power=a;
	}
	
	public String getName() {
		return "TV";
	}
}

class Radio extends Controller{
	Radio(boolean a){
		this.power=a;
	}
	
	public String getName() {
		return "Radio";
	}
}