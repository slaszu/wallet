package pl.slaszu.wallet.application;

import org.springframework.stereotype.Component;
import pl.slaszu.wallet.domain.Money;
import pl.slaszu.wallet.domain.Wallet;

@Component
public class AddSomeMoneyToWallet implements GetWalletInterface {

    private Wallet wallet;

    public AddSomeMoneyToWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public Wallet getWallet() {

        Money money1 = new Money("pln",100);
        Money money2 = new Money("pln", 99
        );

        this.wallet.add(money1);
        this.wallet.add(money2);

        return this.wallet;
    }
}
