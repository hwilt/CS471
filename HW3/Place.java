/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

public class Place extends Metrics{

    private int _place;

    /**
     * Place's Constructor
     * 
     * @param place int
     * @param type String
     */
    public Place(int place, String type) {
        super(type);
        this._place = place;
    }

    /**
     * Place's toString method
     * Formatted as "Place: 1st" or "Place: 2nd"
     * 
     * @return String representation of the place
     */
    public String toString(){
        return "Place: " + _place;
    }

}