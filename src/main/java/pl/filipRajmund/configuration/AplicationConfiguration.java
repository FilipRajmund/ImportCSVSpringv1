package pl.filipRajmund.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.filipRajmund.Main;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class AplicationConfiguration {
}
