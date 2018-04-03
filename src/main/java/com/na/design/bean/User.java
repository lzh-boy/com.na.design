package com.na.design.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * <p>@Description  基础类User类，用户类</p>
 * <p>@createDate 2018-01-27-23:44</p>
 *对于整个的校园二手项目而言，以下用户信息是必须的：
 * 账户名称
 * 账户密码
 * 用户真实姓名（身份校验）
 * 用户性别
 * 联系方式（手机号码）
 * 用户等级
 * 学生级别（大一，大二，大三，大四，研一，研二）
 * 学生所在学校及校区
 * @author xuliang
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5895471069162422347L;
    private int userId;
    private String userNickName;
    private String userPassword;
    private String userRealName;
    private String userPhone;
    private int userLevel;
    private String userSchool;
    private String userGrade;
    private String userGender;
    /**
     * 用户信用分
     */
    private long userCreditScore;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", userId)
                .append("userNickName", userNickName)
                .append("userPassword", userPassword)
                .append("userRealName", userRealName)
                .append("userPhone", userPhone)
                .append("userLevel", userLevel)
                .append("userSchool", userSchool)
                .append("userGrade", userGrade)
                .append("userGender", userGender)
                .toString();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public long getUserCreditScore() {
        return userCreditScore;
    }

    public void setUserCreditScore(long userCreditScore) {
        this.userCreditScore = userCreditScore;
    }
}
