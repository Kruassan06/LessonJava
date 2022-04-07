public class MainClass {

    static int a = 1;
    static int b = 2;
    static int c = 3;
    static int d = 4;
    static int x = 1;
    static int x1 = 10;
    static int x2 = 21;
    static String name = "Djama";
    float aFloat = 153.1f;
    double aDouble = 12.3;
    long aLong = 3;
    byte aByte = 12;
    boolean aBoolean = true;
    char aChar = 'C';
    short aShort = 100;

    public static void main(String[] args) {
        calculate(a, b, c, d);
        task10and20(x1, x2);
        isNegative(x);
        System.out.println("2. задание:" + task10and20(x1, x2));
        System.out.println("3. задание:" + isNegative(x));
        isPositiveOrNegative(x);
        greetings(name);
    }

    public static int calculate(int a, int b, int c, int d) {
        a = a * b + (c / d);
        System.out.println("1. задание:"+ a);
        return a;
    }

    public static boolean task10and20(int x1, int x2) {
        if (x1 >= 10 && x1 <= 20 && x2 >= 10 && x2 <= 20) {
            return true;

        } else {
            return false;
        }


    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("4. Задание:" + false);
        } else {
            System.out.println("4. Задание:" + true);
        }
    }


    public static void greetings(String name) {
        System.out.println("5. Hello, "+ name);

    }



}
