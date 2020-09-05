package ch6;
 class Phone {
	 
    protected String owner;
    public Phone(String owner) {
        this.owner = owner;
    }
 
    public void talk() {
        System.out.println(owner + "�� ��ȭ���̴�.");
    }
 
}
class Telephone extends Phone {
	private String when;
	 
    Telephone(String owner, String when) {
	    super(owner);    
    	
	       this.when = when;
	    }
	    
	    public void autoAnswering() {
	        System.out.println(owner + "�� ����. " + when + " ��ȭ �ٷ�.");
	    }
	 
}
class Smartphone extends Telephone {
	 
    private String game;
    Smartphone(String name, String game){
    	super(name,"when");
    	this.game=game;
    }
    public void playGame() {
        System.out.println(owner + "�� " + game + " ������ �ϴ� ���̴�.");
    }
 
}


public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones= {new Phone("Ȳ����"), new Telephone("�浿��","����"),
				new Smartphone("�α���","������")};
		
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
