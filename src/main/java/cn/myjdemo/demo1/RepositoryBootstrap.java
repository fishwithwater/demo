package cn.myjdemo.demo1;

import cn.myjdemo.demo1.annotation.FirstLevelRepository;
import cn.myjdemo.demo1.bean.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import java.util.Map;

@ComponentScan(basePackages = "cn.myjdemo.demo1.bean")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //myFirstLevelRepository是否存在
        MyFirstLevelRepository repository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        System.out.println(repository);
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(FirstLevelRepository.class);
        System.out.println(beansWithAnnotation);
        //关闭上下文
        context.close();
    }
}