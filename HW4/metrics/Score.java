/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

public class Score extends Metrics {

    private String _score;

    public Score(String score) {
        _score = score;
    }

    public String toString() {
        return "Score: " + _score;
    }
}