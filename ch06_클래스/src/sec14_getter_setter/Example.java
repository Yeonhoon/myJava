package sec14_getter_setter;

public class Example {

	public static void main(String[] args) {
		
		User user = new User();
//		System.out.println(user.uid); // private이라 불가능
		System.out.println(user.getUid()); // public이라 가능
		
//		user.uid = "winter"; // private이라 불가능
		user.setUid("메롱"); //setter
		System.out.println(user.getUid());

		user.setUname("장연훈");
		System.out.println(user.getUname());
	
		user.setUage(28);
		System.out.println(user.getUage());
		
		user.setUadult(true);
		System.out.println(user.isUadult());
		
	}

}
