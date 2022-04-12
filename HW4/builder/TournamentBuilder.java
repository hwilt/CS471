/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package builder;

import metrics.*;
import java.util.ArrayList;

public class TournamentBuilder extends OutcomeBuilder{

    public static final int WINNER = 1;
    public static final int SEED = 2;

    public TournamentBuilder(String name, ArrayList<String> specs) {
        super(name, specs);
    }

    public void addMetrics(){
        _outcome.addMetric(new Winner(_specs.get(WINNER)));
        _outcome.addMetric(new Seed(_specs.get(SEED)));
    }
}