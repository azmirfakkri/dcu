import java.util.Random;

public class VotingMachine {

    // method to randomize a number, only positive
    public static int voteRandomizer() {

        // create instance of Random class
        Random randomizer = new Random();

        // generate random integers
        return randomizer.nextInt(100000);
    }

    // method to compare number of votes - which party wins (win or draw)
    public static void voteCounter(int[] votes) {
        int partyAvote = votes[0];
        int partyBvote = votes[1];

        if (partyAvote > partyBvote) {
            System.out.println("Party A wins!");
        }
        else if (partyBvote > partyAvote) {
            System.out.println("Party B wins!");
        }
        else {
            System.out.println("It's a draw!");
        }
    }

    // method to clear votes array
    public static int[] clearVotes(int[] votes) {
        return null;
    }
}
