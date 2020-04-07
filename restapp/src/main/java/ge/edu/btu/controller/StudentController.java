package ge.edu.btu.controller;

import ge.edu.btu.model.Student;
import ge.edu.btu.model.Studentdata;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/studentManager")
public class StudentController {


    @GET
    @Path("/getStudentsData")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Student> getStudents(){
        return Studentdata.getInstance();
    }

    @POST
    @Path("/addStudent")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addStudent(Student student){
        ArrayList<Student> students=Studentdata.getInstance();
        students.add(student);
        System.out.println(student.toString());
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateStudent(@PathParam("id") int id,  Student student){
        ArrayList<Student> students=Studentdata.getInstance();
        for (int i=0; i<students.size(); i++ ){
            if (students.get(i).getId() == id){
                students.get(i).setName(student.getName());
                students.get(i).setAge(student.getAge());
                students.get(i).setId(student.getId());
            }


        }

    }

    @DELETE
    @Path("/{id}")
    public void deleteStudent(@PathParam("id") int id){
        ArrayList<Student> students=Studentdata.getInstance();
        for (int i=0; i<students.size(); i++){
            if (students.get(i).getId()==id){
                students.remove(i);
                System.out.println("id= "+id);
            }
        }

    }


}


