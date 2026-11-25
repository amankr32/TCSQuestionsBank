//
//        ==================================================
//        FIBONACCI NUMBER - RECURSION & DP
//        ==================================================
//
//        Problem:
//        --------
//        Given an integer n, find the nth Fibonacci number.
//
//        Fibonacci Series:
//        -----------------
//        1, 1, 2, 3, 5, 8, 13, 21, ...
//
//        Definition:
//        -----------
//        F(0) = 1
//        F(1) = 1
//        F(n) = F(n-1) + F(n-2)
//
//
//        ==================================================
//        1. RECURSION
//        ==================================================
//
//        Pseudocode:
//        -----------
//        START
//
//        INPUT n
//
//        FUNCTION fibonacci(n)
//        IF n == 0 OR n == 1
//        RETURN 1
//        END IF
//
//        RETURN fibonacci(n-1) + fibonacci(n-2)
//        END FUNCTION
//
//        PRINT fibonacci(n)
//
//        STOP
//
//        Complexity:
//        -----------
//        Time  : O(2^n)
//        Space : O(n) [Recursion Stack]
//
//
//        ==================================================
//        2. DP - TABULATION
//        ==================================================
//
//        Approach:
//        ---------
//        Store previously calculated Fibonacci numbers
//        in a DP array to avoid repeated calculations.
//
//        Pseudocode:
//        -----------
//        START
//
//        INPUT n
//
//        IF n == 0 OR n == 1
//        PRINT 1
//        STOP
//        END IF
//
//        CREATE dp array of size n + 1
//
//        dp[0] = 1
//        dp[1] = 1
//
//        FOR i = 2 TO n
//        dp[i] = dp[i-1] + dp[i-2]
//        END FOR
//
//        PRINT dp[n]
//
//        STOP
//
//        Complexity:
//        -----------
//        Time  : O(n)
//        Space : O(n)
//
//
//        ==================================================
//        3. SPACE OPTIMIZED DP
//        ==================================================
//
//        Approach:
//        ---------
//        Fibonacci depends only on the previous two values.
//        Therefore, we use two variables instead of a DP array.
//
//        Pseudocode:
//        -----------
//        START
//
//        INPUT n
//
//        IF n == 0 OR n == 1
//        PRINT 1
//        STOP
//        END IF
//
//        prev2 = 1
//        prev1 = 1
//
//        FOR i = 2 TO n
//        curr = prev1 + prev2
//
//        prev2 = prev1
//        prev1 = curr
//        END FOR
//
//        PRINT prev1
//
//        STOP
//
//        Complexity:
//        -----------
//        Time  : O(n)
//        Space : O(1)
//
//
//        ==================================================
//        DRY RUN
//        ==================================================
//
//        Input:
//        ------
//        5
//
//        Calculation:
//        ------------
//        F(0) = 1
//        F(1) = 1
//        F(2) = 1 + 1 = 2
//        F(3) = 2 + 1 = 3
//        F(4) = 3 + 2 = 5
//        F(5) = 5 + 3 = 8
//
//        Output:
//        -------
//        8
//
//
//        ==================================================
//        QUICK REVISION
//        ==================================================
//
//        Recursion:
//        O(2^n) Time | O(n) Space
//
//        DP Tabulation:
//        O(n) Time   | O(n) Space
//
//        Optimized DP:
//        O(n) Time   | O(1) Space
//
//        KEY IDEA:
//        Fibonacci requires only the previous two values.
//        So, storing the complete DP array is unnecessary.
//
//        ==================================================

package NumberBasedProblems;
import java.util.Scanner;

//public class FibonacciSeries {
//    static int fibonacci (int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        System.out.println(fibonacci(num));
//        input.close();
//    }
//}

//DP

//public class FibonacciSeries {
//    static int fibonacci (int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        int[] dp = new int[n + 1];
//
//        dp[0] = 1;
//        dp[1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        System.out.println(fibonacci(num));
//        input.close();
//    }
//}


//optimized DP

public class FibonacciSeries {
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev2 = 1;
        int prev1 = 1;
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));

        sc.close();
    }
}


