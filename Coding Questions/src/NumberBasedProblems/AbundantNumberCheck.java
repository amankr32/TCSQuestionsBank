//
//        ==================================================
//        ABUNDANT NUMBER
//        ==================================================
//
//        Problem:
//        --------
//        Given a positive integer n, determine whether it is
//        an Abundant Number.
//
//        Definition:
//        -----------
//        A number is called an Abundant Number if the sum
//        of its proper divisors is greater than the number
//        itself.
//
//        Proper Divisors:
//        -----------------
//        Divisors excluding the number itself.
//
//        Example:
//        --------
//        Number = 12
//
//        Proper Divisors:
//        1, 2, 3, 4, 6
//
//        Sum = 1 + 2 + 3 + 4 + 6
//        Sum = 16
//
//        Since 16 > 12,
//        12 is an Abundant Number.
//
//
//        ==================================================
//        APPROACH
//        ==================================================
//
//        1. Initialize sum = 0.
//        2. Loop from i = 1 to i < n.
//        3. If n % i == 0, add i to sum.
//        4. If sum > n, the number is abundant.
//        5. Otherwise, it is not abundant.
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
//        sum = 0
//
//        FOR i = 1 TO n - 1
//        IF n % i == 0
//        sum = sum + i
//        END IF
//        END FOR
//
//        IF sum > n
//        PRINT "Abundant Number"
//        ELSE
//        PRINT "Not an Abundant Number"
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
//        int number = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//                sum += i;
//            }
//        }
//
//        if (sum > number) {
//            System.out.println("Abundant Number");
//        } else {
//            System.out.println("Not an Abundant Number");
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
//Divisors:
//        ---------
//        1, 2, 3, 4, 6
//
//Calculation:
//        -----------
//sum = 1 + 2 + 3 + 4 + 6
//sum = 16
//
//Condition:
//        ---------
//        16 > 12  --> TRUE
//
//Output:
//        -------
//Abundant Number
//
//
//==================================================
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
//Instead of checking all numbers from 1 to n-1,
//we can check divisors only up to sqrt(n).
//
//Every divisor i has a corresponding divisor n/i.
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
//Abundant Number:
//Sum of proper divisors > Number
//
//Perfect Number:
//Sum of proper divisors = Number
//
//Deficient Number:
//Sum of proper divisors < Number
//
//KEY CONDITION:
//        --------------
//sum > number
//
//==================================================


package NumberBasedProblems;
import java.util.*;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;
         for (int i = 1; i < number; i++) {
             if (number % i == 0) {
                 sum += i;
             }
         }

         if (sum > number) {
             System.out.println("The number " + number + " is abundant");
         } else {
             System.out.println("The number " + number + " is not abundant");
         }
         input.close();
    }
}
