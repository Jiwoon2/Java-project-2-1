package ch7;

interface Talkable{
	void talk();
}
class Korean implements Talkable{
	public void talk() {
		System.out.println("안녕");
	}
}
class American implements Talkable{
	public void talk() {
		System.out.println("hello");
	}
}

public class TalkableTest {
	static void speak(Talkable talkable) {//Talkable인터페이스 상속받아서 매개변수받아도 되는듯
		talkable.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}
