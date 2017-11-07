package cn.true123.main;


import com.caucho.hessian.client.HessianProxyFactory;
import service.HelloService;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args){
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        String url="http://localhost:8080/hello";
        try {
            HelloService helloService = (HelloService) hessianProxyFactory.create(HelloService.class,url);
            System.out.println(helloService.sayHello("nihao"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
