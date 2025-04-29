public class Main {

    public static void fun(double h, double v) {
        System.out.println("Max height is: " + (h + (v * 32) - (16 * Math.pow(32, 2))));
        for (double i = 0.00; i < 32.00; i += 0.01) {
            System.out.println("Time is now: " + i);
            System.out.println(h + (v * i) - (16 + Math.pow(i, 2)));
        }
    }


    public static void main(String[] args) {
        fun(3, 2);
    }
}
