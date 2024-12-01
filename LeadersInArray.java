import java.util.*;

public class LeadersInArray{
    public static void findLeaders(int[] arr){
        int n = arr.length;
        int maxfromright = arr[n-1]; //initially leader is the last element of the array
        System.out.println("Leaders : " + maxfromright);
        for(int i = n-2 ; i >= 0 ; i--) { //ulta chalo and if the present index is greater than the maxfrom right then make the maxfrom right as the present index element and print the maxfromright 
            if(arr[i] > maxfromright){
                maxfromright = arr[i];
                System.out.println(" " + maxfromright);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemets of the array  : ");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        findLeaders(arr);
        sc.close();        
    }
}