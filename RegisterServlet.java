package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register/Register")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ý���������Ϣ�ı����ʽ
		request.setCharacterEncoding("UTF-8");
		//����register.html��ע����Ϣ
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String sage=request.getParameter("age");
		//�ڿ���̨��ӡ���ע����Ϣ
		System.out.println("name="+name+";password="+password+";sage="+sage);
		
	}

}
