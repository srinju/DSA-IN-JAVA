import java.util.*;

public class WeightedSubstring {
    public static int calculateWeight(String str){
        int weight = 0;
        for(char c : str.toCharArray()){
            weight += (c - 'a' + 1);
        }
        return weight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string(lowecase only) : ");
        String input = sc.nextLine();
        int totalweight = 0;
        sc.close();
        int n = input.length();
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                String subString = input.substring(i, j+1); //ab bc eigulor jonne
                totalweight += calculateWeight(subString);
            }
        }
        System.out.println("total weighted sum is : " + totalweight);
    }
}