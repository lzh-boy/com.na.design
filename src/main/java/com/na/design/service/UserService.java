package com.na.design.service;

import com.na.design.bean.User;
import com.na.design.dao.IUserDAO;
import com.na.design.exception.UserDaoException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户服务层
 *
 * @author xuliang@asiainfo.com
 * <p>@createTime 2018-04-03 13:57</p>
 **/
@Service
@Transactional(rollbackFor = UserDaoException.class)
public class UserService {
    private transient static final Log log = LogFactory.getLog(UserService.class);
    private final IUserDAO iUserDao;
    /**这种方式的注解可以省略*/
    public UserService(IUserDAO iUserDao) {
        this.iUserDao = iUserDao;
    }
    public List<User> findAllUsers() {
        log.info("检索所有用户");
        try {
            return iUserDao.findAllUsers();
        } catch (UserDaoException e) {
            log.error(e.getMessage());
        }
        return null;
    }
}
