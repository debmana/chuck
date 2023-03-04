package com.deborasroka;

import java.io.IOException;
//import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("I was called I am the searchServlet @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		String searchquery = request.getParameter("search");
		ReturnJokes randomJoke = new ReturnJokes();
		String joke;
		try {
			joke = randomJoke.getRandomJoke(searchquery);
			
			request.setAttribute("joke", joke);
			//System.out.println(joke);
			
			request.getRequestDispatcher("/chuck.jsp").forward(request, response);
			
			/* PrintWriter writer = response.getWriter();
            
            String htmlResponse = "<html>";
            htmlResponse += "<p>" + joke + "</p>";
            htmlResponse += "</html>";
            
            writer.print(htmlResponse);   */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
