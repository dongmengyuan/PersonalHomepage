package Dao.DaoFactory;



import Dao.DaoObject.UserDaoImpl;

import Dao.IDao.UserDao;

/**
 * Created by dongmengyuan on 17-8-14.
 */
public class DaoFactory {

    public static UserDao getUserDaoInstance() {
        return new UserDaoImpl();
    }


}
