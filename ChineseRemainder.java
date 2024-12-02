import java.util.*;


public class ChineseRemainder {
    static int CRT(int a[] , int m[] , int n , int p) {
        int x = 0;
        for(int i = 0 ; i<n ; i++) {
            int M = p/m[i] , y = 0; //finding M1 , M2 .... Mn
            for(int j = 0 ; j <m[i]  ; j++) {
                if((M*j)%m[i] == 1){
                    y=j ; //finding y1,y2 ... yn
                    break;
                }
            }
            x = x+a[i]*M*y;
        }
        return x%p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of congruence relations : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter the value of a(remainders) ");
        for(int i = 0 ; i < size ; i++) {
            a[i] = sc.nextInt();
        }
        int m[] = new int[size];
        int p = 1;
        System.out.println("Enter the value of m (moduli) : ");
        for(int i = 0 ; i < size ; i++) {
            m[i] = sc.nextInt();
            p = p*m[i]; //calculation of the M
        }
        System.out.println("the solution is " + CRT(a, m, size, p));
        sc.close();
    }
}