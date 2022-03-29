/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

public class Win extends Metrics{

    private boolean _win;

    /**
     * Win's Constructor
     * 
     * @param win boolean
     * @param type String
     */
    public Win(boolean win, String type) {
        super(type);
        this._win = win;
    }

    /**
     * Win's toString method
     * Formatted as "Win: true" or "Win: false"
     * 
     * @return String representation of the win
     */
    public String toString(){
        return "Win: " + _win;
    }

}