import java.util.*;

//binary number reads the same from forward and backward

public class BinaryPalindrome {
    static boolean isbinarypalindrome(int num){
        String binary = Integer.toBinaryString(num);
        int n = binary.length();
        int left = 0 ; int right = n - 1 ;
        while(left < right){
            if(binary.charAt(left) != binary.charAt(right)){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int num = sc.nextInt();
        if(isbinarypalindrome(num)){
            System.out.println(num + "is a binary palindrome!!");
        } else {
            System.out.println(num + "is not a binary palindrome!!");
        }
    }
}
