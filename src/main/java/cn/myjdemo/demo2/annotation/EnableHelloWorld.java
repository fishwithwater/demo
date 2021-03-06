package cn.myjdemo.demo2.annotation;

import cn.myjdemo.demo2.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWorldConfiguration.class)
//@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}