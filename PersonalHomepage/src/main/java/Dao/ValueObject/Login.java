package Dao.ValueObject;

/**
 * Created by dongmengyuan on 17-8-14.
 */
public class Login {
    private String user_name;
    private String user_passwd;

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_passwd() {
        return user_passwd;
    }
    public void setUser_passwd(String user_passwd) {
        this.user_passwd = user_passwd;
    }
}
