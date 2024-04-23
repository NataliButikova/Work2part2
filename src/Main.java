public class Main {
    public static void main(String[] args) {
        int account = 100; // денежные средства на счете
        int payment = 1100; // сумма пополнения

        int percent;

        if (payment > 1000) {
            percent = 1;
        } else {
            percent = 0;

        }

        int bonus = payment * percent / 100;

        System.out.println("Итоговая сумма на счете " + (account + payment));
        System.out.println("Итоговая сумма бонусов " + bonus);


    }
}
