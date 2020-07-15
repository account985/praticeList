package cn.mac.aop.jdkProxy.impl;

import cn.mac.aop.jdkProxy.TestService;

import java.util.HashMap;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/4 12:37 PM
 */
public class TestServiceImpl implements TestService {
    @Override
    public HashMap add(String a, String b) {
        System.out.println("开始执行："+ a + "参数B ：" +b);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("23","98");
        return map;
    }
}
