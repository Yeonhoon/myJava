package sec10;

public class Example_static {

	public static void main(String[] args) {
		//�����ʵ� �б�
		System.out.println(Korean.nation); //������ �ʵ�� ��ü�� ����Ǵ� ���� �ƴ϶� Ŭ������ ����Ǳ� ������ ��ü�� ���� ����� �θ��� ���� �ƴ϶� Ŭ������ �θ���.

		Korean.nation = "Republic of Korea"; //���� �ʵ�� ���� ������.
		System.out.println(Korean.nation); //������ �ʵ�� ��ü�� ����Ǵ� ���� �ƴ϶� Ŭ������ ����Ǳ� ������

		
//		Korean.getNation(); //�����߻�: ��� �ν��Ͻ� �޼ҵ�. �ν��Ͻ� �޼ҵ�� ��ü�� �־����.
//		Korean k1 = new Korean();
//		System.out.println(k1.getNation()); //������ �ʵ�� Ŭ������ �ʿ���µ�, �޼ҵ带 �����Ű���� Ŭ������ �ʿ��ϴ�? �̻���.
		// �ʵ峪 �޼ҵ尡 ���� �ʵ� �Ǵ� ���� �޼ҵ� ȣ��θ� ������ �ȴٸ� static �ٿ����
		
		
		System.out.println(Korean.nation);
		Korean k1 = new Korean();
		k1.name = "�忬��";
		System.out.println(k1.getName());
	}

}
