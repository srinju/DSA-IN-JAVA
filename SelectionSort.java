import java.util.*;

public class SelectionSort {
    public static void selectionsort(int[] nums){
        Arrays.sort(nums);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of the array : ");
        for(int i = 0 ;  i < n ; i ++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        selectionsort(nums);
        System.out.println("sorted array is : " +  Arrays.toString(nums) );
    }
}
