package com.linecomparison;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line length computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate of first point: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter y-coordinate of first point: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter x-coordinate of second point: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y-coordinate of second point: ");
        double y2 = sc.nextDouble();
        double Line_Length = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of line : " + Line_Length);
    }
}