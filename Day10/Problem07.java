public class Problem07 {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.setStudentDetails(101,"Alice");
        s.getStudentDetails();
    }
}
interface Student{
    int Sid = 10;
    String Sname = "John";
    void setStudentDetails(int Sid,String Sname);
}
class StudentDetails implements Student{
    int Sid;
    String Sname;
    public void setStudentDetails(int Sid,String Sname){
        this.Sid = Sid;
        this.Sname = Sname;
    }
    public void getStudentDetails(){
        System.out.println("Student ID: " + Sid);
        System.out.println("Student Name: " + Sname);
    }
}