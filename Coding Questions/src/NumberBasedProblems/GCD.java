//
//==================================================
//GCD - GREATEST COMMON DIVISOR
//==================================================
//
//Problem:
//        --------
//Given two integers a and b, find their Greatest
//Common Divisor (GCD).
//
//Definition:
//        -----------
//GCD is the largest positive integer that divides
//both numbers without leaving a remainder.
//
//Example:
//        --------
//a = 12
//b = 8
//
//Factors of 12:
//        1, 2, 3, 4, 6, 12
//
//Factors of 8:
//        1, 2, 4, 8
//
//Common Factors:
//        1, 2, 4
//
//GCD = 4
//
//
//        ==================================================
//APPROACH
//==================================================
//
//Use the Euclidean Algorithm.
//
//        1. If b == 0, return a.
//2. Otherwise, calculate gcd(b, a % b).
//        3. Repeat until b becomes 0.
//        4. The final value of a is the GCD.
//
//
//        ==================================================
//PSEUDOCODE
//==================================================
//
//START
//
//        INPUT a, b
//
//FUNCTION gcd(a, b)
//
//IF b == 0
//RETURN a
//ELSE
//RETURN gcd(b, a MOD b)
//END IF
//
//END FUNCTION
//
//PRINT gcd(a, b)
//
//STOP
//
//
//==================================================
//JAVA 8 CODE
//==================================================
//
//        import java.util.Scanner;
//
//public class Main {
//
//    static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(gcd(a, b));
//
//        sc.close();
//    }
//}
//
//
//==================================================
//DRY RUN
//==================================================
//
//Input:
//        ------
//        12 8
//
//Calculation:
//        -----------
//gcd(12, 8)
//gcd(8, 12 % 8)
//gcd(8, 4)
//
//gcd(8, 4)
//gcd(4, 8 % 4)
//gcd(4, 0)
//
//Since b == 0,
//GCD = 4
//
//Output:
//        -------
//        4
//
//
//        ==================================================
//COMPLEXITY ANALYSIS
//==================================================
//
//Time Complexity:
//        ---------------
//O(log(min(a, b)))
//
//Space Complexity:
//        ----------------
//O(log(min(a, b)))  [Recursion Stack]
//
//
//        ==================================================
//QUICK REVISION
//==================================================
//
//Algorithm:
//        ----------
//Euclidean Algorithm
//
//Formula:
//        -------
//gcd(a, b) = gcd(b, a % b)
//
//Base Condition:
//        --------------
//b == 0
//
//Return:
//        -------
//a
//
//KEY IDEA:
//        ---------
//Repeatedly replace the larger problem with the
//remainder until the remainder becomes zero.
//
//        ==================================================


package NumberBasedProblems;
import java.util.*;

public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(gcd(num1, num2));

        input.close();
    }
}
