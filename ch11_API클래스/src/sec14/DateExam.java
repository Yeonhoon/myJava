package sec14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now.toString());
	
		long time = now.getTime();
		System.out.println(time);
		Date date = new Date(time); //날짜로 변환하기
	
		//심플한 시간형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); //HH:mm:ss
		String strDate = sdf.format(now);
		System.out.println(strDate);
		
		
	}
}
