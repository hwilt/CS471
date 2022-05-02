package Vessel;
/*
 * A Very Good Student
 * Project 1
 * 275 Prof Schilling
 * 10/2/2020
 */

/**
 *

 */
public class ErlenmeyerFlask extends Vessel{
    private double baseRadius;
    private double mouthRadius;
    private double totalHeight;
    private double neckHeight;
    /**
     * constructor ErlenmeyerFlask initializes dimensions of flask, calculates flask capacity, initializes id and count
     */
    public ErlenmeyerFlask(double baseRadius, double mouthRadius, double totalHeight, double neckHeight){
        this.baseRadius = baseRadius;
        this.mouthRadius = mouthRadius;
        this.totalHeight = totalHeight;
        this.neckHeight = neckHeight;
        this._capacity = (Math.PI * mouthRadius * mouthRadius * neckHeight) + ((1/3)*Math.PI*((baseRadius*baseRadius)+
                (baseRadius*mouthRadius) + (mouthRadius*mouthRadius)) * (totalHeight - neckHeight));
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
