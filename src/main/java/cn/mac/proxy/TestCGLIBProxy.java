package cn.mac.proxy;

import cn.mac.proxy.service.impl.TestCGLIBServiceImpl;

import java.util.Map;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/4 7:28 PM
 */
public class TestCGLIBProxy {

    public static void main(String[] args) {

        TestCGLIBServiceImpl testCGLIB = new TestCGLIBServiceImpl();

        CGLIBProxy CGLIBproxy = new CGLIBProxy();
        TestCGLIBServiceImpl testCGLIBProxy = (TestCGLIBServiceImpl)CGLIBproxy.createProxyInstance(testCGLIB);
        Map add = testCGLIBProxy.add();
        System.out.println(add);
    }
}
