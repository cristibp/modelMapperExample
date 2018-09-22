package packagedemo;

import packagedemo.model.SameType;

import java.util.List;

/**
 * Created by Cristian on 9/22/2018.
 */
public class Source {
    private String amount;
    private Amount amountAmount;

    private List<Amount> amounts;
    private SameType type;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Amount getAmountAmount() {
        return amountAmount;
    }

    public void setAmountAmount(Amount amountAmount) {
        this.amountAmount = amountAmount;
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
}
