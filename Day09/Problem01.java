public class Problem01 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.greet(26,"Kiruthika");
    }
}
class Student {
    int rollno;
    String name;
    void greet(int rollno, String name) {
        System.out.println("Hi, I am " + name + " and my Roll number is: "+rollno);
    }
}
