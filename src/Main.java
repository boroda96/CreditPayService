public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("При сумме кредита 1 000 000 на 1 год под 9,99% годовых, ежемесячный платеж:");
        System.out.println(service.calculate(1_000_000,12,9.99));
        System.out.println("При сумме кредита 1 000 000 на 2 года под 9,99% годовых, ежемесячный платеж:");
        System.out.println(service.calculate(1_000_000,24,9.99));
        System.out.println("При сумме кредита 1 000 000 на 3 года под 9,99% годовых, ежемесячный платеж:");
        System.out.println(service.calculate(1_000_000,36,9.99));

    }
}