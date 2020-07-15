package cn.mac.proxy.service.impl;

import java.util.HashMap;

import java.util.Map;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/4 6:55 PM
 */
public class TestCGLIBServiceImpl {



    public HashMap add(){
        System.out.println("开始执行add...");
        HashMap<String, String> map = new HashMap<>();
        map.put("12","34");
        return map;
    }
}

