/****************************************************************************
 *
 * Created by: Teddy Sannan
 * Created on: February 2019
 * Created for: ICS4U
 * This program tells the user the height of a foot board, given its length
 * and width
 *
 ****************************************************************************/

import java.util.Scanner;

public class HardFootBoardCalc
{

    public static void main(String[] arg)
    {
        Scanner userInput = new Scanner(System.in);
        String dimension1;
        String dimension2;
        double dimension3;
        String userChoice;
        boolean isValidInput = false;

        System.out.printf("Enter the first dimension (length, width, or height) : ");
        dimension1 = userInput.nextLine();
        isValidInput = isNumeric(dimension1);

        // Checks if user input is a valid input
        if(isValidInput == false)
        {
            System.out.printf("Error : Invalid input! %n");
            System.exit(0);
        }

        System.out.printf("Enter the second dimension (length, width, or height) : ");
        dimension2 = userInput.nextLine();
        isValidInput = isNumeric(dimension2);

        if(isValidInput == false)
        {
            System.out.printf("Error : Invalid input! %n");
            System.exit(0);
        }

        dimension3 = FootBoard(dimension1, dimension2);

        // Checks if answer is valid
        if (dimension3 <= 0)
        {
             System.out.printf("Error : Invalid input! %n");
        }
        else
        {
            System.out.printf("\nThe 3rd dimension of the board is %f inches %n", dimension3);
        }
    }

    public static double FootBoard(String measure1, String measure2)
    {
            double measure3;

            // Converts strings into doubles
            double dimension1 = Double.parseDouble(measure1);
            double dimension2 = Double.parseDouble(measure2);

            // Calculates height
            measure3 = FootBoard(dimension1, dimension2);

            return measure3;
    }

    public static double FootBoard(double measure1, double measure2)
    {
            double measure3;
            double VOLUME;

            // Checks if measurements are valid
            if (measure1 <= 0 || measure2 <= 0)
            {
                return -1.0;
            }

            else
            {
                // Calculates height
                VOLUME = 144.0;
                measure3 = (VOLUME / measure1) / measure2;

                return measure3;
            }
    }

    public static boolean isNumeric(String str)
    {   // Checks if string is a valid number
        try
        {
            double d = Double.parseDouble(str);
            if (d > 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

}