public class IntroTaskQuadraticEquation {
    public static void main(String[] args){
        System.out.println(QuadraticEquation(0, 0, 1));
        System.out.println(QuadraticEquation(4, 6, 2));
        System.out.println(QuadraticEquation(0, 3, 17));
        System.out.println(QuadraticEquation(1, -4, 4));
    }
    private static String QuadraticEquation(float a, float b, float c){
        float d = b * b - 4 * a * c;
        if (d < 0 || a == 0 && b == 0)
            return "решений нет";
        else if (d == 0)
            return "Одно решение. x = %.2f".formatted(- b / (2 * a));
        else if (a == 0)
            return "Одно решение. x = %.2f".formatted(- c / b);
        else{
            return "Два решения. x1 = %.2f, x2 = %.2f".formatted((- b - Math.sqrt(d)) / (2 * a), (- b + Math.sqrt(d)) / (2 * a));

        }
    }
}
