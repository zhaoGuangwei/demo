package com.demo.proxy;

/**
 * @Author zhaogw
 * @Date 2018/9/6 15:47
 */
public class RealSubject implements Subject {
    @Override
    public void rent()
    {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str)
    {
        System.out.println("hello: " + str);
    }
}
