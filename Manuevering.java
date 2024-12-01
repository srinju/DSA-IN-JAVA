import java.util.*;

public class Manuevering{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0 ; 
        int y = 0;
        System.out.println("enter w a s d to move and q or Q to quit the program");

        //infinte loop to run the program until user decides to quit >>
        while (true) {
            System.out.println("currnent position : (" + x + ", " + y + ")");
            System.out.println("enter the move : ");
            char move = sc.next().charAt(0); //take the first input of the user as the input move
            if(move == 'q' || move == 'Q'){
                System.out.println("exiting program");
                break; //exit the program
            }
            //switch case to handle to different inputs >>
            switch (move){
                case 'w' : 
                    y++;
                    break;
                case 's' : 
                    y--;
                    break;
                case 'a' : 
                    x--;
                    break;
                case  'd' : 
                    x++;
                    break;
                default : 
                    System.out.println("invalid move , use w a s d");
            }
        }
        sc.close();
    }
}