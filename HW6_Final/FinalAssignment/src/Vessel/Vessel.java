package Vessel;
/*
 * A Very Good Student
 * Project 1
 * 275 Prof Schilling
 * 10/2/2020
 */

/**
 *
 * 
 * capacity computed in sub class
 * initialize fillLevel to zero because vessels start out empty
 * id determined in sub class related to count
 * count starts off at zero
 */
public abstract class Vessel implements Fillable {
    protected double _capacity;
    protected double _fillLevel = 0;
    protected int _id;
    protected static int _count = 0;
/**
 *  getCapacity() returns maximum amount the class can hold
 */
    public double getCapacity(){
        return _capacity;
    }
/**
 *  getFillLevel() returns current amount the class is holding
 */
    public double getFillLevel(){
        return _fillLevel;
    }
/**
 *  boolean isFull() returns true if fill level is the same as the capacity
 */
    public boolean isFull(){
        return (_fillLevel == _capacity);
    }
/**
 *  boolean isEmpty() returns true if the vessel does not contain anything 
 */
    public boolean isEmpty(){
        return (_fillLevel == 0);
    }
/**
 *  double addFill(double amount) adds amount  to the fill level of the class
 *  returns any amount that does not fit in the class 
 *  if there is no overflow, returns zero
 */
    public double addFill(double amount){
        double toReturn = 0;
        if(amount <= (_capacity-_fillLevel) ){
            _fillLevel = _fillLevel + amount;
        }
        else{
            toReturn = (_fillLevel + amount) - _capacity;
            _fillLevel = _capacity;
        }
        return toReturn;
    }
/**
 * double pourOut(double amount) removes the amount from the vessel
 * returns overflow if amount is greater than whats in the vessel
 */
    public double pourOut(double amount){
        double toReturn = 0;
        if(amount <= _fillLevel){
            _fillLevel = _fillLevel - amount;
        }
        else{
            toReturn = amount - _fillLevel;
            _fillLevel = 0;
        }
        return toReturn;
    }
}
