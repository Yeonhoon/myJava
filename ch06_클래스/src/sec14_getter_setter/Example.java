package sec14_getter_setter;

public class Example {

	public static void main(String[] args) {
		
		User user = new User();
//		System.out.println(user.uid); // private�̶� �Ұ���
		System.out.println(user.getUid()); // public�̶� ����
		
//		user.uid = "winter"; // private�̶� �Ұ���
		user.setUid("�޷�"); //setter
		System.out.println(user.getUid());

		user.setUname("�忬��");
		System.out.println(user.getUname());
	
		user.setUage(28);
		System.out.println(user.getUage());
		
		user.setUadult(true);
		System.out.println(user.isUadult());
		
	}

}
