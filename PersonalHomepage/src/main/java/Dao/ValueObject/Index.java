package Dao.ValueObject;

import java.security.SecureRandom;

/**
 * Created by dongmengyuan on 17-8-14.
 */
public class Index {
    private String user_name;
    private String user_passwd;
    private String user_passwd1;

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String username) {
        this.user_name = user_name;
    }
    public String getUser_passwd() {
        return user_passwd;
    }
    public void setUser_passwd(String user_passwd) {
        this.user_passwd = user_passwd;
    }
    public String getUser_passwd1() {
        return user_passwd1;
    }
    public void setUser_passwd1(String user_passwd1) {
        this.user_passwd1 = user_passwd1;
    }
}
