package sec14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now.toString());
	
		long time = now.getTime();
		System.out.println(time);
		Date date = new Date(time); //��¥�� ��ȯ�ϱ�
	
		//������ �ð�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��"); //HH:mm:ss
		String strDate = sdf.format(now);
		System.out.println(strDate);
		
		
	}
}
