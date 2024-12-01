import java.util.*;

//make two strings with string builders , one for -   and one for cahrecters
//run a fror loop and if - then append it to hyphen and if char then append to char string
//now add both - str + char str ,  add them after converting them to a stirng 
//make sure to break the charecter string toCharArray as it breaks the string elements into a stirng array

public class MoveHiphensToBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        StringBuilder hyphens = new StringBuilder(); //take mutable strings
        StringBuilder result = new StringBuilder();
        sc.close();
        //separatting the hyphens and otheer charecters >> 
        for(char c : input.toCharArray()){ //convert the strings's charecters to an array
            if(c == '-'){
                hyphens.append(c); 
            } else {
                result.append(c);
            }
        }
        String output  = hyphens.toString() + result.toString(); //add the string after converting them to immutable string as stringbuilder is mutable
        System.out.println("the result after moving the stirngs to the beginning is  : " +  output);
    }
}
