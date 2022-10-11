/**
 * Name:
 * Mrs. Kankelborg
 * Period 
 * Problem Set 2 - Exploring Standard Draw
 * Last Revised On:
 *    
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StdDrawPractice
{
	public static void america()
    {
        //create a Buffered Reader for the input file 
        File f = new File("./input/usa.txt");
        FileReader fr;
        BufferedReader br;
		try 
		{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			//reads the starting coords then turns them into a double array
			String[] coordsStr = br.readLine().split(" ");
			double[] coords = new double[coordsStr.length];
			for(int i = 0; i < coordsStr.length; i ++)
				coords[i] = Double.parseDouble(coordsStr[i]);
			
			//finds how much larger the width is than the height and multiplies the width by it
			double mult = (coords[2]-coords[0])/(coords[3] - coords[1]);
			StdDraw.setCanvasSize((int)(512*mult), 512);;
			
			//sets the scale
			StdDraw.setXscale(coords[0], coords[2]);
			StdDraw.setYscale(coords[1], coords[3]);
			StdDraw.setPenRadius(0.005);
			
			//for speed of application wait to display the image until the program is complete.
	        StdDraw.enableDoubleBuffering();
	        
	        //there isn't an integer to tell us how many lines of code exist,
	        //so you should first check if there is still a line in existence
	        //revisit BufferedReader's documentation to discover how to see if there is still text
	        //remaining
			String line = br.readLine();
			String[] coordTempStr = new String[2];
			double[] coordTemp = new double[2];
			while(line != null)
			{
				coordTempStr = line.split("   ");
				for(int j = 0; j < 2; j++)
					coordTemp[j] = Double.parseDouble(coordTempStr[j]);
				StdDraw.point(coordTemp[0], coordTemp[1]);
				line = br.readLine();
			}
			// Since doubleBuffering was enabled, call StdDraw.show() at the end to view your map.
			StdDraw.show();
			fr.close();
			br.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
    }

    public static void web(int n, double p)
    {
    	//sets the scale
    	StdDraw.setXscale(-1.5, 1.5);
    	StdDraw.setYscale(-1.5, 1.5);
    	StdDraw.setPenRadius(0.01);
    	//draws points in a circle
    	for(double t = 0.0; t <= 2*Math.PI; t += 2*Math.PI/n) 
    	{
    		double x = Math.sin(t);
    	    double y = Math.cos(t);
    	    StdDraw.point(x,y);
    	    //for each point on the circle, draws a line to another point w/ probability p
    	    for(double t2 = t; t2 <= 2*Math.PI; t2 += 2*Math.PI/n) 
        	{
    	    	StdDraw.setPenRadius(0.001);
    	    	double x2 = Math.sin(t2);
        	    double y2 = Math.cos(t2);
	    	    if(Math.random() < p)
	    		{
	    			StdDraw.line(x, y, x2, y2);
	    		}
        	}
    	    StdDraw.setPenRadius(0.01);
    	}
    }

    public static void checkerboard(int n)
    {
    	double size = 1.0/n;
    	//draws n columns
    	for(double j = 0; j <= 1.0; j+=(2*size))
    	{
	    	//every other box is red
    		for(double i = 0; i <= 1.0; i+=(2*size))
	    	{
	    		StdDraw.setPenColor(StdDraw.RED);
	    		StdDraw.filledSquare(i+(size/2),j+(size/2),size/2);
	    	}
    		for(double i = size; i <= 1.0; i+=(2*size))
	    	{
	    		StdDraw.setPenColor(StdDraw.RED);
	    		StdDraw.filledSquare(i+(size/2),j-(size/2),size/2);
	    	}
    		//every other box is black
    		for(double i = 0; i <= 1.0; i+=(2*size))
	    	{
	    		StdDraw.setPenColor(StdDraw.BLACK);
	    		StdDraw.filledSquare(i+(size/2),j-(size/2),size/2);
	    	}
    		for(double i = size; i <= 1.0; i+=(2*size))
	    	{
	    		StdDraw.setPenColor(StdDraw.BLACK);
	    		StdDraw.filledSquare(i+(size/2),j+(size/2),size/2);
	    	}
    	}
    }
    public static void rose(int n)
    {
    	//sets the scale
    	StdDraw.setXscale(-1.5, 1.5);
    	StdDraw.setYscale(-1.5, 1.5);
    	StdDraw.setPenRadius(0.005);
    	StdDraw.enableDoubleBuffering();
    	for(double i = 0; i < 2*Math.PI; i+= 0.001)
    	{
    		StdDraw.point(Math.cos(n*i)*Math.cos(i), Math.cos(n*i)*Math.sin(i));
    		//System.out.println(Math.cos(n*i)*Math.cos(i) + " " + Math.cos(n*i)*Math.sin(i));
    		StdDraw.pause(1);
    		StdDraw.show();
    	}	
    }
    
    // This is an optional method to implement if you have time.
    public static void harmonicMotion() 
    {
        
    }
}
