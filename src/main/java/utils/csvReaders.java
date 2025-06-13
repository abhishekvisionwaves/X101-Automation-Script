package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class csvReaders
{
	 public static List<Map<String, String>> readCSVWithHeaders(String filePath) {
	        List<Map<String, String>> records = new ArrayList<>();

	        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
	            List<String[]> data = reader.readAll();
	            
	            if (data.isEmpty()) {
	                System.out.println("CSV file is empty.");
	                return records;
	            }

	            // Extract headers (first row)
	            String[] headers = data.get(0);

	            // Read data rows and map to headers
	            for (int i = 1; i < data.size(); i++) {
	                String[] row = data.get(i);
	                Map<String, String> rowMap = new HashMap<>();

	                for (int j = 0; j < headers.length && j < row.length; j++) {
	                    rowMap.put(headers[j], row[j]);  // Mapping column name to value
	                }
	                records.add(rowMap);
	            }
	        } catch (IOException | CsvException e) {
	            e.printStackTrace();
	        }
	        return records;
	    }

}
