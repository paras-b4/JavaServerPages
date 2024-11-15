package com.paras1;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addServlet")
public class DoFilter extends HttpFilter implements Filter {
       
   
	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req= (HttpServletRequest) request ;
		
		
		int i = Integer.parseInt(request.getParameter("Eid"));
		String str= req.getParameter("Ename");
		if(i>1 && str.length()>=3)
		{
			chain.doFilter(request, response);
			
		}
		
		else
		{
			PrintWriter out = response.getWriter();
			out.println("invalid id");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
