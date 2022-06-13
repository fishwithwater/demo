package cn.myjdemo.demo3.service;

public interface CalculateService {
    /**
     * 给一系列整数求和
     * @param values 待求和整数
     * @return
     */
    Integer sum(Integer... values);
}