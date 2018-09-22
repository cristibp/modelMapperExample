package packagedemo;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import packagedemo.model.SameType;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by Cristian on 9/22/2018.
 */
public class MainClass {

    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        Source source = new Source();
        source.setAmount("123");
        source.setAmountAmount(new Amount(new BigDecimal("123"), "EUR", "12333"));

        source.setAmounts(
                Arrays.asList(
                        new Amount(new BigDecimal("444"), "USD", "1231"),
                        new Amount(new BigDecimal("555"), "RON", "1231"))
        );
        source.setType(new SameType("Same Type"));
        Destination dest = new Destination();

        modelMapper.addMappings(new PropertyMap<Source, Destination>() {
            @Override
            protected void configure() {
                map().setAmountBig(source.getAmountAmount().getValue());
            }
        });

        modelMapper.map(source, dest);
        System.out.println(dest);
    }
}
