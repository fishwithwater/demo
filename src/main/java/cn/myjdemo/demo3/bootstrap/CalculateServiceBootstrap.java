package cn.myjdemo.demo3.bootstrap;

/**
 * @author myj
 */

import cn.myjdemo.demo3.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "cn.myjdemo.demo3.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);
        //CalculateService是否存在
        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));

        //关闭上下文
        context.close();
    }
}