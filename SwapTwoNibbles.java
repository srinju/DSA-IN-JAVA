import java.util.*;

public class SwapTwoNibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int swapNum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println("number after swapping nibbles : " + swapNum);
        sc.close();
    }
}
// × is by alt 0215