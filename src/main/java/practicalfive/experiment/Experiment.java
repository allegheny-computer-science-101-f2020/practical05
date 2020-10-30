package practicalfive.experiment;

import practicalfive.computation.IterativeFactorialComputation;
import practicalfive.computation.RecursiveFactorialComputation;
import practicalfive.data.ResultsTable;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds depending on the strategy. This is especially
 * helpful when the algorithms take a different amount of time or memory to run.
 * Please be especially careful for OutOfMemoryErrors that can cause one of
 * these algorithms to crash if the campaign length is too high!
 *
 * @author Add Your Name Here
 */

public class Experiment {

  /** The campaign length for the RecursiveFactorialComputation. */
  private static final int RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH = 13;

  /** The campaign length for the IterativeFactorialComputation. */
  private static final int ITERATIVE_FACTORIAL_CAMPAIGN_LENGTH = 30;

  /** Run the recursive experiment. */
  public static void runRecursiveExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFactorialComputation and run it in a campaign
    RecursiveFactorialComputation recursiveFactorial = new RecursiveFactorialComputation();
    ResultsTable recursiveFactorialResultsTable =
        runComputationCampaign.run(recursiveFactorial, RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFactorial.getName() + ":\n");
    System.out.println(recursiveFactorialResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create an IterativeFactorialComputation and run it in a campaign
    IterativeFactorialComputation iterativeFactorial = new IterativeFactorialComputation();
    ResultsTable iterativeFactorialResultsTable =
        runComputationCampaign.run(iterativeFactorial, ITERATIVE_FACTORIAL_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + iterativeFactorial.getName() + ":\n");
    System.out.println(iterativeFactorialResultsTable.toString());
    System.out.println();
  }

  /** Run the experiment campaigns for a different number of rounds. */
  public static void main(String[] args) {
    // TODO: Call the methods that will perform the two experiments
  }

}
