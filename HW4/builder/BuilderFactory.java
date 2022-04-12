/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package builder;

import java.util.ArrayList;

public class BuilderFactory {

    public static OutcomeBuilder getOutcomeBuilder(byte builderType, ArrayList<String> specs){
        OutcomeBuilder ret = null;
        String[] name = specs.get(0).split(";");

        if (builderType == OutcomeBuilder.MATCH) {
            ret = new MatchBuilder(name[1], specs);
        } else if (builderType == OutcomeBuilder.CONTEST) {
            ret = new ContestBuilder(name[1], specs);
        } else if (builderType == OutcomeBuilder.SPEED_RACE) {
            ret = new SpeedRaceBuilder(name[1], specs);
        } else if (builderType == OutcomeBuilder.TOURNAMENT) {
            ret = new TournamentBuilder(name[1], specs);
        }

        return ret;
    }
}