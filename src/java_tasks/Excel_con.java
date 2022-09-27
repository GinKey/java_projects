package java_tasks;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;


public class Excel_con {
    Workbook book;

    public Excel_con(){
        this.book = new HSSFWorkbook();
    }

    public Sheet create_sheet(String name){
        Sheet sheet = this.book.createSheet(name);
        return sheet;
    }
    public void excel_add(Sheet sheet, int number, String[] output, int k) throws IOException {
        if (number == 1)
        {
            Row row = sheet.createRow(k);
            Cell value1 = row.createCell(0);
            Cell operation = row.createCell(1);
            Cell value2 = row.createCell(2);
            Cell answer = row.createCell(3);

            value1.setCellValue(output[0]);
            operation.setCellValue(output[1]);
            value2.setCellValue(output[2]);
            answer.setCellValue(output[3]);

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            System.out.println();
            this.book.write(new FileOutputStream("First.xls"));
            this.book.close();
        }
        else if (number == 2)
        {
            Row row = sheet.createRow(k);
            Cell string1 = row.createCell(0);
            Cell string2 = row.createCell(1);
            Cell len_string1 = row.createCell(2);
            Cell len_string2 = row.createCell(3);
            Cell string_sum = row.createCell(4);
            Cell comparison = row.createCell(5);

            string1.setCellValue(output[0]);
            string2.setCellValue(output[1]);
            len_string1.setCellValue(output[2]);
            len_string2.setCellValue(output[3]);
            string_sum.setCellValue(output[4]);
            comparison.setCellValue(output[5]);

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            sheet.autoSizeColumn(5);
            System.out.println();
            this.book.write(new FileOutputStream("Second.xls"));
            this.book.close();
        }
        else if (number == 3)
        {
            Row row = sheet.createRow(k);
            Cell num = row.createCell(0);
            Cell description = row.createCell(1);

            num.setCellValue(output[0]);
            description.setCellValue(output[1]);

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            System.out.println();
            this.book.write(new FileOutputStream("Third.xls"));
            this.book.close();
        }
        else
        {
            Row row = sheet.createRow(k);
            Cell string1 = row.createCell(0);
            Cell string2 = row.createCell(1);
            Cell substring1 = row.createCell(2);
            Cell substring2 = row.createCell(3);
            Cell lower1 = row.createCell(4);
            Cell lower2 = row.createCell(5);
            Cell upper1 = row.createCell(6);
            Cell upper2 = row.createCell(7);
            Cell endswith1 = row.createCell(8);
            Cell endswith2 = row.createCell(9);

            string1.setCellValue(output[0]);
            string2.setCellValue(output[1]);
            substring1.setCellValue(output[2]);
            substring2.setCellValue(output[3]);
            lower1.setCellValue(output[4]);
            lower2.setCellValue(output[5]);
            upper1.setCellValue(output[6]);
            upper2.setCellValue(output[7]);
            endswith1.setCellValue(output[8]);
            endswith2.setCellValue(output[9]);

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            sheet.autoSizeColumn(5);
            sheet.autoSizeColumn(6);
            sheet.autoSizeColumn(7);
            sheet.autoSizeColumn(8);
            sheet.autoSizeColumn(9);

            System.out.println();
            this.book.write(new FileOutputStream("Fourth.xls"));
            this.book.close();
        }

    }
}
