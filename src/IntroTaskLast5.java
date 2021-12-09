public class IntroTaskLast5 {
    public static void main(String[] args){
        System.out.println(Last5(145));
        System.out.println(Last5(2));
    }
    private static boolean Last5(int x){
        if (x % 10 == 5) {
            return true;
        } else {
            return false;
        }
    }
}
