package control;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import listener.ServletSListener;
import model.Sight;
import model.advHandler;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class advServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public advServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		String[] s=request.getParameterValues("city");
		advHandler adv = new advHandler();
		ArrayList<Sight> sights = (ArrayList<Sight>) getServletContext().getAttribute(adv.firstRoll(s));
		ServletSListener.addList(adv.secindRoll(sights));
		ServletSListener.setCityList(s);
		String[] t=null;
		t=s;
		for(String k:t) {
			 System.out.println(k);
		}
		
		//RequestDispatcher view = request.getRequestDispatcher("adv.jsp");
		//view.forward(request, response);
		}catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
		response.sendRedirect("adv.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
