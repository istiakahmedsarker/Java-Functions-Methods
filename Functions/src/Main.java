import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sum();
        System.out.println(sum2());
    }
//    return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = in.nextInt();
        System.out.println("Enter num2");
        int num2 = in.nextInt();
        int ans = num1 + num2;
        return ans;
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = in.nextInt();
        System.out.println("Enter num2");
        int num2 = in.nextInt();
        int ans = num1 + num2;
        System.out.println("Sum of these number:"+ ans);
    }
}