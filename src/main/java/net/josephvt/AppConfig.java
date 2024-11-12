package net.josephvt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("net.josephvt")
public class AppConfig {

    @Bean
    public Course mathCourse() {
        return new MathCourse();
    }

    @Bean
    @Primary
    public Course scienceCourse() {
        return new ScienceCourse();
    }


}
