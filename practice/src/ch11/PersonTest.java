package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{
	String name="";
	int age=0;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Person"+name + ":" + age;
	}
	public int hashCode() { return name.hashCode();}
	public boolean equals(Object o) {
		  if (o instanceof Person) {
			return ((Person) o).name.equals(name);
		  }
		  return false;
		}
	
}

public class PersonTest {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열",20));
		set.add(new Person("우등",16));
		set.add(new Person("홀리",56));
		
		Iterator<Person> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());//출력 모르겠..ㅜㅜ
		}
		
		System.out.println(set);
	}

}
