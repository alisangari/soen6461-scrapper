package utility;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import domain.AppInfo;


public class Parser {

	public static AppInfo extract(String url) {
		try {
			Document doc = Jsoup.connect(url).get();
			AppInfo appInfo = new AppInfo();
			appInfo.setName(doc.getElementsByClass("id-app-title").first()
					.text());
			appInfo.setScore(doc.getElementsByClass("score").first().text());
			return appInfo;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
