package java_tasks;

import org.apache.poi.ss.usermodel.Sheet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class Print_result {
    public static void print_result2(ResultSet result) throws SQLException, IOException {

        Excel_con excon = new Excel_con();
        Sheet sheet = excon.create_sheet("number2");
        String[] str = new String [] {"string1","string2","len_string1","len_string2","string_sum","comparison"};
        excon.excel_add(sheet, 2, str, 0);
        int k = 1;
        while(result.next())
        {
            for (int i = 1; i < 7; i++) {
                System.out.println(Arrays.toString(result.getString(i).split(" ")));
                str[i-1] = result.getString(i);
            }
            excon.excel_add(sheet, 2, str, k);
            System.out.println();
            k++;
        }
    }

    public static void print_result3(ResultSet result) throws IOException, SQLException {
        Excel_con excon = new Excel_con();
        Sheet sheet = excon.create_sheet("number3");
        String[] str = new String [] {"number", "description"};
        excon.excel_add(sheet, 3, str, 0);
        int k = 1;
        while(result.next())
        {
            for (int i = 1; i < 3; i++) {
                System.out.println(Arrays.toString(result.getString(i).split(" ")));
                str[i-1] = result.getString(i);
            }
            excon.excel_add(sheet, 3, str, k);
            System.out.println();
            k++;
        }

    }

    public static void print_result4(ResultSet result) throws IOException, SQLException {
        Excel_con excon = new Excel_con();
        Sheet sheet = excon.create_sheet("number4");
        String[] str = new String [] {"string1", "string2", "substring1", "substring2", "lower1", "lower2", "upper1", "upper2", "endswith1", "endwith2"};
        excon.excel_add(sheet, 4, str, 0);
        int k = 1;
        while(result.next())
        {
            for (int i = 1; i < 11; i++) {
                System.out.println(Arrays.toString(result.getString(i).split(" ")));
                str[i-1] = result.getString(i);
            }
            excon.excel_add(sheet, 4, str, k);
            System.out.println();
            k++;
        }

    }

    public static void print_result1(ResultSet rs) throws IOException, SQLException {
        Excel_con excon = new Excel_con();
        Sheet sheet = excon.create_sheet("number1");
        String[] str = new String [] {"value1", "operation", "value2", "answer"};
        excon.excel_add(sheet, 1, str, 0);
        int k = 1;
        while(rs.next())
        {
            for (int i = 1; i < 5; i++) {
                String output = rs.getString(i);
                if(output == null){
                    output = "";
                }
                System.out.println(Arrays.toString(output.split(" ")));
                str[i-1] = output;
            }
            excon.excel_add(sheet, 1, str, k);
            System.out.println();
            k++;
        }

    }

    public static void print_result5(ResultSet rs) throws IOException, SQLException {
        Excel_con excon = new Excel_con();
        Sheet sheet = excon.create_sheet("number5");
        String[] str = new String [] {"string1", "string2", "reverse1", "reverse2", "append"};
        excon.excel_add(sheet, 5, str, 0);
        int k = 1;
        while(rs.next())
        {
            for (int i = 1; i < 6; i++) {
                System.out.println(Arrays.toString(rs.getString(i).split(" ")));
                str[i-1] = rs.getString(i);
            }
            excon.excel_add(sheet, 5, str, k);
            System.out.println();
            k++;
        }
    }
}
