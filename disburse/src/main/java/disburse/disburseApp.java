package disburse;

import config.HouseDisburseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class disburseApp
{
    public static void main(String[] args) {
        SpringApplication.run(disburseApp.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(HouseDisburseConfig.class);

        ctx.refresh();
    }
}
