package com.demo.consumer;

import com.demo.osgi.provider.HelloWorldService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * @Author zhaogw
 * @Date 2018/9/7 15:57
 */
public class HelloWorldConsumer implements ActionListener {
    private final HelloWorldService service;
    private final Timer timer;
    public HelloWorldConsumer(HelloWorldService service) {
        super();
        this.service = service;
        timer = new Timer(1000, this);
    }
    public void startTimer(){
        timer.start();
    }
    public void stopTimer() {
        timer.stop();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        service.hello();
    }
}
