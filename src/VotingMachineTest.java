public class VotingMachineTest {

    public static void main(String[] args) {

        // for loop 3 times to do election
        for (int i = 0; i < 3; i++) {

            // get number of votes
            int partyA = VotingMachine.voteRandomizer();
            int partyB = VotingMachine.voteRandomizer();

            System.out.println("Results of election:");
            System.out.println("Party A: " + partyA + " votes");
            System.out.println("Party B: " + partyB + " votes");

            int[] votes = new int[]{partyA, partyB};

            // count votes
            VotingMachine.voteCounter(votes);

            // clear votes
            VotingMachine.clearVotes(votes);

        }
    }
}
