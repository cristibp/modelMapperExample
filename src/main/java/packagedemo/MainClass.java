package packagedemo;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.math.BigDecimal;

/**
 * Created by Cristian on 9/22/2018.
 */
public class MainClass {

    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        Source source = new Source();
        source.setAmount("123");
        source.setAmountAmount(new Amount(new BigDecimal("123"), "EUR", "12333"));
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
