package sec02.MyPrac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyOutputStream {
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("D:\\MW\\jyh\\java\\ch18_¿Œ«≤æ∆øÙ«≤\\src\\files\\data2.db");
			os.write(65);

			os.write(new byte[] {65,66,67});

			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
