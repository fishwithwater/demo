package cn.myjdemo.demo3.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("java8 lambda实现");
        return Stream.of(values).reduce(0,Integer::sum);
    }


    public static void main(String[] args) {
        CalculateService calculateService = new Java8CalculateService();
        System.out.println(calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

}
