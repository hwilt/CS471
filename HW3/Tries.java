/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

public class Tries extends Metrics{

    private int _tries;

    /**
     * Tries's Constructor
     * 
     * @param tries int
     * @param type String
     */
    public Tries(int tries, String type) {
        super(type);
        this._tries = tries;
    }

    /**
     * Tries's toString method
     * Formatted as "Tries: 10"
     * 
     * @return String representation of the tries
     */
    public String toString(){
        return "Tries: " + _tries;
    }

}