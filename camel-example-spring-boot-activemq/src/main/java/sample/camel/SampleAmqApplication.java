package sample.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/amq.xml"})
public class SampleAmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleAmqApplication.class, args);
    }
}