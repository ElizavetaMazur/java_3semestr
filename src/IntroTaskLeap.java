public class IntroTaskLeap {
    public static void main(String[] args){
        System.out.println(TaskLeap(2100));
        System.out.println(TaskLeap(2000));
    }

    private static String TaskLeap(int x){
        if (x % 400 == 0 || x % 4 == 0 && x % 100 != 0) {
            return "Високосный";
        } else {
            return "Не високосный";
        }
    }
}
