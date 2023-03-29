public class Main {
    public static void main(String[] args) {

        int a = 100;
        int b = 1500;
        int c = a + b;
        int d;

        if (b>1000) {
            d = c / 100;
        } else {
            d = 0;
        }

        System.out.println( "На счету: " + c + "; " + "Начислено бонусов: " + d );

    }
}