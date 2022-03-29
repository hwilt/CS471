/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

public class Metrics {
    
    private String _type;

    /**
     * Metrics's Constructor
     * 
     * @param type String
     */
    public Metrics(String type){
        this._type = type;
    }


    public String getType(){
        return _type;
    }
    
    /**
     * Metrics's toString method
     * Formatted as "Type: <type>"
     * 
     * @return String representation of the Metrics
     */
    public String toString(){
        return "Type: " + _type;
    }
}