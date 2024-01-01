public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println(a +" "+ b);
    }

    static void swap (int a,int b){
        //they are not chaning the previous one it's creating a new object
        int temp = a;
        a=b;
        b=temp;
    }
}
