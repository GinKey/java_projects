package java_tasks;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Third_num {
    public static void main_operation(String myurl, String login, String password, String tablename) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 'stop' для завершения");
        System.out.println("Введите число или 'stop'");
        String str = scan.nextLine();
        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
        PreparedStatement stmt = con.Insert_into(tablename, 3);
        while (!"stop".equals(str))
        {
            try {
                int num = Integer.parseInt(str);
                if(num % 2 == 0){
                    stmt.setInt(1, num);
                    stmt.setString(2, "Число четное");
                    stmt.executeUpdate();
                }
                else{
                    stmt.setInt(1, num);
                    stmt.setString(2, "Число нечетное");
                    stmt.executeUpdate();
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка неправильный ввод!");
            }
            System.out.println("Введите число или 'stop'");
            str = scan.nextLine();
        }
    }
}
