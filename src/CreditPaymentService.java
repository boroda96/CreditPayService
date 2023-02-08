public class CreditPaymentService {
    public int calculate(int summa, int period, double percent) {

        double monthlyRate = percent / 12 / 100; //вычисляем месячную процентную ставку
        double monthlyPayment = summa * monthlyRate / (1 - Math.pow(1 + monthlyRate, - period));
        return (int)monthlyPayment;

    }
}
