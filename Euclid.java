import java.util.*;

public class Euclid {
    public static int gcd(int a , int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for n1 : ");
        int n1 = sc.nextInt();
        System.out.println("enter the value of n2 : ");
        int n2 = sc.nextInt();
        sc.close();
        int g = gcd(n1, n2);
        System.out.println("the gcd of n1 and n2 : " + g);
    }
}
