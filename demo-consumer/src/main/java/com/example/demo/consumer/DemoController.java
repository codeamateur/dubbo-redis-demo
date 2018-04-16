package com.example.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private DemoService demoService;

    @RequestMapping("/demo")
    public void demo() {
        demoService.sayHello();
    }
}
