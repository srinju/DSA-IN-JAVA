import java.util.*;

//majority element is the elemeent in the array that appears more than [n/2] times 

public class MajorityElement {
    public static int majorityElement(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int count = 0 ;
            for(int j = 1 ; j < n ; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > Math.floor(n/2)){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = majorityElement(arr);
        System.out.println("the majority element in the given array is : " + result);
    }
}
