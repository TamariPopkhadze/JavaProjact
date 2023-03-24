package com.example.Projact;


import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(email,password);
        DatabasesManager db = new DatabasesManager();
        String firstname = db.getUserName(user);
        String surname = db.getUserLasName(user);
        String profession = db.getUserProf(user);

        if (db.contain(user)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("userpage.jsp");
            request.setAttribute("username",email);
            request.setAttribute("password",password);
            request.setAttribute("Firstname",firstname);
            request.setAttribute("Surname",surname);
            request.setAttribute("profession", profession);
            request.setAttribute("USERNAME",email);
            dispatcher.forward(request,response);
        }else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("errorSignin.jsp");
            dispatcher.forward(request,response);
        }
    }
}