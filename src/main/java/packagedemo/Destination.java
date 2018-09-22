package packagedemo;

import java.math.BigDecimal;

/**
 * Created by Cristian on 9/22/2018.
 */
public class Destination {
    private String amount;
    private BigDecimal amountBig;


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountBig() {
        return amountBig;
    }

    public void setAmountBig(BigDecimal amountBig) {
        this.amountBig = amountBig;
    }


    @Override
    public String toString() {
        return "packagedemo.Destination{" +
                "amount='" + amount + '\'' +
                ", amountBig=" + amountBig +
                '}';
    }
}
