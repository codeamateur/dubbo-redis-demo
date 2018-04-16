package com.example.demo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.api.DemoService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.out.println("dubbo redis test");
    }
}
