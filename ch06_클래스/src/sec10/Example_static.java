package sec10;

public class Example_static {

	public static void main(String[] args) {
		//정적필드 읽기
		System.out.println(Korean.nation); //정적인 필드는 객체에 저장되는 것이 아니라 클래스에 저장되기 때문에 객체를 따로 만들어 부르는 것이 아니라 클래스로 부른다.

		Korean.nation = "Republic of Korea"; //정적 필드는 수정 가능함.
		System.out.println(Korean.nation); //정적인 필드는 객체에 저장되는 것이 아니라 클래스에 저장되기 떄문에

		
//		Korean.getNation(); //에러발생: 얘는 인스턴스 메소드. 인스턴스 메소드는 객체가 있어야함.
//		Korean k1 = new Korean();
//		System.out.println(k1.getNation()); //정적인 필드는 클래스가 필요없는데, 메소드를 실행시키려면 클래스가 필요하다? 이상함.
		// 필드나 메소드가 정적 필드 또는 정적 메소드 호출로만 구성이 된다면 static 붙여줘야
		
		
		System.out.println(Korean.nation);
		Korean k1 = new Korean();
		k1.name = "장연훈";
		System.out.println(k1.getName());
	}

}
