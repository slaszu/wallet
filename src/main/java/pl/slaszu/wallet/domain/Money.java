package pl.slaszu.wallet.domain;

public class Money {
    private String currency;
    private Integer amount;

    public Money(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
