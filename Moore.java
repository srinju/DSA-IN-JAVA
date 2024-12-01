import java.util.*;

//this algorithm is for the better approach of the majority element in an array which is better optimal solution
//moore algo says that freq of majority element will be so high if different elements reduce its frequence then also it will be more

public class Moore {
    public static int majorityElement(int[] nums){
        int n = nums.length;
        int count = 0;
        int answer = 0;
        for(int i = 0  ; i < n ; i++){
            if(count == 0){ //make the first element as the answer that is nums[i] and iterate through the array
                answer = nums[i];
            }
            if(answer == nums[i]){ //if find that element again then make the count ++
                count++;
            } else { //else make the count --
                count--;
            }
        }
        return answer;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        int majority = majorityElement(nums);
        System.out.println("the majority element of the given araay is : " + majority );
    }
}
