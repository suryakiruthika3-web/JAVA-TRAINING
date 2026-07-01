public class Problem05 {
    public static void main(String[] args) {
        Problem05 p = new Problem05();
        System.out.println("Maximum value is: " + p.max(10, 20, 30, 40, 50));
        System.out.println("Maximum value is: " + p.max(25, 46, 64, 78, 54));
    }
    int max (int... arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}

