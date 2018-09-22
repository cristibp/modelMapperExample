package packagedemo.anotherModel;

/**
 * Created by Cristian on 9/22/2018.
 */
public class SameType {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SameType{" +
                "value='" + value + '\'' +
                '}';
    }
}
