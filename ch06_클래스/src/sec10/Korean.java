package sec10;

public class Korean {
	
	// field("Korean"�̶�� ��ü�� ������ �ִ� ������)
	static String nation = "���ѹα�"; //���� �ʵ�: ��ü�� ���������� ������ ����. 
	String name;// �ν��Ͻ� �ʵ�
	String ssn;
	int age;
	boolean adult;
	
	// constructor
	
	// method
	static String getNation(){
		// ���� �ʵ� �Ǵ� ���� �޼ҵ� ȣ�⸸���� �����Ǿ��ٸ� static�� �ٿ��� �� ����. static�� �Ⱥٿ��ָ� ��ü���� �Է����־�� ��.
		return nation;
	}
	
	static String changeNation() {
		String nation = getNation();
		Korean.nation = "���ѹα�";
		return nation; // ��ü�� ���� ����.
	}
	
	String getName() {
		// �ʵ忡�� name �ν��Ͻ��̹Ƿ� name�� �������� �ݵ�� ��ü�� �־�� ��.
		// �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ȣ���� ���ԵǾ� ������ �޼ҵ�� �ν��Ͻ� �޼ҵ忩��(static�� ���̸� �ȵ�)
		//field�� ������ ����Ϸ��� field�� �޼ҵ��� static ���θ� ��ġ���Ѿ� ��.
//		Korean.nation = "�ѱ�";
		return name; //non-static �ʵ忡 static methods ��ȯ �Ұ���. 
	}
	
}
