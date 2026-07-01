//package Day10;
public class Problem02 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBankDetails("SBI","Mumbai",101);
        System.out.println("Bank Name: " + b.getBname());
        System.out.println("Bank Branch: " + b.getBbranch());
        System.out.println("Bank ID: " + b.getBid());
    }
}
class Bank{
    private String Bname;
    String Bbranch;
    public int Bid;
    public void setBankDetails(String Bname,String Bbranch,int Bid){ 
        this.Bname = Bname;
        this.Bbranch = Bbranch;
        this.Bid = Bid;
    }
    public String getBname() {
        return Bname;
    }   
    public String getBbranch() {
        return Bbranch;
    }
    public int getBid() {
        return Bid;
    }
}