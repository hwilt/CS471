/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

public class Loser extends Metrics {
    
    private String _loser;

    public Loser (String loser) {
        _loser = loser;
    }

    public String toString() {
        return "Loser: " + _loser;
    }
}