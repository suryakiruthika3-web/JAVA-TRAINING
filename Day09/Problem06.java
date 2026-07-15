public class Problem06 {
    public static void main(String[] args) {
        Student s = new Student(26, "Kiruthika");
        s.display();
    }
}
class Student {
    int SId;
    String name;
    Student(int SId, String name) {
        this.SId = SId;
        this.name = name;
    }

    void display() {
        System.out.println("ID: "+SId);
        System.out.println("Name: "+name);
    }
}
