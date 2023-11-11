package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<StudentGroup> studentGroupList;

    public StudentGroupService() {
        this.studentGroupList = new ArrayList<>();
    }


    public void create( List<Student> studentList, Teacher teacher ){
        StudentGroup studentGroup= new  StudentGroup(studentList, teacher);
        studentGroupList.add(studentGroup);
    }
    public List<StudentGroup> getStudentGroupList(){
        List<StudentGroup> list = new ArrayList<>();
        for(StudentGroup studentGroup: studentGroupList){
            list.add(studentGroup);
        }
        return list;
    }


}
