import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]= 99;// same obj will be changed bcz we are modifing it not changing the entire thin
    }
}