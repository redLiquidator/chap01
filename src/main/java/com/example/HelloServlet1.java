package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/box1")
public class HelloServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// url으로 실행한다. 
		PrintWriter out =resp.getWriter();
		
		out.println("<style>div "
				+ "{background-color: red; " 
				+ "border-radius: 25px 25px 0px 0px;"
				+ "text-align:center; "
				+ "border:1px solid black; "
				+ "width:100px; "
				+ "height:100px;}"
				+ "h3{margin:30px;}</style> "
				+ "<div><h3>Box</h3></div>");   
       // 위의 출력문을 webbrowser이 url로 호출, 실행한다. 
	}
}


