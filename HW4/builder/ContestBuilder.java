/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package builder;

import metrics.*;
import java.util.ArrayList;

public class ContestBuilder extends OutcomeBuilder{

    public static final int WINNER = 1;
    public static final int SCORE_W = 2;
    public static final int LOSER = 3;
    public static final int SCORE_L = 4;

    public ContestBuilder(String name, ArrayList<String> specs) {
        super(name, specs);
    }

    public void addMetrics(){
        _outcome.addMetric(new Winner(_specs.get(WINNER)));
        _outcome.addMetric(new Score(_specs.get(SCORE_W)));
        _outcome.addMetric(new Loser(_specs.get(LOSER)));
        _outcome.addMetric(new Score(_specs.get(SCORE_L)));
    }
}