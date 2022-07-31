package Stud;

public class Student {
    public int roll_no;
    int marks;
    public Student(int roll_no,int marks){
        this.roll_no=roll_no;
        this.marks=marks;
    }
    public static void main(String[] args) {
        
    }
    public int getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
