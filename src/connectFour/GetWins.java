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
public class GetWins {
    
    public static int [] sortScores ( int [ ] num )
{ 
     int i, j, temp;  
     for ( i = 0; i < num.length - 1; i ++ )  
     {
          for ( j = i + 1; j < num.length; j ++ )
          {
               if( num[ i ] < num[ j ] )         //sorting into descending order
               {
                       temp = num[ i ];   //swapping
                       num[ i ] = num[ j ];
                       num[ j ] = temp; 
                }           
          }
     }
     return num;
}
}
        