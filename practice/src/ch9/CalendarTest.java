package ch9;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		String weekName[]= {"��","��","ȭ","��","��","��","��"};
		String noonName[]= {"����","����"};
		Calendar c = Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DATE);
		String week = weekName[c.get(Calendar.DAY_OF_WEEK)-1];
		int i;
		if(c.get(Calendar.HOUR_OF_DAY)>12) {
			i=1;
		}else i=0;
		String noon = noonName[i];
		int hour = c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		
		System.out.println(year +"��"+month+"��"+day);
		System.out.println(week+noon);
		System.out.println(hour+"��"+minute+"��"+second);
	}
}

