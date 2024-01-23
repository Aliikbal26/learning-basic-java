public class OprationMatematic {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // augmented assigment
        int c = 100;
        // c = 100 + 10 = 110
        c += 10;
        System.out.println(c);
        // c = 100-10 = 100
        c -= 10;
        System.out.println(c);
        // c = 100 * 10 = 1000
        c *= 10;
        System.out.println(c);

        // unary oprator
        int d = 98;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

    }
}
