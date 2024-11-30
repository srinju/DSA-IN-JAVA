import java.util.*;

//simplify multiplications for bigger numbers

public class Karatsuba {
    public static int getNumDigits(int x){
        if(x == 0) {
            return 1;
        }
        int count = 0;
        while (x > 0) {
            count ++;
            x /=10;
        }
        return count;
    }

    public static int karatsubathatshit(int x , int y) {
        if(x < 10 || y < 10){ //just do x*y for small numbers
            return x*y;
        }
        int m = Math.max(getNumDigits(x), getNumDigits(y));
        int halfM = m/2;
        int powerof10 = (int) Math.pow(10, halfM);
        int a = x / powerof10;
        int b = x % powerof10;
        int c = y / powerof10;
        int d = y % powerof10;
        int ac = karatsubathatshit(a, c);
        int bd = karatsubathatshit(b, d);
        int abcd = karatsubathatshit(a + b , c + d);
        int result = ac * (int) Math.pow(10, 2*halfM) + (abcd - ac - bd)*powerof10 + bd;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first large number : ");
        int x = sc.nextInt();
        System.out.println("enter the second number : ");
        int y = sc.nextInt();
        sc.close();
        int product = karatsubathatshit(x, y);
        System.out.println("the product is : "  + product);
    }   
}
