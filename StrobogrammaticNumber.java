import java.util.*;

//storbogrammatic number is a number that looks the same when rotated 90 degrees

// 0 0
// 1 1
// 8 8 
// 6 9
// 9 6

public class StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num){

        Map<Character,Character> pairs = new HashMap<>();
        pairs.put('0', '0');
        pairs.put('1', '1');
        pairs.put('8', '8');
        pairs.put('6', '9');
        pairs.put('9', '6');

        int n = num.length();
        int left = 0 ; int right = n - 1;

        while(left <= right) {
            if(!pairs.containsKey(num.charAt(left)) || 
                pairs.get(num.charAt(left)) != num.charAt(right)){
                    return false;
            }
            left ++ ;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.nextLine();
        System.out.println(isStrobogrammatic(num));
        sc.close();
    }
}
