public class Problem02 {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.employeeid(26);
        e.employeename("Kiruthikasurya");
        e.employeesalary(1200000.00000);
    }
}
class Employee {
    int EID;
    String Ename;
    double Esalary;

    void employeeid(int EID) {
        System.out.println("Employee ID: "+ EID);
    }
    void employeename(String Ename) {
        System.out.println("Employee Name: "+ Ename);
    }
    void employeesalary(double Esalary) {
        System.out.println("Employee Salary: "+ Esalary);
    }
}