package com.na.design.dao;

import com.na.design.bean.User;
import com.na.design.exception.UserDaoException;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户dao层
 *
 * @author xuliang@asiainfo.com
 * <p>@createTime 2018-04-03 13:53</p>
 **/
@Mapper
public interface IUserDAO {
    /**
     * 查找所有用户
     *
     * @return 所用用户
     * @throws UserDaoException 事务异常
     * @author xuliang@asiainfo.com 2018/3/22 20:09
     */
    @Select("SELECT * FROM USER")
    List<User> findAllUsers() throws UserDaoException;

    /**
     * <p>@Description </p>
     * <p>@createDate 15:32 2018/1/31</p>
     *
     * @param userRealName 查找的用户姓名
     * @return User 返回查找到的
     * @throws UserDaoException 事务异常
     * @author xuliang
     */
    @Select("SELECT * FROM USER  HERE user.userRealName = #{userRealName}")
    User findUserByRealName(String userRealName) throws UserDaoException;

    /**
     * <p>@Description 根据用户手机号码查询用户</p>
     * <p>@createDate 16:15 2018/2/26</p>
     *
     * @param userPhone 用户手机号码（必须在service层经过校验）
     * @return user
     * @throws UserDaoException 事务异常
     * @author xuliang
     */
    @Select("SELECT * FROM USER WHERE user.userPhone = #{userPhone}")
    User findUserByPhone(String userPhone) throws UserDaoException;

    /**
     * describe: 添加用户
     * creat_user: xuliang@asiainfo.com
     * creat_date: 2018/3/7
     *
     * @param user 用户
     * @throws UserDaoException 事务异常
     **/
    @Insert("INSERT INTO USER(userNickName,userPassword,userRealName,userPhone,userLevel,userSchool,userGrade,userGender) " +
            "values(#{userNickName},#{userPassword},#{userRealName},#{userPhone},#{userLevel},#{userSchool},#{userGrade},#{userGender})")
    void addUser(User user) throws UserDaoException;

    /**
     * 删除用户
     *
     * @param userPhone 用户手机号码
     * @return boolean
     * @throws UserDaoException 事务异常
     * @author xuliang@asiainfo.com 2018/3/22 19:54
     */
    @Delete("DELETE FROM user WHERE user.userPhone = #{userPhone}")
    boolean deleteUser(String userPhone) throws UserDaoException;

    /**
     * 更换除用户手机号码外的用户信息
     *
     * @param user 根据用户手机号码需要更新的用户信息
     * @return boolean
     * @throws UserDaoException 事务异常
     * @author xuliang@asiainfo.com 2018/3/22 20:04
     */
    @Update("UPDATE user SET " +
            "userNickName=#{userNickName}," +
            "userPassword=#{userPassword}," +
            "userRealName=#{userRealName}," +
            "userSchool=#{userSchool}," +
            "userGrade=#{userGrade}" +
            "WHERE user.userPhone = #{userPhone}")
    boolean updateUser(User user) throws UserDaoException;
    /**
     * 级联查询案例
     */
    /*@Select("SELECT g.*,u.* " +
            "FROM GOODS g " +
            "INNER JOIN user u " +
            "ON g.userId = u.userId")
    @Results(
            {
                    @Result(property = "userId.userId}",column = "goods.userId"),
                    @Result(property = "userId.userNickName",column = "userNickName"),
                    @Result(property = "userId.userPassword",column = "userPassword"),
                    @Result(property = "userId.userRealName",column = "userRealName"),
                    @Result(property = "userId.userPhone",column = "userPhone"),
                    @Result(property = "userId.userLevel",column = "userLevel"),
                    @Result(property = "userId.userSchool",column = "userSchool"),
                    @Result(property = "userId.userGrade",column = "userGrade"),
                    @Result(property = "userId.userGender",column = "userGender")
            }
    )
    List<GoodsBean> getAllGoods() throws Exception;*/
}