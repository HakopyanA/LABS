import java.util.Scanner;

public class LR_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, a, b, y;
        System.out.print("Введите x, a, b: ");
        x = sc.nextDouble();
        a = sc.nextDouble();
        b = sc.nextDouble();

        if (x <= 3) y = b + 2 * Math.log(x);
        else y = Math.pow(x, 2) / (x + a);
        System.out.println("1) y = " + y);

        if (x <= 2) y = (a + Math.pow(x, 2)) / (b + Math.log(Math.abs(x) + 1));
        else y = Math.exp(-x) + Math.pow(x, 2);
        System.out.println("4) y = " + y);

        if (x > 3) y = (a + x) * (1 / Math.atan(a * x));
        else y = 1 / Math.pow(Math.cos(b + Math.pow(x, 2)), 2);
        System.out.println("7) y = " + y);

        if (x >= 2) y = Math.sqrt(1 + x * Math.sqrt(a * x));
        else y = a * Math.sin(b * x) + 3;
        System.out.println("9) y = " + y);

        if (x <= 1) y = 2 * Math.pow(x, 2) + a * Math.cos(b * x);
        else y = (Math.exp(x) + Math.tan(Math.pow(x, 3)));
        System.out.println("12) y = " + y);

        if (x < 2) y = Math.sin(x + Math.pow(a, 2));
        else y = Math.log(Math.pow(x, 2) + 2 * x + b);
        System.out.println("15) y = " + y);
    }
}