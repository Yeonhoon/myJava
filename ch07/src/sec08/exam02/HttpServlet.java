package sec08.exam02;

public abstract class HttpServlet {
	
	public void info() {
		System.out.println("서버에서 사용하는 서비스 클래스임");
	}
	
	public abstract void service(); 
}
