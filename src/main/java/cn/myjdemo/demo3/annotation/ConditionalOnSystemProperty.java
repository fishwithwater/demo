package cn.myjdemo.demo3.annotation;

import cn.myjdemo.demo3.condition.OnSystemPropertyConditional;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Java 系统属性 条件判断
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional({OnSystemPropertyConditional.class})
public @interface ConditionalOnSystemProperty {

    /**
     * Java系统属性的名称
     * @return
     */
    String name();

    /**
     * Java 系统属性值
     * @return
     */
    String value();
}
