package Dao.DaoObject;


import javax.sql.DataSource;

import Dao.DaoConn.DBUtils;
import Dao.IDao.UserDao;
import Dao.ValueObject.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * Created by dongmengyuan on 17-8-14.
 */

public class UserDaoImpl  implements UserDao {


    //判断用户是否已注册
    public boolean isUserExisted(User user) {
        Connection connection = null;
        PreparedStatement statement = null;

        SQLException exception = null;
        boolean existed = false;

        String sql = "select count(1) from UserInfor where user_name = ?";

        try {
            connection = DBUtils.getConnernection();
            statement = connection.prepareStatement(sql);
            statement.setString(1,user.getUser_name());

            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                //确认有查询结果
                existed = (resultSet.getInt(1) == 1);

            }

        } catch (SQLException e) {
            exception = e;
        }

        finally {

        }

        return existed;
    }


    //添加合法注册用户
    public void addUser(User user)
    {
        Connection connection = null;
        PreparedStatement statement = null;
        SQLException exception = null;

        String sql = "insert into UserInfor (user_name,user_passwd,user_address) values (?,?,?)";
        try {
            connection = DBUtils.getConnernection();
            statement = connection.prepareStatement(sql);
            statement.setString(1,user.getUser_name());
            statement.setString(2,user.getUser_passwd());
            statement.setString(3,user.getUser_address());
            statement.executeUpdate();
        } catch (SQLException e) {
            exception = e;
        }

        finally {

        }
    }

//    //判断用户的昵称和密码是否匹配
//    public User getUser(User user)
//    {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        SQLException exception = null;
//        User user1 = null;
//
//        String sql = "select user_passwd from UserInfor where user_name = ?";
//        try {
//            connection = dataSource.getConnection();
//            statement = connection.prepareStatement(sql);
//            statement.setString(1,user.getUser_name());
//            ResultSet resultSet = statement.executeQuery();
//            if(resultSet.next()) {
//                //查询到的账户数据封装为User对象
//                user1 = new User(user.getUser_name(),resultSet.getString(1),resultSet.getString(2));
//
//            }
//        } catch (SQLException e) {
//            exception = e;
//        }
//        finally {
//
//        }
//
//        return user1;
//    }
}