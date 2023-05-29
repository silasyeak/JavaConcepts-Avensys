package SpringPrac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("SpringPrac")

public class LaunchApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BusinessCalculator businessCalculator = context.getBean(BusinessCalculator.class);
        int maxValue = businessCalculator.findMaxValue();

        System.out.println("Max value: " + maxValue);

        context.close();
    }
}
