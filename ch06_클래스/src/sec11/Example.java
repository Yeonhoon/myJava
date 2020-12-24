package sec11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Korean.nation = "The United States of America";
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("940123-1157229");
		System.out.println(k1.ssn);
		
		//k1.ssn = "987654-7654321"; //ssn은 final이라 수정 불가.
		

	}

}
