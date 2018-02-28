package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Player;
import model.Team;

/**
 * Servlet implementation class addPlayerServlett
 */
@WebServlet("/addPlayerServlet")
public class addPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		String pn = request.getParameter("phoneNumber");
		String sn = request.getParameter("screenName");
		String tn = request.getParameter("teamName");
		
		PlayerHelper ph = new PlayerHelper();
		Player p = new Player(fn, ln, pn, sn);
		ph.insertPlayer(p);
		
		getServletContext().getRequestDispatcher("/addPlayer.html").forward(request, response);
	}

}
