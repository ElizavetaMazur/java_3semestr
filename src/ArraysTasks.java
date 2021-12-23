import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args){
        System.out.println(Arrays.toString(even(15)));
        System.out.println(allSimilar(new int[] {10, 10, 11}));
        System.out.println(allSimilar(new int[] {10}));
        System.out.println("___________________________");
        System.out.println(hasSimilar(new int[] {10, 1, 10}));
        System.out.println("___________________________");
        System.out.println(mean(new int[] {10, 3, 10}));
        System.out.println("___________________________");
        int[] m = {10, 20, 30, 40};
        int[] m1 = {10};
        shift(m);
        shift(m1);
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(m1));
        System.out.println("___________________________");
        int[] m2 = {10, 20, 30, 40};
        System.out.println(Arrays.toString(copyShift(m2)));
        System.out.println(Arrays.toString(m2));

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
        double sum = 0;
        for (int x : a)
            sum = sum + x;
        return sum / a.length;
    }


    private static void shift(int[] a){
        int p, t;
        t = a[0];
        for (int i = 0; i < a.length; i++ ){
            p = a[i];
            a[i] = t;
            t = p;
        }
        a[0] = t;
    }

    private static int[] copyShift(int[] a){
        int p, t;
        int[] b = a.clone();
        t = b[0];
        for (int i = 0; i < b.length; i++ ){
            p = b[i];
            b[i] = t;
            t = p;
        }
        b[0] = t;
        return b;
    }

}
