import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args){
        System.out.println(Arrays.toString(even(15)));
        System.out.println(allSimilar(new int[] {10, 10, 11}));
        System.out.println(allSimilar(new int[] {10}));
        System.out.println("___________________________");
        System.out.println(hasSimilar(new int[] {10, 1, 10}));
        System.out.println("___________________________");
        System.out.println(mean(new int[] {10, 1, 10}));
        System.out.println("___________________________");
        /*
        int[] m = {10, 20, 30, 40};
        shift(m);
        System.out.println(m);

         */
    }

    private static int[] even(int n){
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++)
            a[i] = 2 * (i + 1);
        return a;
    }

    private static boolean allSimilar(int[] a){
            for (int x : a)
                if (a[0] != x)
                    return false;
        return true;
    }

    private static boolean hasSimilar(int[] a){
        for (int i = 0; i < a.length -1 ; i++ )
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j])
                    return true;
        return false;
    }

    private static double mean(int[] a){
        int sum = 0;
        for (int x : a)
            sum = sum + x;
        return sum / a.length;
    }

    /*
    private static void shift(int[] a){

    }

     */
}
