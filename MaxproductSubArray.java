import java.util.*;

public class MaxproductSubArray{
    public static int MaxProduct(int[] nums){
        int length = nums.length;
        //base case >>
        if(length == 0) return 0;
        //set variables >>
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i = 1 ; i < length ; i++) { //we start from 1st index coz we setting the variable max min and result as the first element of the array so the rest calculation should be done from the 1st index of the array
            int temp_max = Math.max(nums[i]*max, Math.max(nums[i] * min , nums[i]));
            min = Math.max(nums[i]*max, Math.max(nums[i] * min , nums[i]));
            max = temp_max;
            result = Math.max(result, max);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int answer = MaxProduct(nums);
        System.out.println("the maximum product subarray of the given array is : " + answer);
        sc.close();
    }
}