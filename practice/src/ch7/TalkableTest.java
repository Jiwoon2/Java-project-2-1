package ch7;

interface Talkable{
	void talk();
}
class Korean implements Talkable{
	public void talk() {
		System.out.println("�ȳ�");
	}
}
class American implements Talkable{
	public void talk() {
		System.out.println("hello");
	}
}

public class TalkableTest {
	static void speak(Talkable talkable) {//Talkable�������̽� ��ӹ޾Ƽ� �Ű������޾Ƶ� �Ǵµ�
		talkable.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}
