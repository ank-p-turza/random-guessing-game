import javax.swing.JOptionPane;

/*
 * Random Guessing game version 1.0.01 build 0.00.00.05
 * A simple game
 * This is just a fun project
 * Created on 24 May, 2022
 * www.github.com/ank-p-turza/random-guessing-game/
 */
class RandomGuessingGame {
    public static void main(String[] args) {
        int reachedLimit = 5, score = 0, min = 0, max = 0;
        String d1, d2;
        d1 = JOptionPane.showInputDialog(null, "Enter the minimum value:", "Input minimum", JOptionPane.QUESTION_MESSAGE);
        d2 = JOptionPane.showInputDialog(null, "Enter the range of numbers next to minimum value:", "Input Range", JOptionPane.QUESTION_MESSAGE);
        min = Integer.parseInt(d1);
        max = Integer.parseInt(d2);
        // www.github.com/ank-p-turza/random-guessing-game/
        while (reachedLimit >= 0) {
            if (reachedLimit > 0) {
                int x = 1 + (int) (min + Math.random() * max);
                String x1 = JOptionPane.showInputDialog(null, "Your score is " + score + "\nYou have " + reachedLimit + " options left.\nEnter the number you guess it would be.", "Input a number", JOptionPane.QUESTION_MESSAGE);
                int x2 = Integer.parseInt(x1);
                if (x == x2) {
                    //System.out.println("The random number was "+ x);
                    score++;
                    JOptionPane.showMessageDialog(null, "The random number was " + x + "\nGuess matched.\nScore: " + score, "Guess matched", JOptionPane.PLAIN_MESSAGE);
                    //System.out.println("Your Score is: "+ score);
                    //System.out.println("Guess matched.");
                } else {
                    JOptionPane.showMessageDialog(null, "The random number was " + x + ".\nYour guess wasn't correct.", "Not matched", JOptionPane.ERROR_MESSAGE);
                    reachedLimit--;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your Score of this match is: " + score + "\nGame over", "WARNING", JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
    }
}
