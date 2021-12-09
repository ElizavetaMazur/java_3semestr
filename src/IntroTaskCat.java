public class IntroTaskCat {
    public static void main(String[] args){
        System.out.println(TaskCat(24));
        System.out.println(TaskCat(12));
        System.out.println(TaskCat(100));
        System.out.println(TaskCat(101));
    }

    private static String TaskCat(int x){
        if (x % 10 == 0 || x % 100 > 10 && x % 100 < 20 || x % 10 > 4){
            return String.format("%d котов", x);
        } else if(x % 10 == 1)
            return String.format("%d кот", x);
        else return String.format("%d кота", x);
    }
}
