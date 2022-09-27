package java_tasks;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class First_num {

    public static void main_operation(String myurl, String login, String password, String tablename) throws SQLException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        int int_num1 = scan.nextInt();
        System.out.println("Введите второе число");
        int int_num2 = scan.nextInt();

        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
        PreparedStatement stmt = con.Insert_into(tablename, 1);

        int[] myArray = new int[9];
        myArray[0] = int_num1 + int_num2;
        System.out.println("Сложение:" + myArray[0]);
        myArray[1] = int_num1 - int_num2;
        System.out.println("Вычитание: " + myArray[1]);
        myArray[2] = int_num1 * int_num2;
        System.out.println("Умножение: " + myArray[2]);
        myArray[3] = int_num1 / int_num2;
        System.out.println("Деление: " + myArray[3]);
        myArray[4] = int_num1 % int_num2;
        System.out.println("Остаток от деления: " + myArray[4]);
        System.out.println("Модуль числа1: " + (Math.abs(int_num1)));
        myArray[5] = Math.abs(int_num1);
        System.out.println("Модуль числа2: " + (Math.abs(int_num2)));
        myArray[6] = Math.abs(int_num2);
        System.out.println("Степень числа1: " + (Math.pow(int_num1, 2)));
        myArray[7] = (int) Math.pow(int_num1, 2);
        System.out.println("Степень числа2: " + (Math.pow(int_num2, 2)));
        myArray[8] = (int) Math.pow(int_num2, 2);

        String[] myarray2 = {"Сложение", "Вычитание", "Умножение", "Деление", "Остаток от деления",
                "Модуль числа1", "Модуль числа2", "Степень числа1", "Степень числа2"};

        for(int i=0; i<9; i++) {

            if(i > 4 && i%2!=0)
            {
                stmt.setInt(1, int_num1);
                stmt.setString(2, myarray2[i]);
                stmt.setNull(3, int_num2);
                stmt.setInt(4, myArray[i]);
                stmt.executeUpdate();
            }
            else if (i > 4)
            {
                stmt.setNull(1, int_num1);
                stmt.setString(2, myarray2[i]);
                stmt.setInt(3, int_num2);
                stmt.setInt(4, myArray[i]);
                stmt.executeUpdate();

            }
            else {
                stmt.setInt(1, int_num1);
                stmt.setString(2, myarray2[i]);
                stmt.setInt(3, int_num2);
                stmt.setInt(4, myArray[i]);
                stmt.executeUpdate();

            }
        }

    }
}
