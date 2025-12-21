package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtil 
{
	public static List<String[]> readCSV(String filePath) throws IOException {
		List<String[]> data = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		br.readLine();

		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			data.add(values);
		}
		br.close();
		return data;
	}
}