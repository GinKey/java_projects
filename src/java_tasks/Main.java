package java_tasks;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";
        System.out.println("Введите название таблицы: ");
        String tablename = scan.nextLine();
        System.out.println("Какую задачу решаем от 1 до 4?");
        int number  = scan.nextInt();

        while (!"4".equals(s)) {

            System.out.println("1. Вывести все таблицы из текущей БД.");
            System.out.println("2. Создать таблицу в БД.");
            System.out.println("3. Добавить данные в таблицу.");
            System.out.println("4. Выйти из программы.");
            s = scan.next();

            try
            {
                x = Integer.parseInt(s);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неверный формат ввода.");
            }

            String configFilePath = "src/config.properties";
            FileInputStream propsInput = new FileInputStream(configFilePath);
            Properties prop = new Properties();
            prop.load(propsInput);
            String myurl = prop.getProperty("myurl");
            String login = prop.getProperty("login");
            String password = prop.getProperty("password");


            switch (x) {
                case 1 -> {
                    Mysqlconnection con = new Mysqlconnection(myurl, login, password);
                    System.out.println("Успешно законнектились к БД!");
                    ResultSet rs = con.execute("show tables");
                    System.out.println("Таблицы из текущей БД: ");
                    Mysqlconnection.print_result(rs);
                }
                case  2 ->{
                    Mysqlconnection con = new Mysqlconnection(myurl, login, password);
                    System.out.println("Успешно законнектились к БД!");
                    con.Create_table(tablename, number);
                    ResultSet rs = con.execute("show tables");
                    System.out.println("Таблицы из текущей БД: ");
                    Mysqlconnection.print_result(rs);
                }
                case  3 -> {

                    System.out.println("Успешно законнектились к БД!");
                    if (number == 1)
                    {
                        First_num.main_operation(myurl, login, password, tablename);
                        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
                        ResultSet rs = con.execute("SELECT * FROM " + tablename);
                        System.out.println("Данные из текущей БД: ");
                        Print_result.print_result1(rs);
                    }
                    else if (number == 2)
                    {
                        Second_num.main_operation(myurl, login, password, tablename);
                        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
                        ResultSet rs = con.execute("SELECT * FROM " + tablename);
                        System.out.println("Данные из текущей БД: ");
                        Print_result.print_result2(rs);
                    }
                    else if(number == 3)
                    {
                        Third_num.main_operation(myurl, login, password, tablename);
                        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
                        ResultSet rs = con.execute("SELECT * FROM " + tablename);
                        System.out.println("Данные из текущей БД: ");
                        Print_result.print_result3(rs);
                    }
                    else
                    {
                        Fourth_num.main_operation(myurl, login, password, tablename);
                        Mysqlconnection con = new Mysqlconnection(myurl, login, password);
                        ResultSet rs = con.execute("SELECT * FROM " + tablename);
                        System.out.println("Данные из текущей БД: ");
                        Print_result.print_result4(rs);
                    }
                }
            }
        }
    }
}
