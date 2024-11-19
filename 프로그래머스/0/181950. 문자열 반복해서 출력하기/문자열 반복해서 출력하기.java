import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
//         StringBuilder answer = new StringBuilder();
        
//         for(int i=1; i<=n; i++){
//             answer.append(str);
//         }
        
//         System.out.print(answer.toString());
        
        System.out.print(str.repeat(n));
    }
}