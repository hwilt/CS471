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
 */
interface Fillable {
    public double getCapacity();
    public double getFillLevel();
    public boolean isFull();
    public boolean isEmpty();
    public double addFill(double a);
    public double pourOut(double a);
}
