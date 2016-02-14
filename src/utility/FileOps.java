package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class FileOps {

	public static ArrayList<String> readTextFileToArrayList(String path) {
		ArrayList<String> content = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				content.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}
	
	public static boolean write(String fName, ArrayList<String> strs) {
		try {
			PrintWriter writer = new PrintWriter(fName, "UTF-8");
			for (int i = 0; i < strs.size(); i++) {
				writer.println(strs.get(i));
			}
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
