public class CreditPaymentService {
    public int calculate(int sum, float per, int year) {
        int month = year * 12;
        float perM = per / 12 / 100; // % в мес
        double st = Math.pow (1+perM , month); // 1 + % в мес в степени кол-ва месяцев
        return (int) (sum * (perM * st) / (st - 1));
    }
}
