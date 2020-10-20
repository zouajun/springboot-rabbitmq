package cn.zouajun.rabbitmqSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqSpringBootApplication.class,args);
    }

    public void aa(){
        System.out.println("hahahah");
    }
}
