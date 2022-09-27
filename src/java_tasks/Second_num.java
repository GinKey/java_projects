package java_tasks;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Second_num {
    public static void main_operation(String myurl, String login, String password, String tablename) throws SQLException {

        Scanner scan = new Scanner(System.in);
        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
        PreparedStatement stmt = con.Insert_into(tablename, 2);
        System.out.println("Введите первую строку");
        String a = scan.nextLine();
        System.out.println("Введите вторую строку");
        String b = scan.nextLine();
        int lenght1 = a.length();
        int lenght2 = b.length();
        String comparison;
        if (lenght1>lenght2){
            comparison = "Строка1 > Строка2";
        }
        else if(lenght1<lenght2){
            comparison = "Строка1 < Строка2";
        }
        else
        {
            comparison = "Строка1 = Строка2";
        }

        stmt.setString(1, a);
        stmt.setString(2, b);
        stmt.setInt(3, lenght1);
        stmt.setInt(4, lenght2);
        stmt.setString(5, a+b);
        stmt.setString(6, comparison);
        stmt.executeUpdate();

    }

}
