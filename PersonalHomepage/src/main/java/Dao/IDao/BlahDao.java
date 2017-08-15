package Dao.IDao;

import Dao.ValueObject.Blah;

import java.util.List;

/**
 * Created by dongmengyuan on 17-8-15.
 */

public interface BlahDao {
    //
    List<Blah> getBlahs(Blah blah);
    //添加动态
    void addBlah(Blah blah);
//    //删除动态
//    void deleteBlah(Blah blah);
}
