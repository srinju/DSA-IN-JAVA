import java.util.*;
public class Permutaion {
    public static void permute(String s , int idx){
        if(idx == s.length() - 1){
            System.out.println(s);
        }
        for(int i = idx ; i < s.length() ; i ++){
            s = swap(s,idx,i);
            permute(s, idx + 1);
            s = swap(s,idx,i);
        }
    }
    static String swap(String s , int i, int j){
        char arr[] = s.toCharArray();
        char temp = arr[j];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();
        sc.close();
        permute(s, 0);
    }
}
