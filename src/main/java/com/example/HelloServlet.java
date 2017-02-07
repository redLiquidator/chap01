package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/box")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// url으로 실행한다. 
		PrintWriter out =resp.getWriter();
		
		out.println(" <div><h3>BOX</h3></div>");   
       // 위의 출력문을 webbrowser이 url로 호출, 실행한다. 
	}
}


