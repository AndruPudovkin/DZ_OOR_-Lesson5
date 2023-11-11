package controller;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentGroupView;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService dataService =new DataService();
    private  final StudentView studentView = new StudentView();
    private final StudentGroupView studentGroupView =new StudentGroupView();
    private  final StudentGroupService studentGroupService = new StudentGroupService();




    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName,secondName,lastName,Type.TEACHER);
    }
    public void getALLstudent (){
        List<User> userList = dataService.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }


    public void createStudentGroup(){
        int id = 1;
        List<Student>students =new ArrayList<>();
        List<User> studentList = dataService.getAllStudent();
        List<User> teacherList = dataService.getAllTeacher();
        for(User user: studentList){
            if (id <= ((Student) user).getStudentId()){
                id++;
                students.add((Student) user);
            }
            else {
                id = 1;
            }
        }
        for(User teacher: teacherList){
            studentGroupService.create(students,(Teacher) teacher);
        }
    }

    public void getAllStudentGroup(){
        List<StudentGroup> list = studentGroupService.getStudentGroupList();
        for (StudentGroup students:list ) {
            studentGroupView.printStudentGroup(students);
        }
    }

}
