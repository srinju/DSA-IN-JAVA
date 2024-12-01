import java.util.*;

public class JosephusTrap{
    public static int josphus(int n , int k){
        if(n==1){
            return 1;
        }
        return (josphus(n-1, k) + k-1) % n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of people : ");
        int n = sc.nextInt();
        System.out.println("enter the kth people to get killed : ");
        int k = sc.nextInt();
        sc.close();
        int safeposition = josphus(n, k);
        System.out.println("the safest position is : " + safeposition);
    }
}