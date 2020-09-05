package ch6;
 class Phone {
	 
    protected String owner;
    public Phone(String owner) {
        this.owner = owner;
    }
 
    public void talk() {
        System.out.println(owner + "가 통화중이다.");
    }
 
}
class Telephone extends Phone {
	private String when;
	 
    Telephone(String owner, String when) {
	    super(owner);    
    	
	       this.when = when;
	    }
	    
	    public void autoAnswering() {
	        System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	    }
	 
}
class Smartphone extends Telephone {
	 
    private String game;
    Smartphone(String name, String game){
    	super(name,"when");
    	this.game=game;
    }
    public void playGame() {
        System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
    }
 
}


public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones= {new Phone("황진이"), new Telephone("길동이","내일"),
				new Smartphone("민국이","갤러그")};
		
		for(Phone p : phones) {
			if(p instanceof Smartphone)
				((Smartphone) p).playGame();
			else if(p instanceof Telephone)
				((Telephone) p).autoAnswering();
			else if(p instanceof Phone)
				p.talk();
		}

		
	}

}
