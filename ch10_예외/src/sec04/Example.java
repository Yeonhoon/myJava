package sec04;

public class Example {

	//catch 블록이 여러개여도 한개의 catch만 실행됨
	//try가 실행이 되면서 하나의 오류가 나면 바로 catch로 가서 실행이 되기때문에
	public static void main(String[] args) {
	
		try {
			int [] arr = {0,0,0};
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		String data = "1o";
		int value = Integer.parseInt(data);	
//			catch의 순서는 위에서 아래로 가기때문에 Exception e가 마지막에 드러가야함
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			
		} catch (Exception e) {/*모든예외가 exception의 자식이기때문에 모든 예외가 해당됨*/
			System.out.println("알 수 없는 예외가 발생함");
		}
	}
}
