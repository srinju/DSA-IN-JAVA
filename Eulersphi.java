
// phi(2) jodi bole tale  > like gdc(1,2) dakho :  1 hole good , and gcd(2,2)  = 2 not good so phi(n) = gcd number of one counts  = 1
public class Eulersphi {
    static int gcd(int a , int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    static int phi(int n) {
        int result = 1;
        for(int i = 2 ; i < n ; i++) {
            if(gcd(i, n) == 1){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 36;
        int eulerstotient = phi(n);
        System.out.println("euler's totient function is : " + eulerstotient);
    }
}
