package model;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletContext;

import listener.ServletSListener;
import listener.ServletListener;
import model.Sight;
public class advHandler {

	public String firstRoll(String[] cityName) {
		Random rand = new Random(); 
		
		return cityName[rand.nextInt(cityName.length)];
	}
	public Sight secindRoll(ArrayList<Sight> sights) {
		
		Random rand = new Random();
		return sights.get(rand.nextInt(sights.size()));
	}
}
