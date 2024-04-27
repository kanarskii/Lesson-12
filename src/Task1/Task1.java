package Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("([A-Z]|[А-Я]){2,6} ?");
        Matcher m = p.matcher(scanner.nextLine());
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
