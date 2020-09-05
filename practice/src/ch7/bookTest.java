package ch7;

import java.util.Arrays;

public class bookTest {

	public static void main(String[] args) {
		Book books [] = { new Book(15000),new Book(50000),new Book(20000)};
		System.out.println("정렬 전");
		for(int i=0;i<books.length;i++)
			System.out.println("Book [price="+books[i].price+"]");
		Arrays.sort(books);
		
		System.out.println("정렬 후");
		for(int i=0;i<books.length;i++)
			System.out.println("Book [price="+books[i].price+"]");
	}

}

class Book implements Comparable<Book>{
	int price;
	Book(int price){
		this.price=price;
	}
	@Override
	public int compareTo(Book book) { //객체비교는 반드시 Comparable인터페이스 씀. compareTo가 객체 비교해줌
		return this.price-book.price;
	}
	
}