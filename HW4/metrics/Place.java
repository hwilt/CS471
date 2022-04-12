/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package metrics;

public class Place extends Metrics {
    private String _name;
    private String _Place;

    public Place(String name, String Place){
        _name = name;
        _Place = Place;
    }

    public String toString(){
        return "Place " + _Place + ": " + _name;
    }
}