package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * Created by dongmengyuan on 17-8-14.
 */

@WebServlet("/login.do")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        HttpSession session = request.getSession();

        String user_name = (String)request.getAttribute("user_name");
        String user_passwd = (String)request.getAttribute("user_passwd");

        //检查获取到的数据
        if(user_name == null || user_passwd ==null) {
            //从提交的表单中获取昵称和密码
            user_name = request.getParameter("user_name");
            user_passwd = request.getParameter("user_passwd");

        }
    }
}
