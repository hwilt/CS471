/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package builder;

import metrics.*;
import java.util.ArrayList;

abstract public class OutcomeBuilder {
    public static final byte MATCH = 0;
    public static final byte CONTEST = 1;
    public static final byte SPEED_RACE = 2;
    public static final byte TOURNAMENT = 3;

    protected Outcome _outcome;
    protected ArrayList<String> _specs;

    public OutcomeBuilder(String name, ArrayList<String> specs){
        _outcome = new Outcome(name);
        _specs = specs;
    }

    public abstract void addMetrics();

    public Outcome getOutcome(){
        return _outcome;
    }
}