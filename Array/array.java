import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6};
        System.out.println(Arrays.toString(arr));
        changeVal(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void changeVal(int [] nums){
        nums[0] = 99;
    }
}
