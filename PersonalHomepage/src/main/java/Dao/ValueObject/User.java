package Dao.ValueObject;

/**
 * Created by dongmengyuan on 17-8-14.
 */

public class User {
    private int user_id;
    private String user_name;
    private String user_passwd;
    private int  user_addressid;
    private String user_address;
    private String user_image;


    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
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
    public int getUser_addressid() {
        return user_addressid;
    }
    public void setUser_addressid(int user_addressid) {
        this.user_addressid = user_addressid;
    }
    public String getUser_address() {
        return user_address;
    }
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
    public String user_image() {
        return user_image;
    }
    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

}
