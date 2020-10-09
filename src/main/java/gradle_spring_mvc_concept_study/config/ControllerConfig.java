package gradle_spring_mvc_concept_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"gradle_spring_mvc_concept_study.controller"})
public class ControllerConfig {
}
