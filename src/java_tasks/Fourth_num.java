package java_tasks;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Fourth_num {
    public static void main_operation(String myurl, String login, String password, String tablename) throws SQLException{
        Scanner scan = new Scanner(System.in);
        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
        PreparedStatement stmt = con.Insert_into(tablename, 4);
        System.out.println("Введите первую строку");
        String a = scan.nextLine();
        System.out.println("Введите вторую строку");
        String b = scan.nextLine();
        System.out.println("Введите первый идекс для поиска подстроки");
        int ind1 = scan.nextInt();
        System.out.println("Введите второй идекс для поиска подстроки");
        int ind2 = scan.nextInt();
        String substring1 = a.substring(ind1, ind2);
        String substring2 = b.substring(ind1, ind2);
        String lower1 = a.toLowerCase();
        String lower2 = b.toLowerCase();
        String upper1 = a.toUpperCase();
        String upper2 = b.toUpperCase();

        scan.nextLine();
        System.out.println("Введите подстроку");
        String str = scan.nextLine();

        boolean first_str = a.endsWith(str);
        boolean second_str = b.endsWith(str);

        stmt.setString(1, a);
        stmt.setString(2, b);
        stmt.setString(3, substring1);
        stmt.setString(4, substring2);
        stmt.setString(5, lower1);
        stmt.setString(6, lower2);
        stmt.setString(7, upper1);
        stmt.setString(8, upper2);
        stmt.setBoolean(9, first_str);
        stmt.setBoolean(10, second_str);
        stmt.executeUpdate();
    }
}
