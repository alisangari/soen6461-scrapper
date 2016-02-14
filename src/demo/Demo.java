package demo;

import java.util.ArrayList;

import utility.Exporter;
import utility.FileOps;
import utility.Parser;
import contract.Constants;
import domain.AppInfo;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> urls = FileOps
				.readTextFileToArrayList(Constants.CSV_PATH);

		ArrayList<AppInfo> appInfoList = new ArrayList<AppInfo>();

		for (String url : urls) {
			System.out.println("Scrapping "+url);
			appInfoList.add(Parser.extract(url));
		}

		Exporter.exportToCsv(appInfoList);
		System.out.println("Done!");

	}

}
