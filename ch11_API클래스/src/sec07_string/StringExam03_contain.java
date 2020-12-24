package sec07_string;

public class StringExam03_contain {
	public static void main(String[] args) {
		
		String news = "������ ũ�������� �̺������� ���Ƽ� java�� �����Ѵ�";
		
		//replace
		news= news.replace("java", "�ڹ�");

		//contains
		if(news.contains("�ڹ�")){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//indexOf
		if(news.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹٿ� ���õ� ���");
		} else {
			System.out.println("�ڹٿ� ���þ���");
		}
		
		String file = "sample.txt";
		int index = file.indexOf(".");
		String name = file.substring(0,index);
		String ext = file.substring(index+1);
		
		String file2 = "sample.movie.txt";
		int index2 = file2.lastIndexOf(".");
		String name2 = file2.substring(0,index2);
		String ext2 = file2.substring(index2+1);
		
		System.out.println(name2);
		System.out.println(ext2);
		
		String file3= "C:/Temp/dir1/sample.mp3";
		int index3 = file3.lastIndexOf("/");
		String dir3 = file3.substring(0,index3);
		System.out.println(dir3);
		String filename = file3.substring(index3+1);
		System.out.println(filename);
		
		String [] arr = filename.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		
		String temp = file3.substring(index3+1);
		int lastDotIndex= temp.lastIndexOf(".");
		String name3 = temp.substring(0,lastDotIndex);
		String ext3 = temp.substring(lastDotIndex+1);		
		
		System.out.println(name3);
		System.out.println(ext3);
		
	}
}
