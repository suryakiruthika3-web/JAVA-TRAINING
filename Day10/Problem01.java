public class Problem01 {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.setEid(101);
            e.setEname("John");
            e.setEsalary(50000.0);
            System.out.println("Employee ID: " + e.getEid());
            System.out.println("Employee Name: " + e.getEname());
            System.out.println("Employee Salary: " + e.getEsalary());
        }
}
class Employee {
    int Eid;
    String Ename;
    double Esalary;
    public void setEid(int Eid) {
        this.Eid = Eid;
    }
    public void setEname(String Ename) {
        this.Ename = Ename;
    }
    public void setEsalary(double Esalary) {
        this.Esalary = Esalary;
    }
    public int getEid() {
        return Eid;
    }
    public String getEname() {
        return Ename;
    }
    public double getEsalary() {
        return Esalary;
    }

}
