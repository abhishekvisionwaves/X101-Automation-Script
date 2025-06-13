package utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetQuestionsFromExcel {

	// Reads all questions from column A (index 0) using sheet index
	public static List<String> getQuestionsFromExcel(String filePath, int sheetIndex) {
		List<String> questions = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {

			// Get the sheet by index
			Sheet sheet = workbook.getSheetAt(sheetIndex);

			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Column A
				if (cell != null && cell.getCellType() == CellType.STRING) {
					String question = cell.getStringCellValue().trim();
					if (!question.isEmpty()) {
						questions.add(question);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return questions;
	}
}
