package Dao.DaoObject;

import Dao.DaoConn.DBUtils;
import Dao.IDao.BlahDao;
import Dao.ValueObject.Blah;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongmengyuan on 17-8-15.
 */
public class BlahDaoImpl implements BlahDao {

    //
    public List<Blah> getBlahs(Blah blah)
    {
        Connection connection = null;
        PreparedStatement statement = null;
        SQLException exception = null;
        List<Blah> blahs = null;
        String sql = "select cre_infor,cre_time form Dynamaic where user_name = ?";

        try {
            connection = DBUtils.getConnernection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,blah.getUser_id());
            ResultSet resultSet = null;
            blahs = new ArrayList<Blah>();
            while(resultSet.next()) {

                //有问题
                blahs.add(new Blah());

            }
        } catch (SQLException e) {
            exception = e;
        }
        finally {

        }

        return blahs;

    }

    //添加动态
    public void addBlah(Blah blah)
    {
        Connection connection = null;
        PreparedStatement statement = null;
        SQLException exception = null;

        String sql = "insert into Dynamaic (user_id,cre_infor,cre_time) values (?,?,?)";
        try{
            connection = DBUtils.getConnernection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,blah.getUser_id());
            //statement.setTimestamp(2,new Timestamp(blah.getDate().getTime));
            statement.setString(3,blah.getCre_infor());
            statement.executeUpdate();

        } catch (SQLException e) {
            exception = e;
        }
        finally {

        }

    }

//    //删除动态
//    public void deleteBlah(Blah blah)
//    {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        SQLException exception = null;
//        String sql = "delete from Dynamaic where user_id = ?";
//
//    }
}
