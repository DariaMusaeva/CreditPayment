// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1000000;
        float per = 9.99F;
        int year = 1;
        int payment = service.calculate(sum, per, year);

        System.out.println(payment);
    }
}
