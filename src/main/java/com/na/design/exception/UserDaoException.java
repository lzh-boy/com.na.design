package com.na.design.exception;

/**
 * 用户dao层异常
 *
 * @author xuliang@asiainfo.com
 * <p>@createTime 2018-03-22 20:13</p>
 **/
public class UserDaoException extends Exception {

    public UserDaoException() {
        super("用户dao层异常");
    }

    public UserDaoException(String msg) {
        super(msg);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
