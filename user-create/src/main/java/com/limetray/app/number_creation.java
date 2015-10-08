package com.limetray.app;
import java.util.Random;

 
public class number_creation {
		
	public static String numComplete;
 public static void main (String args[])
 {
	 	mobile_number_generating();	
}
 public static String mobile_number_generating ()
 {
	 try
 	 {
        String numStart = "8";
        String numRemainder;
        String sd3, sd4, sd5, sd6, sd7, sd8, sd9, sd10, sd11;
 
        Random rand = new Random();
 
        int d3 = rand.nextInt(10);
        int d4 = rand.nextInt(10);
        int d5 = rand.nextInt(10);
        int d6 = rand.nextInt(10);
        int d7 = rand.nextInt(10);
        int d8 = rand.nextInt(10);
        int d9 = rand.nextInt(10);
        int d10 = rand.nextInt(10);
        int d11 = rand.nextInt(10);
 
        sd3 = Integer.toString(d3);
        sd4 = Integer.toString(d4);
        sd5 = Integer.toString(d5);
        sd6 = Integer.toString(d6);
        sd7 = Integer.toString(d7);
        sd8 = Integer.toString(d8);
        sd9 = Integer.toString(d9);
        sd10 = Integer.toString(d10);
        sd11 = Integer.toString(d11);
 
        numRemainder= ""+sd3+""+sd4+""+sd5+""+sd6+""+sd7+""+sd8+""
                +sd9+""+sd10+""+sd11+"";
      //  System.out.println(numRemainder);
        numComplete = ""+numStart+""+numRemainder+"";
 
 //       System.out.println(numComplete);
         }catch(Exception e){}
	return numComplete;
  }

	 
 }
	

	
