package packagedemo;

import java.math.BigDecimal;

/**
 * Created by Cristian on 9/22/2018.
 */
public class Amount {
    private BigDecimal value;
    private String currencyCode;
    private String anotherProperty;


    public Amount(BigDecimal value, String currencyCode, String anotherProperty) {
        this.value = value;
        this.currencyCode = currencyCode;
        this.anotherProperty = anotherProperty;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAnotherProperty() {
        return anotherProperty;
    }

    public void setAnotherProperty(String anotherProperty) {
        this.anotherProperty = anotherProperty;
    }
}
