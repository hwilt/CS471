/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

import java.util.ArrayList;

public class Outcome{
    
    private ArrayList<Metrics> _metrics;
    private String _type;

    /**
     * Outcome's Constructor
     * 
     * @param type String
     */
    public Outcome(String type){
        this._type = type;
        this._metrics = new ArrayList<Metrics>();
        
    }

    /**
     * getMetrics
     * 
     * @return ArrayList<Metrics>
     */
    public ArrayList<Metrics> getMetrics(){
        return _metrics;
    }

    /**
     * addMetric
     * 
     * @param m Metrics
     * @return void
     */
    public void addMetric(Metrics m){
        _metrics.add(m);
    }


    /**
     * Outcome's toString method
     * 
     * @return String representation of the Outcome
     */
    public String toString(){
        return _type;
    }
}