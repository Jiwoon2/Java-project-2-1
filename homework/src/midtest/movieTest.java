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
				new Movie("보헤미안 랩소디", "브라이언 싱어",9.45),
				new Movie("굿바이 마이 프랜드", "피터 호튼",9.36),
				new Movie("인생은 아름다워", "로베르토 베니니",9.54),
				new Movie("굿월 헌팅", "구스 반 산트",9.9),
				new Movie("사운드 오브 뮤직", "로버트 와이즈",9.60)
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
		System.out.println("영화제목 : "+m[num].getTitle());
		System.out.println("영화감독 : "+m[num].getDirector());
		System.out.println("평점 : "+m[num].getGrade());
	}

}