package cn.mac.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/4 12:35 PM
 */
public class JDKDynamicProxy  implements InvocationHandler {

    //被代理的目标对象
    private Object proxyObj;

    public Object newProxy(Object proxyObj) {
        this.proxyObj = proxyObj;

        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(),proxyObj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object object = method.invoke(this.proxyObj, args);
        after();
        System.out.println(object);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("12","78");
        return linkedHashMap;
    }

    public void before(){
        System.out.println("开始执行目标对象之前...");
    }

    public void after(){
        System.out.println("开始执行目标对象之后...");
    }



}
