import java.util.*;
public class MaxSumHourGlass {
    public static int findMaxSum(int x , int y , int m[][]){
        if(x <= 2 || y <= 2){
            return -1;
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < x-2 ; i++){
            for(int j = 0 ; j < y-2 ; j++){
                int sum = m[i][j] + m[i][j+1] + m[i][j+2] + m[i+1][j+1] + m[i+2][j] + m[i+2][j+1] + m[i+2][j+2];
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and colums : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("enter matrix elements : ");
        int[][] m = new int[x][y];
        for(int i = 0 ; i < x ; i ++){
            for(int j = 0 ; j < y ; j++){
                m[i][j] = sc.nextInt();
            }
        }
        int maxSum = findMaxSum(x, y, m);
        if(maxSum == -1){
            System.out.println("the matrix is too small");
        } else {
            System.out.println("max hour glass sum : " + maxSum);
        }
        sc.close();
    }
}
