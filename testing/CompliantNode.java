import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {

  int numRounds;
  int round = 0;
  int num_followees;
  boolean[] followees;
  Set<Transaction> pendingTransactions;

    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
      this.numRounds = numRounds;
    }

    public void setFollowees(boolean[] followees) {
        this.followees = followees;
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }

    public Set<Transaction> getProposals() {
      return pendingTransactions;
    }

    public void receiveCandidates(ArrayList<Integer[]> candidates) {
      for(Integer[] candidate : candidates) {
         Transaction tx = new Transaction(candidate[0]);
         if(!this.pendingTransactions.contains(tx))
            this.pendingTransactions.add(tx);
      }
    }
}
