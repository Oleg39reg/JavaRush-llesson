import java.util.Scanner;

public class practick {
    public static void main(String[] arge) {
        double a, b;
        Scanner in = new Scanner(System.in);// Создаём объект "сканер" на него будет работать ссылка in

        System.out.print("a = "); a = in.nextDouble();
        System.out.print("b = "); b = in.nextDouble();

        double p = 2*(a+b);

        System.out.println(p);
        in.close();
    }
}
