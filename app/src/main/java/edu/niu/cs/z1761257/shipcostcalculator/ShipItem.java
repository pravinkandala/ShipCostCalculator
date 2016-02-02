package edu.niu.cs.z1761257.shipcostcalculator;

/**
 * Created by Pravin on 2/2/16.
 */
public class ShipItem {
    //Constants
    static final Double BASE_AMOUNT = 3.00;
    static final Double ADDED_AMOUNT = 0.50;
    static final int BASE_WEIGHT = 16;
    static final double EXTRA_OUNCES = 4.0;

    //instances variables -- data members
    private Integer weight;
    private Double baseCost, addedCost, totalCost;

    //default Constructor
    public ShipItem(){
        weight = 0;
        baseCost = BASE_AMOUNT;
        addedCost = 0.0;
        totalCost = 0.0;
    } //end of constructor

    //access method
    public void setWeight(int newWeight){
        weight = newWeight;
        computeCost();
    }//end of setWeight access method

    //method for computeCost
    public void computeCost(){
        addedCost = 0.0;
        baseCost = BASE_AMOUNT;

        if( weight <=  0 )
            baseCost = 0.00;
        else if(weight > BASE_WEIGHT)
            addedCost = Math.ceil((double)(weight - BASE_WEIGHT)/EXTRA_OUNCES)*ADDED_AMOUNT;

        totalCost = baseCost + addedCost;

    }//end of computeCost method

    public Double getBaseCost() {
        return baseCost;
    }

    public Double getAddedCost() {
        return addedCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }


}//end of ShipItem class


