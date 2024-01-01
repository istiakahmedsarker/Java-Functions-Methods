import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4,5,6,9,7,8,9);
        multiple(2,3,1,22,32,2,2356,41,6,48,4,6,84,984,65,1);
    }

    static void multiple(int a, int b, int ...v){
        System.out.println(a+" "+ b +" " + v);
    }
    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
    }
}
