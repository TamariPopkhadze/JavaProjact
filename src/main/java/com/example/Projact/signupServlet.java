package com.example.Projact;


import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "signupServlet", value = "/signup-servlet")
public class signupServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("username");
        String firstname = request.getParameter("firstname");
        String surname = request.getParameter("surname");
        String profession = request.getParameter("profession");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("repeatPassword");
        User User = new User();
        User.setUsername(email);
        DatabasesManager DB = new DatabasesManager();
        if (DB.containSignUp(User)){
            RequestDispatcher dispatcher = request.getRequestDispatcher("thisUserExist.jsp");
            dispatcher.forward(request,response);
        }else
        if (repeatPassword == null || !repeatPassword.equals(password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("errorsignup.jsp");
            request.setAttribute("username",email);
            request.setAttribute("firstname",firstname);
            request.setAttribute("surname",surname);
            request.setAttribute("profession",profession);
            request.setAttribute("password",password);
            dispatcher.forward(request,response);
        } else {
            User user = new User();
            user.setUsername(email);
            user.setFirstname(firstname);
            user.setSurname(surname);
            user.setProfession(profession);
            user.setPassword(password);
            DatabasesManager db = new DatabasesManager();
            db.insert(user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("userpage.jsp");
            request.setAttribute("USERNAME",user.getUsername());
            request.setAttribute("password",user.getPassword());
            request.setAttribute("username",user.getUsername());
            request.setAttribute("Firstname",user.getFirstname());
            request.setAttribute("Surname",user.getSurname());
            request.setAttribute("profession", user.getProfession());
            dispatcher.forward(request, response);

        }
    }
}