public class PrimalityTest {
    public static void main(String[] args){
        System.out.println(isPrimality(313));
        System.out.println(isPrimality(183));
    }

    private static boolean isPrimality(int x){
        int i = 2;
        while(i <= (int)Math.sqrt(x)){
            if (x % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
