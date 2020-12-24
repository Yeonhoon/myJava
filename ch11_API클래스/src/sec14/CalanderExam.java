package sec14;

import java.util.Calendar;

public class CalanderExam {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //달력 예시
		int year = calendar.get(calendar.YEAR); 
		int month= calendar.get(calendar.MONTH) + 1; //0부터 시작하는 값을 가져오기 때문에 1을 더해줘야.
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int week = calendar.get(calendar.DAY_OF_WEEK);
		int amPm = calendar.get(calendar.AM_PM);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}

}
