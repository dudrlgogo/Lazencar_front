package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Member;
import service.MemberSignUpService;
import service.MemberSignUpServiceImpl;

@WebServlet("/signUp.do")
public class MemberSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		MemberSignUpService service = new MemberSignUpServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json; charset=utf-8");
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memName = request.getParameter("memName");
		String memPhone = request.getParameter("memPhone");
		String memAddr = request.getParameter("memAddr");
		String memEmail = request.getParameter("memEmail");
		String memJumin = request.getParameter("memJumin");
		
		Member mem = new Member();
		mem.setMemId(memId);
		mem.setMemPw(memPw);
		mem.setMemName(memName);
		mem.setMemPhone(memPhone);
		mem.setMemAddr(memAddr);
		mem.setMemEmail(memEmail);
		mem.setMemJumin(memJumin);
		
		service.signUp(mem);
		
	}
}
