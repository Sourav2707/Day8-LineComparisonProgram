package com.day8_line_comparison;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        double lengthOfline1, lengthOfline2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
        lengthOfline1=getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
        System.out.println(" enter values for x1,y1 and x2,y2 of line 2");
        lengthOfline2=getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
        System.out.println("Length of line1 = "+lengthOfline1);
        System.out.println("Length of line2 = "+lengthOfline2);
        double l1 = lengthOfline1;
        double l2 = lengthOfline2;
        if (l1 > l2) {
            System.out.println("line 1 is greater than line 2");
        }else if (l1 < l2) {
            System.out.println("line 1 is smaller than line 2");
        }else
            System.out.println("both Lines are equal");
    }
    static double getLength(double x1, double y1, double x2, double y2) {
        return (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}
