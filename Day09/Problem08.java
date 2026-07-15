public class Problem08 {
    public static void main(String[] args) {
        Student s = new Studentdetails();
        s.details(26, "Kiruthika");
    }
}
class Student {
    int sid;
    String sname;
    void details(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
}
class Studentdetails extends Student {
    void details(int sid, String sname) {
        super.details(sid, sname);
        System.out.println("Id: "+sid);
        System.out.println("Name: "+sname);
    }
}
