/**
 * 
 */
package occ.cs272.h03;

import java.io.*;
import java.util.*;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 25, 2019
 */
public class CheapScraper2CSV {

	public static void main(String[] args) {
		
		System.out.println("Command Line Args: ");
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
				
		Scanner in = null;
		PrintWriter out = null;
		
		try {
			int columns = Integer.parseInt(args[1]);
			String inputFileName = args[2];
			String outputFileName = args[3];
			
			in = new Scanner(new File(inputFileName));
			out = new PrintWriter(outputFileName);
			if (columns == 4)
			{
				while(in.hasNextLine())
				{
					String s1 = "\"" + in.nextLine() + "\""; 
					String s2 = ",\"" + in.nextLine() + "\""; 
					String s3 = ",\"" + in.nextLine() + "\""; 
					String s4 = ",\"" + in.nextLine() + "\""; 
					out.append(s1);
					out.append(s2);
					out.append(s3);
					out.println(s4);
				}
			}
			
			in.close();
			out.close();

		} catch (Exception e)
		{
			if (e instanceof FileNotFoundException)
			{
				System.err.println("Input file not found");
			}
			else if (e instanceof NumberFormatException)
			{
				System.err.println("Please use only an integer for the second parameter");
			}
			else
			{
				System.err.println("An error has occured");
			}
		}
	}

}
