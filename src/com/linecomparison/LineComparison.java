package com.linecomparison;
import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line length computation");
        System.out.println("Enter coordinate of first line :");
        double lengthOfLine1 = getLength();
        System.out.println(lengthOfLine1);
        System.out.println("Enter coordinate of second line");
        double lengthOfLine2 = getLength();
        System.out.println(lengthOfLine2);
        fullComparison(lengthOfLine1,lengthOfLine2);
    }

    static double getLength () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate : ");
        double x1 = sc.nextDouble();
        System.out.println("Enter y-coordinate : ");
        double y1 = sc.nextDouble();
        System.out.println("Enter x-coordinate : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y-coordinate : ");
        double y2 = sc.nextDouble();
        double Line_Length = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return Line_Length;
    }

    static void fullComparison (double line1,double line2) {
        if (Objects.equals(line1, line2)) {
            System.out.println("Both lines are equal");
        }
        else if (line1>line2) {
            System.out.println("Line1 is larger");
        }
        else {
            System.out.println("Line2 second is larger");
        }
    }
}