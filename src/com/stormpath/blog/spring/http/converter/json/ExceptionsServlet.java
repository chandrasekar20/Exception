package com.stormpath.blog.spring.http.converter.json;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ExceptionsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
