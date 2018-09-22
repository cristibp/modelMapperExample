package packagedemo;

import packagedemo.anotherModel.SameType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Cristian on 9/22/2018.
 */
public class Destination {
    private String amount;
    private BigDecimal amountBig;

    private List<Amount> amounts;
    private SameType type;


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

    public List<Amount> getAmounts() {
        return amounts;
    }

    public void setAmounts(List<Amount> amounts) {
        this.amounts = amounts;
    }

    public SameType getType() {
        return type;
    }

    public void setType(SameType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "amount='" + amount + '\'' +
                ", amountBig=" + amountBig +
                ", amounts=" + amounts +
                ", type=" + type +
                '}';
    }
}
