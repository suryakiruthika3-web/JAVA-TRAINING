public class Problem05 {
    public static void main(String args[]){
        Bank b = new Bank();
        System.out.println("Balance Amount: "+(b.balance(10000,2500)));
    }
}
class Bank {
    long initialbalance;
    int depositamt;
    double balance(double initialbalance, int depositamt) {
        return initialbalance + depositamt;
    }
}
