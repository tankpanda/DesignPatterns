package com.hhd.patterns.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理必须实现接口
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        Movable m = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("method " + method.getName() + " start");
//                        Object o = method.invoke(car, args);
//                        System.out.println("method " + method.getName() + " end");
//                        return o;
//                    }
//                });

        // generator proxy file into directory
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        // m是代理类$Proxy0的实例
        Movable m = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Movable.class}, (proxy, method, args1) -> {
            System.out.println("method " + method.getName() + " start");
            Object o = method.invoke(car, args1);
            System.out.println("method " + method.getName() + " end");
            return o;
        });
        // m.move()=h.invoke()=(proxy, method, args1)->{}; h=new InvocationHandler(){};
        m.move();
    }
}
