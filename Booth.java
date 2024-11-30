import java.util.*;
public class Booth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the multiplicand : ");
        int a = sc.nextInt();
        System.out.println("enter the multiplier : ");
        int b = sc.nextInt();
        sc.close();
        int product = 0;
        int n = Integer.toBinaryString(a).length();
        for(int i=  0 ; i < n ; i++) {
            int currentBit = (a & 1);
            if(currentBit == 1) {
                product += b;
            }
            b <<= 1;
            a >>= 1;
        }
        System.out.println("Result of booth's algorithm is :"  + product);
    }    
}
