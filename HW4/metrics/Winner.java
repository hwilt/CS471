/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

public class Winner extends Metrics {
    private String _name;

    public Winner(String name){
        _name = name;
    }

    public String toString(){
        return "Winner: " + _name;
    }
}