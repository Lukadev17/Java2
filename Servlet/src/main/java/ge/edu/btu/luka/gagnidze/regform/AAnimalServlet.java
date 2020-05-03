package ge.edu.btu.luka.gagnidze.regform;



import ge.edu.btu.luka.gagnidze.regform.model.AAnimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aanimalservlet")
public class AAnimalServlet extends HttpServlet {
    AAnimal aanimal=new AAnimal();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        aanimal.setName(req.getParameter("name"));
        aanimal.setJishi(req.getParameter("jishi"));
        aanimal.setSqesi(req.getParameter("sqesi"));
        aanimal.setAge(req.getParameter("age"));

        System.out.println(aanimal.getName());
        System.out.println(aanimal.getJishi());
        System.out.println(aanimal.getSqesi());
        System.out.println(aanimal.getAge());

    }

}
