package Dao.IDao;

import Dao.ValueObject.User;

import java.util.List;

/**
 * Created by dongmengyuan on 17-8-14.
 */

public interface UserDao {

    //根据用户昵称查找相关用户
    public boolean isUserExisted(User user);

    //添加合法的注册用户
    public void addUser(User user);

//    //判断用户的昵称和密码是否匹配
//    public User getUser(User user);

}
