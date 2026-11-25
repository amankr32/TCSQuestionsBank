//
//        ==================================================
//        FACTORS OF A NUMBER
//        ==================================================
//
//        Problem:
//        --------
//        Given a positive integer n, print all the factors
//        of the number.
//
//        Definition:
//        -----------
//        A factor of a number is an integer that divides
//        the number completely without leaving a remainder.
//
//        Example:
//        --------
//        Number = 12
//
//        Factors:
//        1, 2, 3, 4, 6, 12
//
//        Because:
//        12 % 1  == 0
//        12 % 2  == 0
//        12 % 3  == 0
//        12 % 4  == 0
//        12 % 6  == 0
//        12 % 12 == 0
//
//
//        ==================================================
//        APPROACH
//        ==================================================
//
//        1. Take an integer n as input.
//        2. Loop from i = 1 to i <= n.
//        3. Check whether n % i == 0.
//        4. If true, print i.
//        5. Continue until all factors are found.
//
//
//        ==================================================
//        PSEUDOCODE
//        ==================================================
//
//        START
//
//        INPUT n
//
//        FOR i = 1 TO n
//        IF n MOD i == 0
//        PRINT i
//        END IF
//        END FOR
//
//        STOP
//
//
//        ==================================================
//        JAVA 8 CODE
//        ==================================================
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
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
//        12
//
//Checking:
//        ---------
//        12 % 1  == 0  --> Factor
//12 % 2  == 0  --> Factor
//12 % 3  == 0  --> Factor
//12 % 4  == 0  --> Factor
//12 % 5  != 0  --> Not a Factor
//12 % 6  == 0  --> Factor
//12 % 7  != 0  --> Not a Factor
//12 % 8  != 0  --> Not a Factor
//12 % 9  != 0  --> Not a Factor
//12 % 10 != 0  --> Not a Factor
//12 % 11 != 0  --> Not a Factor
//12 % 12 == 0  --> Factor
//
//Output:
//        -------
//        1 2 3 4 6 12
//
//
//        ==================================================
//COMPLEXITY ANALYSIS
//==================================================
//
//Time Complexity:
//        ---------------
//O(n)
//
//Space Complexity:
//        ----------------
//O(1)
//
//
//==================================================
//OPTIMIZATION NOTE
//==================================================
//
//Instead of checking all numbers from 1 to n,
//we can check only up to sqrt(n).
//
//If i is a factor of n, then n/i is also a factor.
//
//Optimized Time Complexity:
//        -------------------------
//O(sqrt(n))
//
//Space Complexity:
//        ----------------
//O(1)
//
//
//==================================================
//QUICK REVISION
//==================================================
//
//Condition:
//        ---------
//n % i == 0
//
//If the remainder is zero, i is a factor.
//
//KEY IDEA:
//        ---------
//A factor divides the number completely without
//leaving any remainder.
//
//==================================================



package NumberBasedProblems;
import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
