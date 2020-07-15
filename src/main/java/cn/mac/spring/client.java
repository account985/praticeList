package cn.mac.spring;

import cn.mac.spring.dao.IAccountDao;
import cn.mac.spring.service.IAccountService;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/5 3:54 PM
 */
public class client {

    //使用 main 方法获取容器测试执行

    //1.使用 ApplicationContext 接口，就是在获取 spring 容器

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        System.out.println(accountService);

        IAccountDao aDao = (IAccountDao) ac.getBean("accountDao");
        System.out.println(aDao);
    }


}
