package cn.myjdemo.demo3.bootstrap;

import cn.myjdemo.demo3.annotation.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "Administrator")
    public String helloWorld(){
        return "Hello World";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //helloWorld是否存在
        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println(helloWorld);

        //关闭上下文
        context.close();
    }

}