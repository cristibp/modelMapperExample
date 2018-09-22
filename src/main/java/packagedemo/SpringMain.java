package packagedemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by Cristian on 9/22/2018.
 */
@SpringBootApplication
public class SpringMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringMain.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            ModelMapper modelMapper = new ModelMapper();

            Source source = new Source();
            source.setAmount("123");
            source.setAmountAmount(new Amount(new BigDecimal("123"), "EUR", "12333"));

            source.setAmounts(
                    Arrays.asList(new Amount(new BigDecimal("444"), "DDD", "1231"),
                    new Amount(new BigDecimal("555"), "EE", "1231")));
            Destination dest = new Destination();

            modelMapper.map(source, dest);
            System.out.println(dest);
        };
    }
}
