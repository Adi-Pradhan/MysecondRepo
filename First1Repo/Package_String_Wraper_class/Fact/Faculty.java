package Fact;

import Stud.Student;

public class Faculty {
    public static void main(String[] args) {
        Student st=new Student(11,83);
        Student st1=new Student(12,45);
        Student st2=new Student(13,67);
        Student st3=new Student(14,76);
        Student stt=new Student(15,62);
        int roll_no=st.getRoll_no();
        getStudentMarks(roll_no,st);
    }

    private static void getStudentMarks(int roll_no, Student st) {
        if(st.getRoll_no()==roll_no){
       System.out.println(st.getMarks()); 
        }
    }

   
}
