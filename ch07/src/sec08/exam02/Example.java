package sec08.exam02;

public class Example {

	public static void main(String[] args) {
		
		HttpServlet servlet = new SignInServlet();
		servlet.service();
		
		HttpServlet servlet_log = new LoginServlet();
		servlet_log.service();
	}

}
