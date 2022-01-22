import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {

    private double p_graph;
    private double p_malicious;
    private double p_tXDistribution;
    private int numRounds;

    private boolean[] followees;

    private Set<Transaction> pendingTransactions;

    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
      this.p_graph = p_graph;
      this.p_malicious = p_malicious;
      this.p_tXDistribution = p_txDistribution;
      this.numRounds = numRounds;
    }

    public void setFollowees(boolean[] followees) {
        this.followees = followees;
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }

    public Set<Transaction> getProposals() {
        Set<Transaction> newTransactions = new Set<>();
        for (Transaction T : this.pendingTransactions) {
            newTransactions.add(T);
        }
        // newTransactions.addAll(this.pendingTransactions)
        return newTransactions;
    }

    public void receiveCandidates(ArrayList<Integer[]> candidates) {
        // IMPLEMENT THIS
    }
}
