package sec14_getter_setter;

public class User { // Data Transfer Object(DTO)
					// Value Object(VO): 데이터를 전달할 목적으로 매개변수나 리턴타입으로 데이터를 주고받을 때 사용.

	//setter를 만드는 이유: 이상한 데이터가 필드값에 들어오지 못하게끔 막음.
	
	//Field: 이런 데이터를 포괄해서 user 데이터라고 함.
	private String uid; //외부에서 이 값을 바꾸지 말라!
	private String uname;
	private int uage;
	private boolean uadult;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public boolean isUadult() {
		return uadult;
	}
	public void setUadult(boolean uadult) {
		this.uadult = uadult;
	}
	
	//Constructor
	
	//Method
	
	//아래의 노가다를 자동화 시킬 수 있음
	// source >> generate getter and setter, getter만 만들지 setter만 만들지 선택 가능함.
	// 특별한 경우가 아닌 이상 getter setter 모두 만듦.
	
//	public String getUid() {
//		//데이터 변환 작업을 통해 외부에 전달하겠다.
//		return uid;
//		//getter: private을 실행가능하게 해주는
//	} //field는 private이지만 메소드는 public. 외부에서 uid 사용 가능
//	
//	public void setUid(String uid) { //setter: 메소드외부에서 값을 받아서(매개변수 통해) uid에 저장함.
//		//데이터 검정 작업을 통해서 조건을 걸겠다.
//		this.uid = uid;
//		
//	}
//	// getter만 사용하고 setter는 사용 못하면? 읽기전용필드.
//	
//	public void setUid2(String uid) {
//		this.uid = uid;
//		//return 값이 없는 경우 void
//	}
//	public void setUname(String uname) {
//		this.uname = uname;
//	}
//
//	public String getUname() {
//		return uname;
//	}
//	
//	public int getUage() {
//		return uage;
//	}
//	
//	public void setUage(int uage) {
//		this.uage = uage;
//	}
//	
//	public boolean isUadult() {
//		return uadult;
//	}
//	
//	public void setUadult(boolean uadult) {
//		this.uadult = uadult;
//	}	
	
}
