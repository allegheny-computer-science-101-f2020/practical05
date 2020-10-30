package practicalfive.experiment;

import practicalfive.computation.ArithmeticComputation;
import practicalfive.data.ResultsTable;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Janyl Jumadinova
 */

public interface Campaign {

  /** Require that any Campaign implementer can run an ArithmeticComputation in an experiment. */
  public ResultsTable run(ArithmeticComputation computation, int campaignLength);

}
