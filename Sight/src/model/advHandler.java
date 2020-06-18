package model;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletContext;

import listener.ServletSListener;
import listener.ServletListener;
import model.Sight;
public class advHandler {
	private String[] cityName= {"taipei","newtaipei","taoyuan","taichung","tainan","kaohsiung",
			                    "keelung","hsinchucity","chiayicity",
			                    "hsinchucounty","miaolicounty","changhuacounty","nantoucounty","yunlincounty",
			                    "chiayicounty","pingtungcounty","yilancounty","hualiencounty","taitungcounty",
			                    "penghucounty","kinmencounty","lienchiangcounty"
	                           };
	public String firstRoll() {
		Random rand = new Random(); 
		
		return cityName[rand.nextInt(22)];
	}
	public Sight secindRoll(ArrayList<Sight> sights) {
		
		Random rand = new Random();
		return sights.get(rand.nextInt(sights.size()));
	}
}
