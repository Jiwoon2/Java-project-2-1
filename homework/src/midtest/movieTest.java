package midtest;

class Movie{
	String title, director;
	double grade;
	public Movie() {}
	public Movie(String title, String director, double grade){
		this.title=title;
		this.director=director;
		this.grade=grade;
	}
	public void setTitle(String title) {this.title=title;}
	public String getTitle() {return title;}
	public void setDirector(String director){this.director=director;}
	public String getDirector() {return director;}
	public void setGrade (double grade) {this.grade=grade;}
	public double getGrade() {return grade;}
	
	public void show() {
		System.out.println(title+", "+director+","+grade);
	}
}

public class movieTest {

	public static void main(String[] args) {
		Movie[] m = { 
				new Movie("����̾� ���ҵ�", "����̾� �̾�",9.45),
				new Movie("�¹��� ���� ������", "���� ȣư",9.36),
				new Movie("�λ��� �Ƹ��ٿ�", "�κ����� ���ϴ�",9.54),
				new Movie("�¿� ����", "���� �� ��Ʈ",9.9),
				new Movie("���� ���� ����", "�ι�Ʈ ������",9.60)
			};
		for(int i=0;i<m.length;i++) {
			m[i].show();
		}
		System.out.println("----------BEST MOVIE----------" );
		double high=0;
		int num=0;
		for(int i=0;i<m.length;i++) {
			if(high<m[i].grade) {
				high=m[i].grade;
				num=i;
			}
		}
		System.out.println("��ȭ���� : "+m[num].getTitle());
		System.out.println("��ȭ���� : "+m[num].getDirector());
		System.out.println("���� : "+m[num].getGrade());
	}

}