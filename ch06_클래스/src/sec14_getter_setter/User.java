package sec14_getter_setter;

public class User { // Data Transfer Object(DTO)
					// Value Object(VO): �����͸� ������ �������� �Ű������� ����Ÿ������ �����͸� �ְ���� �� ���.

	//setter�� ����� ����: �̻��� �����Ͱ� �ʵ尪�� ������ ���ϰԲ� ����.
	
	//Field: �̷� �����͸� �����ؼ� user �����Ͷ�� ��.
	private String uid; //�ܺο��� �� ���� �ٲ��� ����!
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
	
	//�Ʒ��� �밡�ٸ� �ڵ�ȭ ��ų �� ����
	// source >> generate getter and setter, getter�� ������ setter�� ������ ���� ������.
	// Ư���� ��찡 �ƴ� �̻� getter setter ��� ����.
	
//	public String getUid() {
//		//������ ��ȯ �۾��� ���� �ܺο� �����ϰڴ�.
//		return uid;
//		//getter: private�� ���డ���ϰ� ���ִ�
//	} //field�� private������ �޼ҵ�� public. �ܺο��� uid ��� ����
//	
//	public void setUid(String uid) { //setter: �޼ҵ�ܺο��� ���� �޾Ƽ�(�Ű����� ����) uid�� ������.
//		//������ ���� �۾��� ���ؼ� ������ �ɰڴ�.
//		this.uid = uid;
//		
//	}
//	// getter�� ����ϰ� setter�� ��� ���ϸ�? �б������ʵ�.
//	
//	public void setUid2(String uid) {
//		this.uid = uid;
//		//return ���� ���� ��� void
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
