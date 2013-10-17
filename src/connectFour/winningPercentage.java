/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

/**
 *
 * @author Noble
 */


package winningpercentage;

/**
 *
 * @author Ryan
 */
public class winningPercentage {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
      double score = 0, totalScore = 0;
      float Percentage;
      
      System.out.println("Enter Score:");
      score = input.Double();
      System.out.println("Enter Total Score:");
      totalScore = input.Double();

      Percentage = (float) ((score*100)/(totalScore));
      System.out.println("Percentage is: " + Percentage + "%");
}
}