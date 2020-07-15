package cn.mac.aop;

import cn.mac.aop.jdkProxy.TestService;
import cn.mac.aop.jdkProxy.impl.TestServiceImpl;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/4 6:02 PM
 */
public class JDKProxyTest {

    @Test
    public void jdkDynamicTest(){
        TestServiceImpl testService = new TestServiceImpl();
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        TestService testServiceProxy = (TestService)jdkDynamicProxy.newProxy(testService);
        HashMap map = testServiceProxy.add("9", "0");
        System.out.println(map);
    }
}
