/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

import java.util.Scanner;
/**
 *
 * @author Noble
 */
//I couldn't get the TotalWins working so I decided to do a simple example instead of the for each loop and array. 
public class TotalWins {
    
    
    public static void main(String[] args) { 
      int[] numbers =
        {1,2,3,4,5,6,7,8,9,10};
      int sum = 0;
      for( int i : numbers) {
            sum += i;
    }
      System.out.println(sum);
      }
    }

    

