public class Problem08 {
    public static void main(String[] args) {
        ATM sbi = new SBI();
        ATM icici = new ICICI();
        sbi.withdraw();
        icici.withdraw();
    }       
}
abstract class ATM{
    abstract void withdraw();
    int a;
    int b;
    void deposit(){

    }
}
class SBI extends ATM{
    void withdraw(){
        System.out.println("SBI Withdraw");
    }
}
class ICICI extends ATM{
    void withdraw(){
        System.out.println("ICICI Withdraw");
    }
}