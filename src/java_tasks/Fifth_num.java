package java_tasks;

import java.util.Scanner;

public class Fifth_num {
    public static void main_operation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str = scan.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scan.nextLine();
        System.out.println("Вывод первой строки: " + str);
        System.out.println("Вывод второй строки: " + str2);
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer(str2);
        stringBuffer.reverse();
        stringBuffer2.reverse();
        System.out.println("Обратная строка1" + stringBuffer);
        System.out.println("Обратная строка2" + stringBuffer2);

    }
}
