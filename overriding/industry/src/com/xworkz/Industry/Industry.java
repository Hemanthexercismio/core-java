package com.xworkz.Industry;

public class Industry {
    String place;
    double income;
    boolean governmentType;

    public Industry(String place, double income, boolean governmentType)
    {
        this.place = place;
        this.income = income;
        this.governmentType = governmentType;
    }

    @Override
    public String toString() {
        return "Place : " + place + " ,Income : " + income + " ,GovernmentType : " + governmentType;
    }

    @Override
    public boolean equals(Object obj)
    {
        Industry current = this;
        if(obj instanceof Industry)
        {
            Industry other = (Industry)obj;
            if(current.place == other.place &&
                    current.income == other.income &&
                    current.governmentType == other.governmentType)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
