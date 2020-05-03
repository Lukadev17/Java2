package ge.btu.luka.gagnidze.currency.model;

public class BuyOrSell {
    private String to;
    private double amount;

    public BuyOrSell() {
    }

    public BuyOrSell(String to, double amount) {
        this.to = to;
        this.amount = amount;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
