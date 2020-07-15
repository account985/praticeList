package cn.mac.spring.service.impl;

import cn.mac.spring.dao.IAccountDao;
import cn.mac.spring.dao.impl.AccountDaoImpl;
import cn.mac.spring.service.IAccountService;

/**
 * @author shen jiahuan
 * @version 1.0
 * @date 2020/7/5 12:50 PM
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();//此处的依赖关系有待解决

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
