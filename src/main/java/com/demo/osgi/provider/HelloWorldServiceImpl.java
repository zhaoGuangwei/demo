package com.demo.osgi.provider;

/**
 * @Author zhaogw
 * @Date 2018/9/7 15:45
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void hello(){
        System.out.println("Hello World !");
    }
}
