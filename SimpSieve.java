
//simple is used to find the prime number upto a given number n
//make an array and make all the numbers true in the boolean array
//mark 0 and 1 as the non prime numbers

import java.util.*;

public class SimpSieve {
    public static void main(String[] args) {
        int n = 10 ; //find primes upto 10
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true); //make all the numbers inside the array as true  for prime
        //make 0 and 1 as non prime numbers .
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2 ; i*i <= n ; i++) { //this is how we iterate inside an array to find the multiples of an element inside the array by iterating through each element 
            if(isPrime[i]) {
                for(int j = i*i ; j <=n ; j+=i) { //selecting the multiples of the selected array of each index iterating over
                    isPrime[j] = false; // mark multiples of i as non prime.
                }
            }
        }

        //print all prime numbers >>
        System.out.println( " Prime numbers up to " +n + ":");
        for(int i =2 ; i <=n ; i++) {
            if(isPrime[i]){
                System.out.println(i + " ");
            }
        }
    }
}