public class Problem13 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("I Love Java");

        sb.replace(7, 11, "Python");

        System.out.println(sb);
    }
}