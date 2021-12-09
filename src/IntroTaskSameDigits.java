public class IntroTaskSameDigits {
    public static void main(String[] args){
        System.out.println(SameDigits(11));
        System.out.println(SameDigits(1));
    }

    private static boolean SameDigits(int x){
        if (x % 10 == (x % 100 / 10 ) && x > 9) {
            return true;
        } else {
            return false;
        }
    }
}
