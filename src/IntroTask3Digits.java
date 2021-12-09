public class IntroTask3Digits {
    public static void main(String[] args){
        System.out.println(Task3Digits(8851));
        System.out.println(Task3Digits(100));
    }

    private static boolean Task3Digits(int x){
        if (x > 99 && x < 1000) {
            return true;
        } else {
            return false;
        }
    }

}
