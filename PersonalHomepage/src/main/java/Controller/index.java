package Controller;


import Dao.DaoFactory.DaoFactory;

import Dao.ValueObject.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by dongmengyuan on 17-8-14.
 */

@WebServlet("/index.do")
public class index extends HttpServlet {
    private final String SUCCESS_VIEW = "main.jsp";
    private final String FILLED_VIEW = "index.jsp";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        //获取表单中的属性值
//        String user_id = request.getParameter("user_id");
        String user_name = request.getParameter("user_name");
        String user_passwd = request.getParameter("user_passwd");
        String user_passwd1 = request.getParameter("user_passwd1");
        String user_addressid = request.getParameter("user_addressid");
        String user_address = request.getParameter("user_address");
        String user_image = request.getParameter("user_image");

        //判断密码是否相等
        if(!user_passwd.equals(user_passwd1)) {
            request.setAttribute("message","您两次输入的密码不相等");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            return;
        }

        //判断密码长度
        if(user_passwd.length() <= 6 && user_passwd.length() >= 16) {
            request.setAttribute("message","密码长度不符合6－16");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            return;
        }

        List<User> user_name1 = DaoFactory.getUserDaoInstance().isUserExisted(user_name);

        if(user_name1 != null)  {
            request.setAttribute("message","该昵称已经被占用");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
            return;
        } else {
            User user1 = new User();
            user1.setUser_name("user_name");
            user1.setUser_passwd("user_passwd");
//            //判断用　户昵称与密码匹配
//            if (DaoFactory.getUserDaoInstance().query(user_name,user_passwd))) {
//                response.sendRedirect("/main.jsp");
//            }


        }
    }









}
