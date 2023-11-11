package model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    List<Student> studentList ;
    Teacher teacher;


    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;

    }



    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentList=" + studentList +
                "\n teacher=" + teacher +
                '}';
    }
}
