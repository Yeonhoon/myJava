package sec03.Exam02_�θ��ڽ�;

public class DmbPhone extends Cellphone{
	
	//field
	
	//Constructor
	public DmbPhone(String owner) {
		super("��¼���"); // extends ���ϰ�� �����Ϸ��� �ڵ����� super()(=�θ������ ȣ���ڵ�)�� ����. super()�� �׻� ���� ȣ��Ǿ����.
		// ���� �������� ���� ����
		this.owner = owner;
		System.out.println("DmbPhone() ����Ϸ�");
	}
	
	//Method
	
}
