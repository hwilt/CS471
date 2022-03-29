/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

public class Time extends Metrics{

    private String _time;

    /**
     * Time's Constructor
     * 
     * @param time String
     * @param type String
     */
    public Time(String time, String type) {
        super(type);
        this._time = time;
    }

    /**
     * Time's toString method
     * Formatted as "Time: 3:22.99" or "Time: 44:22.99"
     * 
     * @return String representation of the time
     */
    public String toString(){
        return "Time: " + _time;
    }

}