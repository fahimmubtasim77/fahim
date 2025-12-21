package utils;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil 
{
	public static void writeToFile(String fileName, String content) {
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}