package servlet.user;

import domains.user.User;
import service.user.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by userpc on 5/13/2016.
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = request.getParameter("page");

        if (page.equalsIgnoreCase("list")) {

            List<User> userList = new UserService().getUserList();
            request.setAttribute("userList", userList);
            RequestDispatcher rd = request.getRequestDispatcher("user/list.jsp");
            rd.forward(request, response);
        }
        if (page.equalsIgnoreCase("edit")) {

        }
        if (page.equalsIgnoreCase("delete")) {

        }

        if (page.equalsIgnoreCase("update")) {

        }

        if (page.equalsIgnoreCase("add")) {

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
