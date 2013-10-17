/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectFour;

/**
 *
 * @author Noble
 */
public class welcomeScreen {
    
}

welcomeScreen() {

    var string "name"
    var long "age"
    
    System.out.println("Hello and welcome to Connect Four! The objective of this game is" /n
"to drop your playing pieces down the different slots to place them on the board" /n
"trying to outwit your opponent in the attempt to get four pieces lined in a row" /n
"Either horizontaly, verticaly, or diagonly. As long as you've connected four" /n
"YOU WIN!")


    Scanner scanner = new Scanner (System.in);
System.out.println("Enter Your Name");  
name = scanner.next(); //Gets the age the user types in.//
    
Scanner reader = new Scanner(System.in);
System.out.println("Enter Your Age");
//Gets user's input for age.//
a=reader.nextInt();   

    //Something is wrong with the java class and I'm not sure how to fix this//
//certain bug.//

if (name = 0); {
    System.out.println("Error Please enter your name using the alphabet.");

if (name = nobleTheDestroyerOfWorldsAndHope);
    System.out.println("Error Please limit user name to 20 characters please.");

if (age = -2); 
    age * -1 //Turns negative age to positive.
    System.out.println("Error Please enter your age using only positive numbers.");

if (age = abc); 
    System.out.println("Error Please use a numerical value for your age.");

}
    else;
        System.out.println() name;
        System.out.println() age;
        
//So, I'm figuring out how to get a running list of players from youngest to oldest.//

  if (age = < youngestPlayer); {
    age - 1 
    //age moves under youngestPlayer in ranking//

  if (age = >= youngestPlayer); 
    age == current age 
    //age moves over youngestPlayer and is placed in ranking//
}
    else;
        System.out.println() rankingList;

        return mainMenu;
}


