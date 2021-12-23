import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args){
        int[][] a = new int[][]{
                {10, 20, 30},                // a[0]
                {40, 50, 60, 70, 80, 90},    // a[1]
                {100, 200}                   // a[2]
        };
        printTable(a);
/*
        int[][] b = new int[][]{                                    // Задача 2 не работает
                {10, 1, 1000000, 44, 4244},
                {111, 432, 44},
                {5, 27, 1, 33, 123523, 6}
        };
        printTableAligned(b);

*/
        System.out.println("___________________________");
        System.out.println("Задача 3");

        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);


    }

    private static void printTable(int[][] a) {                   // только для int[][].
         for (int[] x : a) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }

    }

// Задача 2

/*
    private static void printTableAligned(int[][] a){
        String[][] m = new String[a.length][];

        int maxLength = 0;
        for (int[] x : a){
            if (x.length > maxLength)
                maxLength = x.length;
        }

        for (int i = 0; i < maxLength; i++) {           //  i - столбец
            int maxw = 0;                                     //идём по элементам строчки. Есть ли вообще эелемент с таким i
            for (int j = 0; j < a.length; j++ ) {
                if (i < a[j].length){
                   if ( (Integer.toString(a[j][i])).length() > maxw)
                       maxw = (Integer.toString(a[j][i])).length();
                }
            }
            for (int j = 0; j < a.length; j++ ){      // снова заходим в цикл прохождения по столбику. заполняем новый массив строками
                int k = (maxw - (Integer.toString(a[j][i])).length());
                m[j][i] = "";
                for (int ki = 0; ki < k; ki++ ) {
                    m[j][i] = m[j][i] + " ";
                }
                m[j][i] = m[j][i] + a[j][i];
            }
        }

        for (String[] x : m) {
            for (String y : x)
                System.out.print(y + "  ");
            System.out.println();
        }


    }
*/

//Задача 3

    private static char[][] createTable(int n, char s) {
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = s;
        return a;
    }

    private static void printTable(char[][] a) {
        for (char[] x : a) {
            for (char y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }

    private static char[][] fillFirstAndLastLines(char[][] a, char s){
        Arrays.fill(a[0], s);
        Arrays.fill(a[a.length - 1], s);
        return a;
    }

    private static char[][] fillFirstAndLastColumns(char[][] a, char s) {
        for (int i = 0; i < a.length; i++) {
            a[i][0] = s;
            a[i][a.length - 1] = s;
        }
        return a;
    }

}
