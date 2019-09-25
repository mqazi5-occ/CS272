/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author Mohammad Usman Qazi
 * @version September 1, 2019
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "mqazi5";
    public static final String ASSIGNMENT = "H01-C";
    
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input;
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() 
    {
        //TODO Complete this method
    	double num = 0;
        switch (grade.toUpperCase())
        {
        case "A+":
        	num = 4.0;
        	break;
        case "A":
        	num = 4.0;
        	break;
        case "A-":
        	num = 3.7;
        	break;
        case "B+":
        	num = 3.3;
        	break;
        case "B":
        	num = 3.0;
        	break;
        case "B-":
        	num = 2.7;
        	break;
        case "C+":
        	num = 2.3;
        	break;
        case "C":
        	num = 2.0;
        	break;
        case "C-":
        	num = 1.7;
        	break;
        case "D+":
        	num = 1.3;
        	break;
        case "D":
        	num = 1.0;
        	break;
        case "D-":
        	num = 0.7;
        	break;
        case "F":
        	num = 0.0;
        	break;
        default: num = -1.0;
        break;
        }
        return num; 
    }
    
    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
