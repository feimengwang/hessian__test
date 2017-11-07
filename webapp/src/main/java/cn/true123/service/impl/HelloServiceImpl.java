package cn.true123.service.impl;

import service.HelloService;

public class HelloServiceImpl  implements HelloService {
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
