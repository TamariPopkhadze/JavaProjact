package com.example.Projact;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateServlet", value = "/update-Servlet")
public class updateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String myValue  = request.getParameter("USERNAME");
        String username  = request.getParameter("username");
        String firstname = request.getParameter("firstname");
        String surname = request.getParameter("surname");
        String profession = request.getParameter("profession");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("repeatPassword");


        User user = new User();
        DatabasesManager db = new DatabasesManager();

        if (username.length()!=0){
            user.setUsername(username);
            if(db.containSignUp(user)){
                User User = new User();
                User.setUsername(myValue);
                DatabasesManager DB = new DatabasesManager();
                String Firstname = DB.getUserName(User);
                String Surname = DB.getUserLasName(User);
                String Profession = DB.getUserProf(User);
                String Password = DB.getPassword(User);
                RequestDispatcher dispatcher = request.getRequestDispatcher("errorUpdate.jsp");
                request.setAttribute("errorUsername",username);
                request.setAttribute("username",myValue);
                request.setAttribute("password",Password);
                request.setAttribute("USERNAME",myValue);
                request.setAttribute("Firstname",Firstname);
                request.setAttribute("Surname",Surname);
                request.setAttribute("profession", Profession);
                dispatcher.forward(request, response);
            }else {
                user.setKey(myValue);
                db.updateUsername(user);
                myValue = username;
            }

        }
        User User = new User();
        User.setUsername(myValue);


        if (password.length()!=0){
            user.setKey(myValue);
            user.setPassword(password);
            db.updatePassword(user);
        }
        if (firstname.length()!=0){
            user.setKey(myValue);
            user.setFirstname(firstname);
            db.updateFirstname(user);
        }
        if (surname.length()!=0){
            user.setKey(myValue);
            user.setSurname(surname);
            db.updateSurname(user);
        }
        if (profession.length()!=0){
            user.setProfession(profession);
            user.setKey(myValue);
            db.updateProfession(user);
        }


        DatabasesManager DB = new DatabasesManager();
        String Firstname = DB.getUserName(User);
        String Surname = DB.getUserLasName(User);
        String Profession = DB.getUserProf(User);
        String Password = DB.getPassword(User);
        RequestDispatcher dispatcher = request.getRequestDispatcher("userpage.jsp");
        request.setAttribute("USERNAME",User.getUsername());
        request.setAttribute("password",Password);
        request.setAttribute("username",User.getUsername());
        request.setAttribute("Firstname",Firstname);
        request.setAttribute("Surname",Surname);
        request.setAttribute("profession", Profession);
        dispatcher.forward(request, response);
    }
}