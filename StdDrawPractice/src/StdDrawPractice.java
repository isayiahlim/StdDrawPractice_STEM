/**
 * Name:
 * Mrs. Kankelborg
 * Period 
 * Problem Set 2 - Exploring Standard Draw
 * Last Revised On:
 *    
 */

import java.io.File;

public class StdDrawPractice
{
    public static void america()
    {
        //create a Buffered Reader for the input file 
        File f = new File("./input/usa.txt");

        //parse the initial data to obtain the canvas coordinates

        //scale the width of the canvas. keep the default height of 512, and adjust the width
        //proportionally

        //adjust the coordinate system

        //for speed of application wait to display the image until the program is complete.
        StdDraw.enableDoubleBuffering();

        //there isn't an integer to tell us how many lines of code exist,
        //so you should first check if there is still a line in existence
        //revisit BufferedReader's documentation to discover how to see if there is still text
        //remaining

        // Since doubleBuffering was enabled, call StdDraw.show() at the end to view your map. 

    }

    public static void web(int n, double p)
    {
        
    }

    public static void checkerboard(int n)
    {
        
    }
    
    public static void rose(int n)
    {
        
    }
    
    // This is an optional method to implement if you have time.
    public static void harmonicMotion() 
    {
        
    }
}
