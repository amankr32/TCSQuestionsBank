//
//        ==================================================
//        ARMSTRONG NUMBER
//        ==================================================
//
//        Problem:
//        --------
//        Given a number n, check whether it is an
//        Armstrong Number.
//
//        Definition:
//        -----------
//        A number is called an Armstrong Number if the sum
//        of its digits raised to the power of the total
//        number of digits is equal to the original number.
//
//        Formula:
//        --------
//        Sum = (digit1)^digits + (digit2)^digits + ...
//
//        If Sum == Number, it is an Armstrong Number.
//
//
//        ==================================================
//        EXAMPLES
//        ==================================================
//
//        Number = 153
//
//        Number of Digits = 3
//
//        Calculation:
//        -----------
//        1^3 + 5^3 + 3^3
//        = 1 + 125 + 27
//        = 153
//
//        Since Sum == Number,
//        153 is an Armstrong Number.
//
//
//        Other Examples:
//        ---------------
//        0, 1, 153, 370, 371, 407, 1634
//
//
//        ==================================================
//        APPROACH
//        ==================================================
//
//        1. Take the number n as input.
//        2. Store the original number in temp.
//        3. Count the total number of digits.
//        4. Extract each digit using n % 10.
//        5. Raise each digit to the power of digit count.
//        6. Add the result to sum.
//        7. Remove the last digit using n / 10.
//        8. Compare sum with the original number.
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
//        digits = 0
//        sum = 0
//        dummy = n
//
//        WHILE dummy > 0
//        digits = digits + 1
//        dummy = dummy / 10
//        END WHILE
//
//        temp = n
//
//        WHILE temp > 0
//        digit = temp MOD 10
//        sum = sum + digit^digits
//        temp = temp / 10
//        END WHILE
//
//        IF sum == n
//        PRINT "Armstrong Number"
//        ELSE
//        PRINT "Not an Armstrong Number"
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
//        int digits = 0;
//        int sum = 0;
//        int dummy = n;
//
//        // Count digits
//        while (dummy > 0) {
//            digits++;
//            dummy /= 10;
//        }
//
//        int temp = n;
//
//        // Calculate sum of digits raised to digit count
//        while (temp > 0) {
//            int digit = temp % 10;
//            sum += (int) Math.pow(digit, digits);
//            temp /= 10;
//        }
//
//        if (sum == n) {
//            System.out.println("Armstrong Number");
//        } else {
//            System.out.println("Not an Armstrong Number");
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
//        153
//
//Digit Count:
//        ------------
//digits = 3
//
//Extracting Digits:
//        ------------------
//        153 % 10 = 3
//        15  % 10 = 5
//        1   % 10 = 1
//
//Calculation:
//        -----------
//sum = 3^3 + 5^3 + 1^3
//sum = 27 + 125 + 1
//sum = 153
//
//Condition:
//        ---------
//sum == n  --> TRUE
//
//Output:
//        -------
//Armstrong Number
//
//
//==================================================
//COMPLEXITY ANALYSIS
//==================================================
//
//Let d = number of digits.
//
//Time Complexity:
//        ---------------
//O(d)
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
//Digit Extraction:
//        ----------------
//digit = n % 10
//
//Remove Last Digit:
//        -----------------
//n = n / 10
//
//Count Digits:
//        -------------
//digits++
//
//Armstrong Condition:
//        -------------------
//sum == original number
//
//KEY IDEA:
//        ---------
//Raise every digit to the power of the total
//number of digits, then compare the sum with
//the original number.
//
//==================================================



package NumberBasedProblems;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int original = num;
        int temp  = num;
        int digits = 0;
        int sum = 0;

        // Find the digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Handle Zero
        if (digits == 0) {
            digits = 1;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        input.close();
    }
}
