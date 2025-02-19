package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		String firstColor;
		Scanner in = new Scanner(System.in);
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(0,1);
		StdDraw.setYscale(0,1);
		
		
		//StdDraw.show();
		
		 StdDraw.setScale(-2.0, +2.0);
		   StdDraw.enableDoubleBuffering();

		   for (double t = 0.0; true; t += 0.02) {
			   
		       double x = Math.sin(t);
		       double y = Math.cos(t);
		       StdDraw.clear();
		       
		       StdDraw.setPenColor(new java.awt.Color(153, 102, 0));
			   StdDraw.filledRectangle(0, 0, 0.5, 0.5);
			   StdDraw.setPenColor(new java.awt.Color(51, 204, 255));
			   StdDraw.filledEllipse(0, 0, 0.5, 0.5);
			   StdDraw.setPenColor(0, 0, 0);
		       StdDraw.filledCircle(x, y, 0.1);
		       StdDraw.filledCircle(-x, -y, 0.1);
		       StdDraw.show();
		       StdDraw.pause(20);
		   }
		
		//firstColor = in.next();
		//StdDraw.show();
	}
}