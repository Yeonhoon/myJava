package sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
	public static void main(String[] args) {
		//FileNotFoundException �߻� ���ɼ� ==> ����ó�� �ʿ�.
		try {
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_��ǲ�ƿ�ǲ\\src\\files/data1.db");
			os.write(65);
			// �ؽ�Ʈ �����Ϳ��� 65�� ���ڷ� �ٲپ ǥ���ϰ� ��. 65 --> A�� �����.
			
			os.write(new byte[] {66,67}); //�Ű����� �ڸ����� �ٷ� {}�� �� �� ���� 
			os.write(new byte[] {68,69,70,},0,2); // ù��°���� n�� �����. read�� ���� �κ��� ��� �� �������� write�� ���� �����.
			
			os.flush(); // ����. ����� �ϰ� ������ �ݵ�� flush() -> close() ������ �ۼ��������. e.g. flush: ī��ä���� �� enter
			os.close(); // e.g. ä��â ���� �� close;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { //������ �������� ���������� �Ұ����� ��� IOException �߻��� �� ����.;
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
