public class Main {
    public static void main(String[] args) {

        int startAmount = 100;
        int adding = 1500;
        int balance = startAmount + adding;
        int bonus;

        if (adding > 1000) {
            bonus = balance / 100;
        } else {
            bonus = 0;
        }

        System.out.println("На счету: " + balance + "; " + "Начислено бонусов: " + bonus);

    }
}