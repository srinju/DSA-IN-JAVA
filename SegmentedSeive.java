import java.util.*;

public class SegmentedSeive {
    public static void segmentedSieve(int l , int r) {
        int limit = (int) Math.sqrt(r) + 1 ;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        //simple seive >>
        for (int i = 2 ; i*i <= limit ; i++) {
            if(isPrime[i]) {
                for(int j = i*i ; j <= limit ; j +=i) {
                    isPrime[j] = false;
                }
            }
        }

        //collect primes upto sqrt r
        List<Integer> primes = new ArrayList<>();
        for(int i = 2  ; i <= limit ; i++) {
            if(isPrime[i]) {
                primes.add(i);
            }
        }

        boolean[] rangePrime = new boolean[r-l+1];
        Arrays.fill(rangePrime, true);

        for(int prime : primes) {
            int start = prime * prime ;
            if(start < l){
                start = ((l+prime-1)/prime)*prime; //first multiple >= l
            }

            for(int j = start ; j<=r ; j+=prime){
                rangePrime[j-l] = false;
            }
        }

        for(int i = 0 ; i < rangePrime.length ; i++) {
            if(rangePrime[i] && i + l >=2) {
                System.out.println((i+l) + " ");
            }
        }
    }

    public static void main(String[] args) {
        int l = 10 , r = 50;
        segmentedSieve(l, r);
    }
}
