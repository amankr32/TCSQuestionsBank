//        ============================================================
//        FACTORIAL OF A NUMBER
//        ============================================================
//
//        1. PROBLEM STATEMENT
//        -------------------
//        Write a Java program to calculate the factorial of a given
//        number using a while loop.
//
//        2. DEFINITION
//        ------------
//        Factorial of a number is the product of all positive
//        integers from 1 to that number.
//
//        Factorial is represented by n!
//
//        Formula:
//        n! = n * (n-1) * (n-2) * ... * 1
//
//        Special Case:
//        0! = 1
//
//        Examples:
//        5! = 5 * 4 * 3 * 2 * 1 = 120
//        4! = 4 * 3 * 2 * 1 = 24
//        3! = 3 * 2 * 1 = 6
//        1! = 1
//        0! = 1
//
//        3. APPROACH
//        -----------
//        1. Take an integer n as input.
//        2. Initialize prod = 1.
//        3. Run a while loop while n > 0.
//        4. Multiply prod by n.
//        5. Decrease n by 1.
//        6. Print the factorial stored in prod.
//
//        4. PSEUDOCODE
//        -------------
//        START
//        INPUT n
//        prod = 1
//
//        WHILE n > 0
//        prod = prod * n
//        n = n - 1
//        END WHILE
//
//        PRINT prod
//        END
//
//        5. JAVA CODE (TCS FORMAT)
//        -------------------------
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int prod = 1;
//
//        while (n > 0) {
//            prod *= n;
//            n--;
//        }
//
//        System.out.println(prod);
//        sc.close();
//    }
//}
//
//6. DRY RUN
//-----------
//Input:
//        5
//
//Initial:
//n = 5
//prod = 1
//
//Iteration 1:
//prod = 1 * 5 = 5
//n = 4
//
//Iteration 2:
//prod = 5 * 4 = 20
//n = 3
//
//Iteration 3:
//prod = 20 * 3 = 60
//n = 2
//
//Iteration 4:
//prod = 60 * 2 = 120
//n = 1
//
//Iteration 5:
//prod = 120 * 1 = 120
//n = 0
//
//Output:
//        120
//
//        7. TIME AND SPACE COMPLEXITY
//----------------------------
//Time Complexity:
//O(n) - The loop runs n times.
//
//Space Complexity:
//O(1) - Only a few variables are used.
//
//        8. QUICK REVISION
//-----------------
//Factorial:
//n! = n * (n-1) * ... * 1
//
//Initialize:
//prod = 1
//
//Loop:
//        while (n > 0)
//
//Update:
//prod *= n;
//n--;
//
//Special Case:
//        0! = 1
//
//Time Complexity: O(n)
//Space Complexity: O(1)
//============================================================


package NumberBasedProblems;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int fact = 1;
        while (number > 0){
            fact *= number;
            number--;
        }
        System.out.println(fact);

        input.close();
    }
}
