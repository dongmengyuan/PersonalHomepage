package Dao.ValueObject;

import java.util.Date;

/**
 * Created by dongmengyuan on 17-8-15.
 */

public class Blah {
    private int dynamaic_id;
    private int user_id;
    private String cre_infor;
    private Date cre_time;

    public int getDynamaic_id()
    {
        return dynamaic_id;
    }
    public void setDynamaic_id(int dynamaic_id)
    {
        this.dynamaic_id = dynamaic_id;
    }
    public int getUser_id()
    {
        return user_id;
    }
    public void setUser_id(int user_id)
    {
        this.user_id = user_id;
    }
    public String getCre_infor()
    {
        return cre_infor;
    }
    public void setCre_infor(String cre_infor)
    {
        this.cre_infor = cre_infor;
    }
    public Date getCre_time()
    {
        return cre_time;
    }
    public void setCre_time(Date cre_time)
    {
        this.cre_time = cre_time;
    }
}
