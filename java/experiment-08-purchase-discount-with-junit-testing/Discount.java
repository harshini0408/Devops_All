public class Discount {
    public double calculate(double amount) {
        if (amount >= 1000)
            return amount - (amount * 0.10);
        else
            return amount;
    }
}
