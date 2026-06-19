/*
n = 11
* * * * * * * * * * *
* *               * *
*   *           *   *
*     *       *     *
*       *   *       *
*         *         *
*       *   *       *
*     *       *     *
*   *           *   *
* *               * *
* * * * * * * * * * *

 */

package patternprinting;
import java.util.*;
public class SquarePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if(row == 1 || row == n || col == 1 || col == n || row + col == n + 1 || row == col){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
