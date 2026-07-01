public class Problem06 {
    public static void main(String[] args) {
        Problem06 p = new Problem06();
        System.out.println("Sum is: " + p.sum(10, 20, 30, 40, 50));
        System.out.println("Sum is: " + p.sum(25, 46, 64, 78, 54));
    }
    int sum (int... arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    
}

