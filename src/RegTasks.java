import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTasks {
    public static void main(String[] args){


       task2("23:16 and 12:54 and 77:88, hello");
        System.out.println(task3("Это строка , у которой зачем-то написаны два пробела перед запятой     , "));


    }


    private static void task2(String t){
        Pattern tp = Pattern.compile("(\\d\\d):(\\d\\d)");
        Matcher m1 = tp.matcher(t);

        while (m1.find()){
            System.out.print(m1.group(0));
              if ( m1.group(1).matches("(0|1)\\d|20|21|22|23") && m1.group(2).matches("(0|1|2|3|4|5)\\d") )
                  System.out.println(" Корректное указание времени");
              else System.out.println(" некорректное указание времени");
        }
    }


    private static String task3(String t){
        return t.replaceAll(" +, ", ", ");
    }

}
