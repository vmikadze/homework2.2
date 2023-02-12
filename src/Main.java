public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int paid = 1200;
        int finalBalance;
        int bonus;

        if (paid > 1000) {
            bonus = paid / 100;
            finalBalance = startBalance + bonus;
        } else {
            finalBalance = startBalance;
            bonus = 0;
        }

        System.out.println("Баланс = " + finalBalance + " рублей");
        System.out.println("Размер бонуса = " + bonus + " рублей");
    }
}
