package Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern p1 = Pattern.compile("[0-9]{4}[-][0-9]{4}[-][0-9]{2}");
        Pattern p2 = Pattern.compile("[+][(][0-9]{2}[)][0-9]{7}");
        Pattern p3 = Pattern.compile("\\w+[.-]?\\w+@\\w+[.]\\w{2,4}");
        Matcher m1 = p1.matcher(line);
        Matcher m2 = p2.matcher(line);
        Matcher m3 = p3.matcher(line);
        while (m1.find()){
            System.out.println("Номер договора " + m1.group());
        }
        while (m2.find()){
            System.out.println("Номер телефона " + m2.group());
        }while (m3.find()){
            System.out.println("Емейл " + m3.group());
        }
    }
}
