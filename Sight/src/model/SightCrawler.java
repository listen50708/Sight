package model;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.ArrayList;

public class SightCrawler {
	String Url="https://www.travelking.com.tw/tourguide/taiwan/";
	public ArrayList<Sight> getItems(String cityName) throws IOException{
		ArrayList<Sight> sights = new ArrayList();
		String site = "https://www.travelking.com.tw";
		Document document = Jsoup.connect("https://www.travelking.com.tw/tourguide/taiwan/" + cityName)
				.userAgent("\"Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
				.timeout(100000000)
				.get();
		Elements elements = document.body().select("#wrapper >#content>div>#guide-point>div.box>ul>li>a");
		// System.out.println(elements);
		System.out.println("start");
		int i = 0;
		for (Element element : elements) {

			// System.out.println(site + element.attr("href"));
			Document document2 = Jsoup.connect(site + element.attr("href"))
					.userAgent("\"Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
					.timeout(100000000).get();
			// Elements nametemp = document2.select("#webarea > div.left >
			// div#point_area>meta[itemprop=name]");
			String SightName = element.text();

			String Zone = document2.select("#wrapper > #content>div>ol.breadcrumb>li.bc_last>a").text();

			String Category = document2
					.select("#wrapper > #content>div>div>div>div>#point_area>cite>.point_type>span>strong").text();

			Elements phototemp = document2
					.select("#wrapper > #content>div>div>div>div>#point_area>meta[itemprop=image]");
			String PhotoURL = phototemp.attr("content");

			Elements destemp = document2
					.select("#wrapper > #content>div>div>div>div>#point_area>meta[itemprop=description]");
			String Description = destemp.attr("content");

			Elements addresstemp = document2
					.select("#wrapper > #content>div>div>div>div>#point_area>meta[itemprop=address]");
			String Address = addresstemp.attr("content");

			System.out.println(".");
			// System.out.println(Category);
			Sight temp = new Sight(SightName, Zone, Category, PhotoURL, Description, Address);
			sights.add(temp);
			i++;
		}
		
		return sights;
	}

}
