/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

public class Seed extends Metrics {
        
    private String _seed;

    public Seed(String seed) {
        _seed = seed;
    }
    
    public String toString() {
        return "Seed: " + _seed;
    }
}