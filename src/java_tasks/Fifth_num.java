package java_tasks;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Fifth_num {
    public static void main_operation(String myurl, String login, String password, String tablename) throws SQLException {

        Scanner scan = new Scanner(System.in);
        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
        PreparedStatement stmt = con.Insert_into(tablename, " (string1, string2, reverse1, reverse2, append) VALUES (?, ?, ?, ?, ?)");
        System.out.println("Введите первую строку");
        String str = scan.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scan.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer(str2);
        stringBuffer.reverse();
        stringBuffer2.reverse();

        stmt.setString(1, str);
        stmt.setString(2, str2);
        stmt.setString(3, stringBuffer.toString());
        stmt.setString(4, stringBuffer2.toString());
        stmt.setString(5, stringBuffer.append(stringBuffer2).toString());
        stmt.executeUpdate();


    }
}
