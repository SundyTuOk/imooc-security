package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableSwagger2
public class DemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello security";
    }
}
