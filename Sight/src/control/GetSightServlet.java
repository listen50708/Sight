package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import org.jsoup.*;
import model.Sight;
import model.SightCrawler;

/**
 * Servlet implementation class GetSightServlet
 */
@WebServlet("/GetSightServlet")
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
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html");
		response.setContentType("application/json");
		ArrayList<Sight>sight = new ArrayList<Sight>();
		Gson gson=new Gson();
		PrintWriter out = response.getWriter();
		String data=gson.toJson(sight);
		//System.out.println(data);
		out.println(data);
		System.out.println("end");
		out.flush();
		out.close();
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
