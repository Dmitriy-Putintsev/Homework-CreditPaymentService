public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        service.loanAmount = 1_000_000;
        service.month = 12;
        service.yearPercents = 9.99;

        int monthlyPayment = (int) service.calculate();

        System.out.println(" Ежемесячный платеж составляет: " + monthlyPayment + " рублей");

    }
}
