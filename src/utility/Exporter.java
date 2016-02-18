package utility;

import java.util.ArrayList;

import contract.Constants;
import domain.AppInfo;

public class Exporter {

	public static void exportToCsv(ArrayList<AppInfo> appInfoList) {

		ArrayList<String> content = new ArrayList<String>();
		content.add("name, score");
		for (AppInfo appInfo : appInfoList) {
			content.add(appInfo.getName() + ", " + appInfo.getScore());
		}

		FileOps.write(Constants.OUTPUT_CSV_PATH, content);
	}

	public static void exportToXML(ArrayList<AppInfo> appInfoList) {

		ArrayList<String> content = new ArrayList<String>();
		content.add("<apps>");
		for (AppInfo appInfo : appInfoList) {
			content.add("<app>");
			content.add("<name>");
			content.add(appInfo.getName());
			content.add("</name>");
			content.add("<score>");
			content.add(appInfo.getScore());
			content.add("</score>");
			content.add("</app>");

		}
		content.add("</apps>");

		FileOps.write(Constants.OUTPUT_XML_PATH, content);
	}
}
