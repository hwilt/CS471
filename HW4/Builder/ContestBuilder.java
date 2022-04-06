/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package Builder;

import Metrics.*;

public class ContestBuilder extends OutcomeBuilder{

    public ContestBuilder(String name) {
        super(name);
    }

    public void addMetrics(){
        _outcome.addMetricItem(new Winner());
        _outcome.addMetricItem(new Score());
        _outcome.addMetricItem(new Loser());
        _outcome.addMetricItem(new Score());
    }
}