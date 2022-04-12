/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package builder;

import metrics.*;
import java.util.ArrayList;

public class SpeedRaceBuilder extends OutcomeBuilder{

    public static final int PLACE = 1;
    public static final int TIME = 2;

    public SpeedRaceBuilder(String name, ArrayList<String> specs){
        super(name, specs);
    }

    public void addMetrics(){
        String[] place = _specs.get(PLACE).split(","); // split the string as comma separated, ie Name,Place
        _outcome.addMetric(new Place(place[0], place[1]));
        _outcome.addMetric(new Time(_specs.get(TIME)));
        int numOfRacers = (_specs.size() - 2) / 2;
        addRacer(numOfRacers);
    }

    private void addRacer(int numOfRacers){
        int racerNum = PLACE;
        int timeNum = TIME;
        for(int i = 0; i < numOfRacers; i++){
            racerNum += 2;
            timeNum += 2;
            String[] place = _specs.get(racerNum).split(","); // split the string as comma separated, ie Name,Place
            _outcome.addMetric(new Place(place[0], place[1]));
            _outcome.addMetric(new Time(_specs.get(timeNum)));
        }
        
    }
}