import java.util.*;

public class BlockSwapClockwise{
    public static void reverse(int[] nums , int low , int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    public static void rotate(int[] nums , int k){
        int n = nums.length;
        k = k % n; //for k > n (runtime error handling) 

        reverse(nums, 0, n-k-1);//left part swap
        reverse(nums, n-k, n-1); //right part swap
        reverse(nums, 0, n-1); //full array swap
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of the array : ");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations : ");
        int k = sc.nextInt();
        rotate(nums, k);
        System.out.println("Array after " + k + "rotations : ");
        for(int num : nums) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}