package pl.slaszu.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.slaszu.wallet.application.AddSomeMoneyToWallet;
import pl.slaszu.wallet.application.GetWalletInterface;
import pl.slaszu.wallet.domain.Wallet;

public class WalletApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);

        GetWalletInterface getWallet = context.getBean(GetWalletInterface.class);

        System.out.println("GetWallet class : " + getWallet.getClass());
        System.out.println("Wallet : " + getWallet.getWallet().amount());
    }
}