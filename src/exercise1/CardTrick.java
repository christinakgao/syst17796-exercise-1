package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @modifier Ke Xin (Christina) Gao Oct, 05, 2026
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        Random r = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            // setting a random value for the card between 1-13
            card.setValue(r.nextInt((13 - 1) + 1) + 1);
            
            // setting a random suit for the card
            card.setSuit(Card.SUITS[r.nextInt(4)]);
            
            // adding card to hand
            hand[i] = card;
        }

        System.out.println("Pick any card!");
        
        Scanner scan = new Scanner(System.in);
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
        // creating new card and assigning it value and suit based on user input
        Card guess = new Card();
        
        // prompting for suit
        System.out.print("Enter suit (Clubs/Spades/Diamonds/Hearts): ");
        guess.setSuit(scan.nextLine());
        
        // prompting for card value
        System.out.print("Enter card value (1-13): ");
        guess.setValue(scan.nextInt());
          
        scan.close();
        
        int counter = 1;
        
        // looping through each card in hand to check for value & suit match
        for (Card c : hand) {
            if (c.getValue() == guess.getValue() && c.getSuit().equals(guess.getSuit())) {
                printInfo();
            } else {
                System.out.printf("Card %d is not a match.\n", counter);
            }
            counter++;
            
        }
        
        // end
        System.out.println("End of game.");
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @modifier Ke Xin (Christina) Gao Oct 2026
     */
    private static void printInfo() {
        
        // "I'm done!"
        // final version
        
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ke Xin, but I prefer to be called Christina. (:");

        System.out.println("My hobbies are:");
        System.out.println("-- Playing video games");
        System.out.println("-- Cooking");
        System.out.println("-- Watching crime/mystery TV shows/movies");
        System.out.println("-- Fashion and clothing design");
        System.out.println();

        System.out.println("I'm a forgetful person, so I have to redo the fetch and merge part of the assignment because I forgot to add something.");
        System.out.println("Whoops. /:");
        System.out.println();
        
    
    }

}
