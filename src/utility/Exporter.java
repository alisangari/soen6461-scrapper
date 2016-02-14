package utility;

import java.util.ArrayList;

import contract.Constants;
import domain.AppInfo;

public class Exporter {

	public static void exportToCsv(ArrayList<AppInfo> appInfoList){
		
		ArrayList<String> content = new ArrayList<String>();
		content.add("name, score");
		for(AppInfo appInfo : appInfoList){
			content.add(appInfo.getName()+", "+appInfo.getScore());
		}
		
		FileOps.write(Constants.OUTPUT_CSV_PATH, content);
	}
}
