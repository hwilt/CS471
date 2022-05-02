package Vessel;
/*
 * A Very Good STudent
 * Project 1
 * 275 Prof Schilling
 * 10/2/2020
 */

/**
 *
 * 
 */
public class SodaCan extends Vessel {
    private double radius;
    private double height;
    /**
     * constructor SodaCan initializes dimensions of can, calculates can capacity, initializes id and count
     */
    public SodaCan(double radius, double height){
        this.radius = radius;
        this.height = height;
        this._capacity = (Math.PI * radius * radius * height);
        this._id = this._count;
        this._count++;
    }  
    /**
     * override the toString() method
     */
    public String toString(){
        String toReturn = String.format("id: %d \ncapcity: %.3f \nfillLevel: %.3f", _id, _capacity, _fillLevel);
        return toReturn;
    }  
}
