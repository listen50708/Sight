package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.jsoup.*;
import model.Sight;
import model.SightCrawler;

/**
 * Servlet implementation class GetSightServlet
 */
//@WebServlet("/GetSightServlet")
public class GetSightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		response.setContentType("text/html;charset=UTF-8");
		String city=request.getParameter("city");
		ArrayList<Sight>sights=(ArrayList<Sight>) getServletContext().getAttribute(city);
		response.getWriter().println(city);
		System.out.println(city);
		request.setAttribute("sightList", sights);
		RequestDispatcher view = request.getRequestDispatcher("sights.jsp");
		view.forward(request, response);
		}catch (NullPointerException npe) {
		    System.out.println(npe.toString());
		    // It's fine if findUser throws a NPE
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
/*
 * 
 * 
taipei-city/
newtaipei-city/
taoyuan-city/
taichung-city/
tainan-city/
kaohsiung-city/
keelungcity/
hsinchucity/
hsinchucounty/
miaolicounty/
changhuacounty/
nantoucounty/
yunlincounty/
chiayicounty/
chiayicity/
pingtungcounty/
yilancounty/
hualiencounty/
taitungcounty/
penghucounty/
kinmencounty/
lienchiangcounty/
 * 
 * 
 * */
}
