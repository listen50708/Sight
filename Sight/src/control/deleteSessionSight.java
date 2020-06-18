package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import listener.ServletSListener;
import model.Sight;
/**
 * Servlet implementation class deleteSessionSight
 */
@WebServlet("/deleteSessionSight")
public class deleteSessionSight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteSessionSight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i= Integer.parseInt(request.getParameter("key"));
		ServletSListener.deleteList(i);
		RequestDispatcher view = request.getRequestDispatcher("adv.jsp");
		view.forward(request, response);
		
	}

}
