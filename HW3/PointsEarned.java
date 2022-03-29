/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

public class PointsEarned extends Metrics{

    private int _points;

    /**
     * PointsEarned's Constructor
     * 
     * @param points int
     * @param type String
     */
    public PointsEarned(int points, String type) {
        super(type);
        this._points = points;
    }

    /**
     * PointsEarned's toString method
     * Formatted as "Points: 10"
     * 
     * @return String representation of the points
     */
    public String toString(){
        return "Points Earned: " + _points;
    }

}