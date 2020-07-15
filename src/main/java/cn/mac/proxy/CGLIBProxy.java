package cn.mac.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/4 6:59 PM
 */
public class CGLIBProxy implements MethodInterceptor {


    private Object targetObject ;//被代理的目标对象

    public Object createProxyInstance(Object targetObject){

        this.targetObject = targetObject;

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(targetObject.getClass());  //设置代理目标

        enhancer.setCallback(this);  // 设置回调

        return enhancer.create();

    }

    /**
      * 在代理实例上处理方法调用并返回结果 
      * @param object ： 代理类
      * @param method ：被代理的方法
      * @param objects ：该方法的参数数组
      * @param methodProxy
      */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        try {
            System.out.println("前置处理开始 ...");
            result = methodProxy.invoke(targetObject, objects);
            System.out.println("后置处理开始  ...");
        }catch (Exception e){
            System.out.println("异常处理 ..");
        }finally {
            System.out.println("调用结束 ...");
        }
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("45","56");
        return map;
    }
}
