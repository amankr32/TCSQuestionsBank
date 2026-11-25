//
//        ==================================================
//        AREA OF A CIRCLE
//        ==================================================
//
//        Problem:
//        --------
//        Given the radius of a circle, calculate its area.
//
//        Formula:
//        --------
//        Area = π × r × r
//
//        Where:
//        ------
//        π = 3.14
//        r = Radius of the circle
//
//
//        ==================================================
//        APPROACH
//        ==================================================
//
//        1. Take the radius r as input.
//        2. Calculate area using the formula:
//        area = 3.14 * r * r
//        3. Print the calculated area.
//
//
//        ==================================================
//        PSEUDOCODE
//        ==================================================
//
//        START
//
//        INPUT r
//
//        area = 3.14 * r * r
//
//        PRINT area
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
//    static double areaOfCircle(int r) {
//        double area = 3.14 * r * r;
//        return area;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int r = sc.nextInt();
//
//        System.out.println(areaOfCircle(r));
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
//        5
//
//Calculation:
//        -----------
//area = 3.14 * 5 * 5
//area = 3.14 * 25
//area = 78.5
//
//Output:
//        -------
//        78.5
//
//
//        ==================================================
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
//Formula:
//        --------
//Area = πr²
//
//Java:
//        -----
//double area = 3.14 * r * r;
//
//KEY IDEA:
//        ---------
//The area of a circle is calculated by multiplying
//π by the square of its radius.
//
//==================================================



package NumberBasedProblems;
import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();

        double are = 3.14159 * r * r;
        System.out.println("Area of circle is: " + are);

        input.close();
    }
}
