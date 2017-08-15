package Dao.DaoConn;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * Created by dongmengyuan on 17-8-14.
 */

public class DBUtils {
    public static String URL;
    public static String USERNAME;
    public static String PASSWD;
    public static String Driver;

    //加载配置文件
    //利用resourse目录操作配置文件时，应该用resourceBundel来操作文件
    private static ResourceBundle rb = ResourceBundle.getBundle("db-config");

    //静态代码块在加载类时只会被执行一次
    static {
        URL = rb.getString("jdbc.URL");
        USERNAME = rb.getString("jdbc.USERNAME");
        PASSWD = rb.getString("jdbc.PASSWD");
        Driver = rb.getString("jdbc.Driver");

        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //开启数据库连接
    public static Connection getConnernection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("获取连接失败！");

        }
        return conn;
    }

    //关闭数据库连接
    public static void close(ResultSet resultSet, Statement statement,Connection connection) {
        try {
            if(resultSet != null) {
                resultSet.close();
            }
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
