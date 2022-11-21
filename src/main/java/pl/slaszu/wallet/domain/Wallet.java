package pl.slaszu.wallet.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Wallet {
    private ArrayList<Money> wallet = new ArrayList<>();

    public void add(Money money) {
        this.wallet.add(money);
    }

    public void remove(Money money) {
        this.wallet.remove(money);
    }

    public Integer amount() {
        return this.wallet.stream().mapToInt(Money::getAmount).sum();
    }
}
