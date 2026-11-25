//
//        ==================================================
//        EVEN OR ODD NUMBER
//        ==================================================
//
//        Problem:
//        --------
//        Given an integer n, check whether the number
//        is Even or Odd.
//
//        Definition:
//        -----------
//        Even Number:
//        A number that is completely divisible by 2.
//
//        Odd Number:
//        A number that is not completely divisible by 2.
//
//        Examples:
//        ---------
//        Even:  2, 4, 6, 8, 10
//        Odd:   1, 3, 5, 7, 9
//
//
//        ==================================================
//        APPROACH
//        ==================================================
//
//        1. Take an integer n as input.
//        2. Check whether n % 2 == 0.
//        3. If true, the number is Even.
//        4. Otherwise, the number is Odd.
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
//        IF n MOD 2 == 0
//        PRINT "Even Number"
//        ELSE
//        PRINT "Odd Number"
//        END IF
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
//        if (n % 2 == 0) {
//            System.out.println("Even Number");
//        } else {
//            System.out.println("Odd Number");
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
//        8
//
//Condition:
//        ----------
//        8 % 2 == 0
//
//Result:
//        -------
//TRUE
//
//Output:
//        -------
//Even Number
//
//
//==================================================
//COMPLEXITY ANALYSIS
//==================================================
//
//Time Complexity:
//        ---------------
//O(1)
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
//n % 2 == 0  --> Even
//n % 2 != 0  --> Odd
//
//KEY IDEA:
//        ---------
//If a number is divisible by 2 without leaving
//        a remainder, it is an Even Number.
//
//        ==================================================



package NumberBasedProblems;
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
