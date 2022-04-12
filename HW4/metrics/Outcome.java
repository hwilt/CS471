/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

import java.util.ArrayList;

public class Outcome{
    private String _name;
    private ArrayList<Metrics> _metrics = new ArrayList<Metrics>();

    public Outcome(String name){
        _name = name;
    }

    public void addMetric(Metrics metric){
        _metrics.add(metric);
    }

    public ArrayList<Metrics> getMetrics(){
        ArrayList<Metrics> ret = new ArrayList<Metrics>(_metrics);
        return ret;
    }

    public String toString(){
        String ret = _name + ": ";
        for(Metrics m : _metrics){
            ret += m.toString() + ", ";
        }
        return ret;
    }
}