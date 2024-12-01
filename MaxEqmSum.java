import java.util.*;

public class MaxEqmSum {
    public static int maxEqmsum(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++){
            int leftsum = 0;
            int rightsum = 0;
            for(int j = 0 ; j < i ; j++){
                leftsum += arr[j]; //calculate sum of elements to the left of i
            }
            for(int j = i + 1 ; j < n ; j++ ){
                rightsum += arr[j]; //calculate sum of elements to the right of i
            }
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        //base case >>
        if(n<3 || n == 0){
            System.out.println("invalid length of the array");
        }
        int[] arr = new int[n];
        System.out.println("enter the elements of the array : ");
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int equilibriumIndex = maxEqmsum(arr);
        if(equilibriumIndex != -1){
            System.out.println("Eqm index is : " + equilibriumIndex);
        } else {
            System.out.println("equilibrum index not found as the array is motherfuckin not equilibrium!!!");
        }
    }
}
 