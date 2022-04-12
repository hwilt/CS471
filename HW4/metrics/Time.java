/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

public class Time extends Metrics {
    private String time;
    
    public Time(String time) {
        this.time = time;
    }
    
    public String toString() {
        return "Time: " + time;
    }
}