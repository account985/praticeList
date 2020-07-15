package cn.mac.spring.dao.impl;

import cn.mac.spring.dao.IAccountDao;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/5 12:52 PM
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
