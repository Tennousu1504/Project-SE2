package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CoronaDAO;
import model.Corona;


/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/")
public class CoronaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CoronaDAO coronaDAO;
	
	public void init() {
		coronaDAO = new CoronaDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertCorona(request,response);
				break;
			case "/login":
				loginForm(request,response);
				break;
			case "/access":
				loginCorona(request,response);
				break;
			case "/edit":
				showEditForm(request,response);
				break;
			case "/update":
				updateCorona(request,response);
				break;
			case "/delete":
				deleteCorona(request,response);
				break;
			case "/":
				guestListCorona(request,response);
				break;
			default:
				listCorona(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
     private void loginCorona(HttpServletRequest request, HttpServletResponse response) 
    		 throws SQLException, IOException, ServletException {
    	String yourName = request.getParameter("yourName"); // get parameter in jsp(html)
 	    String passWord = request.getParameter("passWord"); // get parameter in jsp(html)
 		 PrintWriter writer = response.getWriter(); // write to html, if use
 		String username = "nhan"; // declare user name and password, next tut will use database(must import java.io.PrintWriter;)
 		String password = "Nhan123";
 		if (yourName.equals(username)&&passWord.equals(password)) { // compare with username and password
 		writer.println("<h1>Hello " + yourName + "</h1>"); // print to html
 		writer.println("Welcome to join");
 		List<Corona> listCorona = coronaDAO.selectAllCoronas();
		request.setAttribute("listCorona", listCorona);
 		RequestDispatcher dispatcher = request.getRequestDispatcher("corona-list.jsp");
		dispatcher.forward(request, response);
 		} else {
 			writer.println(" Your username or password is incorrect");// if use sout it will print to console
 		    }
 		writer.close();
 		
 		
     }
	private void listCorona(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Corona> listCorona = coronaDAO.selectAllCoronas();
		request.setAttribute("listCorona", listCorona);
		RequestDispatcher dispatcher = request.getRequestDispatcher("corona-list.jsp");
		dispatcher.forward(request, response);
	}
	private void guestListCorona(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Corona> listCorona = coronaDAO.selectAllCoronas();
		request.setAttribute("listCorona", listCorona);
		RequestDispatcher dispatcher = request.getRequestDispatcher("corona-guestlist.jsp");
		dispatcher.forward(request, response);
	}
	private void loginForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("corona-add.jsp");
		dispatcher.forward(request, response);
	}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String iso_code = request.getParameter("iso_code");
		Corona existCorona = coronaDAO.selectCorona(iso_code);
		RequestDispatcher dispatcher = request.getRequestDispatcher("corona-edit.jsp");
		request.setAttribute("corona", existCorona);
		dispatcher.forward(request, response);

	}
	private void insertCorona(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String iso_code = request.getParameter("iso_code");
		String location = request.getParameter("location");
		String date = request.getParameter("date");
		String total_cases = request.getParameter("total_cases");
		String new_cases = request.getParameter("new_cases");
		String total_deaths = request.getParameter("total_deaths");
		String new_deaths = request.getParameter("new_deaths");
		String total_cases_per_million = request.getParameter("total_cases_per_million");
		String new_cases_per_million = request.getParameter("new_cases_per_million");
		String total_deaths_per_million = request.getParameter("total_deaths_per_million");
		String new_deaths_per_million = request.getParameter("new_deaths_per_million");
//		String total_tests = request.getParameter("total_tests");
//		String new_tests = request.getParameter("new_tests");
//		String total_tests_per_thousand = request.getParameter("total_tests_per_thousand");
//		String new_tests_per_thousand = request.getParameter("new_tests_per_thousand");
//		String tests_units = request.getParameter("tests_units");
		Corona newCorona = new Corona(iso_code, location, date, total_cases, new_cases,total_deaths,new_deaths, total_cases_per_million, 
				                       new_cases_per_million, total_deaths_per_million, new_deaths_per_million
//				                       , total_tests,
//				                       new_tests, total_tests_per_thousand,new_tests_per_thousand, tests_units 
				                       );
		coronaDAO.insertCorona(newCorona);
		response.sendRedirect("list");
	}
	private void updateCorona(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String iso_code = request.getParameter("iso_code");
		String location = request.getParameter("location");
		String date = request.getParameter("date");
		String total_cases = request.getParameter("total_cases");
		String new_cases = request.getParameter("new_cases");
		String total_deaths = request.getParameter("total_deaths");
		String new_deaths = request.getParameter("new_deaths");
		String total_cases_per_million = request.getParameter("total_cases_per_million");
		String new_cases_per_million = request.getParameter("new_cases_per_million");
		String total_deaths_per_million = request.getParameter("total_deaths_per_million");
		String new_deaths_per_million = request.getParameter("new_deaths_per_million");
//		String total_tests = request.getParameter("total_tests");
//		String new_tests = request.getParameter("new_tests");
//		String total_tests_per_thousand = request.getParameter("total_tests_per_thousand");
//		String new_tests_per_thousand = request.getParameter("new_tests_per_thousand");
//		String tests_units = request.getParameter("tests_units");
		Corona newCorona = new Corona(iso_code, location, date, total_cases, new_cases,total_deaths,new_deaths, total_cases_per_million, 
				                       new_cases_per_million, total_deaths_per_million, new_deaths_per_million
//				                       , total_tests,
//				                       new_tests, total_tests_per_thousand,new_tests_per_thousand, tests_units 
				                       );
		try {
			coronaDAO.updateCorona(newCorona);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		response.sendRedirect("list");
		
	}
	private void deleteCorona(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		String iso_code = request.getParameter("iso_code");
		coronaDAO.deleteCorona(iso_code);
		response.sendRedirect("list");
		
	}
}

