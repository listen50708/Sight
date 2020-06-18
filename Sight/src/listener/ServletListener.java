package listener;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import model.Sight;
import model.SightCrawler;

/**
 * Application Lifecycle Listener implementation class ServletListener
 *
 */
@WebListener
public class ServletListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    	ServletContext sc = event.getServletContext();
    	SightCrawler crawler = new SightCrawler();
		
		try {
			long startTime = System.currentTimeMillis();
			//ArrayList<Sight> taipeiSights = crawler.getItems("taipei-city/");
			//sc.setAttribute("taipei", taipeiSights);
			ArrayList<Sight> newtaipeiSights = crawler.getItems("newtaipei-city/");
			sc.setAttribute("newtaipei", newtaipeiSights);
			ArrayList<Sight> taoyuanSights = crawler.getItems("taoyuan-city/");
			sc.setAttribute("taoyuan", taoyuanSights);
			/*ArrayList<Sight> taichungSights = crawler.getItems("taichung-city/");
			sc.setAttribute("taichung", taichungSights);
			ArrayList<Sight> tainanSights = crawler.getItems("tainan-city/");
			sc.setAttribute("tainan", tainanSights);
			ArrayList<Sight> kaohsiungSights = crawler.getItems("kaohsiung-city/");
			sc.setAttribute("kaohsiung", kaohsiungSights);
			ArrayList<Sight> keelungSights = crawler.getItems("keelungcity/");
			sc.setAttribute("keelung", keelungSights);
			ArrayList<Sight> hsinchuSights = crawler.getItems("hsinchucity/");
			sc.setAttribute("hsinchucity", hsinchuSights);
			ArrayList<Sight> hsinchucountySights = crawler.getItems("hsinchucounty/");
			sc.setAttribute("hsinchucounty", hsinchucountySights);
			ArrayList<Sight> miaolicountySights = crawler.getItems("miaolicounty/");
			sc.setAttribute("miaolicounty", miaolicountySights);
			ArrayList<Sight> changhuacountySights = crawler.getItems("changhuacounty/");
			sc.setAttribute("changhuacounty", changhuacountySights);
			ArrayList<Sight> nantoucountySights = crawler.getItems("nantoucounty/");
			sc.setAttribute("nantoucounty", nantoucountySights);
			ArrayList<Sight> yunlincountySights = crawler.getItems("yunlincounty/");
			sc.setAttribute("yunlincounty", yunlincountySights);
			ArrayList<Sight> chiayicountySights = crawler.getItems("chiayicounty/");
			sc.setAttribute("chiayicounty", chiayicountySights);
			ArrayList<Sight> chiayicitySights = crawler.getItems("chiayicity/");
			sc.setAttribute("chiayicity", chiayicitySights);
			ArrayList<Sight> pingtungcountySights = crawler.getItems("pingtungcounty/");
			sc.setAttribute("pingtungcounty", pingtungcountySights);
			ArrayList<Sight> yilancountySights = crawler.getItems("yilancounty/");
			sc.setAttribute("yilancounty", yilancountySights);
			ArrayList<Sight> hualiencountySights = crawler.getItems("hualiencounty/");
			sc.setAttribute("hualiencounty", hualiencountySights);
			ArrayList<Sight> taitungcountySights = crawler.getItems("taitungcounty/");
			sc.setAttribute("taitungcounty", taitungcountySights);
			ArrayList<Sight> penghucountySights = crawler.getItems("penghucounty/");
			sc.setAttribute("penghucounty", penghucountySights);
			ArrayList<Sight> kinmencountySights = crawler.getItems("kinmencounty/");
			sc.setAttribute("kinmencounty", kinmencountySights);
			ArrayList<Sight> lienchiangcountySights = crawler.getItems("lienchiangcounty/");
			sc.setAttribute("lienchiangcounty", lienchiangcountySights);
			*/
			System.out.println("Using Time:" + (System.currentTimeMillis() - startTime) + " ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
	
}
