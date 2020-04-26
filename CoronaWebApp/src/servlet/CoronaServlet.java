package servlet;

import java.io.IOException;
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
			default:
				listCorona(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listCorona(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Corona> listCorona = coronaDAO.selectAllCoronas();
		request.setAttribute("listCorona", listCorona);
		RequestDispatcher dispatcher = request.getRequestDispatcher("corona-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("add-corona.jsp");
		dispatcher.forward(request, response);
	}

	
}

