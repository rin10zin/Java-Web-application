package servlet.user;

import domains.user.User;
import service.user.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by userpc on 5/11/2016.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        UserService userService = new UserService();
        User user = userService.getUser(name, pass);

        if (user!=null) {

            HttpSession session = request.getSession(false);
            session.setAttribute("user", user);

           // request.setAttribute("user", user);
            request.setAttribute("message", "Login S.uccessful");

            RequestDispatcher rd = request.getRequestDispatcher("user/home.jsp");
            rd.forward(request, response);
        }else {
            request.setAttribute("message","Login Failed");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession(false);
        session.invalidate();

        request.setAttribute("message","Successfully Logged out");
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
