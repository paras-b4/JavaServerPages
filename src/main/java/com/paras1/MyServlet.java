package com.paras1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addServlet")
public class MyServlet extends HttpServlet {
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException 
	{
		PrintWriter out =res.getWriter();
		int i=Integer.parseInt(req.getParameter("Eid"));
		String s = req.getParameter("Ename");
		
		out.println("welcome " + s);
	
	}
}
