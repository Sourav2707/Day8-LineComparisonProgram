package com.day8_line_comparison;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");
        double lengthOfline;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line point x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the line point x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the line point y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the line point y2: ");
        int y2 = sc.nextInt();
        lengthOfline=(Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ));
        System.out.println("Length of line = "+lengthOfline);
    }
}
