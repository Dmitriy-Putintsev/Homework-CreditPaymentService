public class CreditPaymentService {

    public double loanAmount;
    public int month;
    public double yearPercents;

    public double calculate() {
        double monthlyPercentage = yearPercents / 100 / 12;
        return loanAmount * (monthlyPercentage + monthlyPercentage / (Math.pow(1 + monthlyPercentage, month) - 1));
    }
}
