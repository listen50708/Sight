package listener;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.Sight;

/**
 * Application Lifecycle Listener implementation class WebServlet
 *
 */
@WebListener
public class ServletSListener implements HttpSessionListener {
	ArrayList<Sight>record=new ArrayList<Sight>();
    /**
     * Default constructor. 
     */
	private static int on=0;
	private static ArrayList<Sight> adventureList=new ArrayList<Sight>();
	private static String[] cityList=null;
    public ServletSListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	on++;
    	//ServletSession ss=se.getSession();
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	on--;
    	adventureList.clear();
         // TODO Auto-generated method stub
    }
    public static int getOnlineNumber() {
    	return on;
    }
	public static void addList(Sight sight) {
		adventureList.add(sight);
	}
	public static void deleteList(int i) {
		adventureList.remove(i);
	}
	public static ArrayList<Sight> getList() {
		
		return adventureList;
	}
    public static void setCityList(String[] c) {
		cityList=c;
	}
	public static String[] getCityList() {
		
		return cityList;
	}
}
