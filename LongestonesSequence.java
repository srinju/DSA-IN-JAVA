import java.util.*;

public class LongestonesSequence{
    static int longestSequence(int[] arr){
        int maxcount = 0 ;
        int count = 0 ;
        int previouscount = 0;
        
        for(int i = 0 ; i <arr.length ; i++) {
            if(arr[i] == 1){
                count ++;
            } else {
                previouscount = count;
                count = 0;
                //if the current bit is 0 then flip it and count the sequence>>
                while(i < arr.length && arr[i] == 0){
                    count++;
                    i++;
                }
                //add the prev squence to the current one 
                maxcount = Math.max(maxcount, previouscount + count);
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the binary array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the binary array : ");
        for(int i = 0  ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = longestSequence(arr);
        System.out.println("longest sequence of 1's after flipping the 0 bit is  : " + result);

    }
}