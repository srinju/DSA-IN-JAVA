import java.util.*;

//make a list of prime numbers and add 2 to the list
//make a list of odd numbers and store all the odd numbers from 3 to n
//mark all the multiples as -1 in odd nos list
//move all the odd nos list to prime numbers list
//print all the values in prime list except -1

public class IncrementalSeive {
    public static List<Integer> incrementalSeive(int limit) {
        List<Integer> oddnos = new ArrayList<>(); //make the odd nos list
        for(int i = 3 ; i <= limit ; i=i+2) {
            oddnos.add(i); //add all the odd nos from 3 to n
        }
        List<Integer> primes = new ArrayList<>(); // make the list of prime numbers
        primes.add(2); //add 2 to the list

        for(int i = 0 ; i < oddnos.size() ; i++) {
            int current  = oddnos.get(i);
            if(current != -1) {
                primes.add(current); //after completing the below loop then the current gets added to the primes list
                for(int j = i ; j < oddnos.size() ; j++) {
                    if(oddnos.get(j) % current == 0) {
                        oddnos.set(j, -1); //in the oddnos list mark all the multiples as -1
                    }
                }
            }
        }
        return primes; //return the primes list
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit  : ");
        int n = sc.nextInt();
        List<Integer> primes = incrementalSeive(n);
        System.out.println("primes upto the limit " + n + "is : "  + primes);
    }
}
