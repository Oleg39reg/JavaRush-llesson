public class Amigo {
    public static void main (String[]args)
    {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;//14

        x = y - x;//14-2=12
        y = y - x;//14-12=2

        System.out.println(x);
        System.out.println(y);
    }
}
