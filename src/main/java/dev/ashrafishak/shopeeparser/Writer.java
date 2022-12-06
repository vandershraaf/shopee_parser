package dev.ashrafishak.shopeeparser;

import dev.ashrafishak.shopeeparser.output.OrderOutput;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.List;

public class Writer {

    public void writeExcel(File outputFolder, List<OrderOutput> outputs){
        int rowNum = 0;
        OutputStream fileOut = null;
        Workbook wb = new XSSFWorkbook();
        try {
            fileOut = new FileOutputStream(outputFolder.getAbsolutePath() + "/" + "output.xlsx");
            Sheet sheet = wb.createSheet("Main");
            // Header row
            Row headerRow = sheet.createRow(rowNum);
            headerRow.createCell(0).setCellValue("Date");
            headerRow.createCell(1).setCellValue("Amount");
            headerRow.createCell(2).setCellValue("Item");
            rowNum++;
            for (OrderOutput orderOutput: outputs){
                for (int i = 0; i < orderOutput.getItems().size(); i++){
                    Row row = sheet.createRow(rowNum);
                    if (i == 0){
                        row.createCell(0).setCellValue(orderOutput.getDate());
                        row.createCell(1).setCellValue(orderOutput.getTotalAmount());
                    }
                    row.createCell(2).setCellValue(orderOutput.getItems().get(0));
                    rowNum++;
                }
            }
            wb.write(fileOut);
            wb.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void writeText(File outputFolder, List<OrderOutput> outputs){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFolder + "/" + "output.txt"));
            bufferedWriter.write("Date\t\t||\tAmount\t||\tItem");
            bufferedWriter.newLine();
            for (OrderOutput orderOutput: outputs){
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < orderOutput.getItems().size(); i++){
                    if (i == 0){
                        if (orderOutput.getDate().equals("N/A")){
                            stringBuffer.append("N/A       ");
                            stringBuffer.append("\t\t");
                        } else {
                            stringBuffer.append(orderOutput.getDate());
                            stringBuffer.append("\t\t");
                        }
                        stringBuffer.append(orderOutput.getTotalAmount());
                        stringBuffer.append("\t\t");
                    } else {
                        stringBuffer.append("          ");
                        stringBuffer.append("\t\t");
                        stringBuffer.append("      ");
                        stringBuffer.append("\t\t");
                    }
                    stringBuffer.append(orderOutput.getItems().get(i));
                    stringBuffer.append("\n");
                }
                bufferedWriter.write(stringBuffer.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
